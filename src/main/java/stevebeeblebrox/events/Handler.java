package stevebeeblebrox.events;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.script.ScriptException;


import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.Style;

import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraftforge.event.ServerChatEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber
/**
 * The main class for the Runtime Event System
 * @author Steve B.
 */
public class Handler {
	
	//# start Init
	private static InvocableJSScriptEngine engine;
	
	static {
		try {
			 engine = new InvocableJSScriptEngine(null);
			 FileUtils.loadAllToEngine(engine, FileUtils.getJarLocation(), "js", "es", "ns");
		} catch (ScriptException | IOException e) {
			e.printStackTrace();
		}
	}
	//# stop Init
	
	//# start Registry Methods
	private static HashMap<String, ArrayList<String>> methods = new HashMap<String, ArrayList<String>>();
	
	/** 
	 * @param event - the class name of the event to listen for (in the format "package.subpackage.Class$SubClass")
	 * @param method - name of the method to call for the given event
	 */
	public static void register(String event, String method) {
		methods.putIfAbsent(event, new ArrayList<String>());
		methods.get(event).add(method);
	}

	/** 
	 * @param event - the class name of the event to stop listen for (in the format "package.subpackage.Class$SubClass")
	 * @param method - name of the method to no longer send events to
	 */
	public static void unregister(String event, String method) {if(methods.containsKey(event)) methods.get(event).remove(method);}
	//# end Registry Methods
	
	//# start Forge Event Listeners
	/**
	 * <b>Internal Event Listener - Do not call manually!</b>
	 */
	@SubscribeEvent(priority = EventPriority.HIGHEST, receiveCanceled = true)
	public static void onChat(ServerChatEvent event) {
		String message = event.getMessage();
		if(message.equalsIgnoreCase(">reload")) {
			methods.clear();
			engine = new InvocableJSScriptEngine(null);
			try {
				FileUtils.loadAllToEngine(engine, FileUtils.getJarLocation(), "js", "es", "ns");
			} catch (ScriptException | IOException e) {
				event.setComponent(new StringTextComponent("Runtime Event System: An unknown error has occurred. Check the console or log file for more details.").setStyle(new Style() {
					@Override
					public TextFormatting getColor() {
						return TextFormatting.YELLOW;
					}
				}));
				e.printStackTrace();
			}
			event.setComponent(new StringTextComponent("Runtime Event System: Reloaded script").setStyle(new Style() {
				@Override
				public TextFormatting getColor() {
					return TextFormatting.AQUA;
				}
			}));
		}
		else if (message.equalsIgnoreCase(">info") || message.equalsIgnoreCase(">about")) {
			event.setComponent(new StringTextComponent("Runtime Event System - v1.0.0-min by Steve Beeblebrox (https://stevebeeblebrox.github.io)").setStyle(new Style() {
				@Override
				public TextFormatting getColor() {
					return TextFormatting.AQUA;
				}
				@Override
				public ClickEvent getClickEvent() {
					return new ClickEvent(ClickEvent.Action.OPEN_URL, "https://stevebeeblebrox.github.io");
				}
			}));
		}
	}
	
	/**
	 * <b>Internal Event Listener - Do not call manually!</b>
	 */
	@SubscribeEvent
	public static void onEvent(Event event) {
		try {
			if(!methods.containsKey(event.getClass().getName())) return;
			for(String method : methods.get(event.getClass().getName())) engine.invokeFunction(method, event);	
		} catch (ScriptException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {/*shh*/}
	}
	//# end Forge Event Listeners
}
