package stevebeeblebrox.events;

import java.io.Reader;

import javax.script.Bindings;
import javax.script.Invocable;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * A class to act as an instance of a javax.script.ScriptEngine and javax.script.Invocable
 * @author Steve B.
 */
public class InvocableJSScriptEngine implements ScriptEngine, Invocable {

	//# start Vars
	private ScriptEngine engine;
	private Invocable invocable;
	
	public static final String ARGV = "javax.script.argv";
    public static final String FILENAME = "javax.script.filename";
    public static final String ENGINE = "javax.script.engine";
    public static final String ENGINE_VERSION = "javax.script.engine_version";
    public static final String NAME = "javax.script.name";
    public static final String LANGUAGE = "javax.script.language";
    public static final String LANGUAGE_VERSION ="javax.script.language_version";
	//#end Vars
    
    //# start Constructors
    /**
     * Creates an InvocableJSScriptEngine on the default class loader (not always the current one)
     */
	public InvocableJSScriptEngine() {
		String name = "JavaScript";
		engine = new ScriptEngineManager().getEngineByName(name);
		if(engine instanceof Invocable) invocable = (Invocable)engine;
		else throw new IllegalArgumentException("The engine with the name \"" + name + "\" is not invocable.");
	}
	/**
	 * Creates an InvocableJSScriptEngine on the given class loader
	 * @param classLoader - the class loader this engine will be for (Use null for the current class loader)
	 */
	protected InvocableJSScriptEngine(ClassLoader classLoader) {
		String name = "JavaScript";
		engine = new ScriptEngineManager(classLoader).getEngineByName(name);
		if(engine instanceof Invocable) invocable = (Invocable)engine;
		else throw new IllegalArgumentException("The engine with the name \"" + name + "\" is not invocable.");
	}
	//# end Constructors
	
	//# start Invocable Overrides
	@Override public <T> T getInterface(Class<T> clasz) {return invocable.getInterface(clasz);}
	@Override public <T> T getInterface(Object thiz, Class<T> clasz) {return invocable.getInterface(thiz, clasz);}
	@Override public Object invokeFunction(String name, Object... args) throws ScriptException, NoSuchMethodException {return invocable.invokeFunction(name, args);}
	@Override public Object invokeMethod(Object thiz, String name, Object... args) throws ScriptException, NoSuchMethodException {return invocable.invokeMethod(thiz, name, args);}
	//# end Invocable Overrides
	
	//# start ScriptEngine Overrides
	@Override public Bindings createBindings() {return engine.createBindings();}
	@Override public Object eval(String script) throws ScriptException {return engine.eval(script);}
	@Override public Object eval(Reader reader) throws ScriptException {return engine.eval(reader);}
	@Override public Object eval(String script, ScriptContext context) throws ScriptException {return engine.eval(script, context);}
	@Override public Object eval(Reader reader, ScriptContext context) throws ScriptException {return engine.eval(reader, context);}
	@Override public Object eval(String script, Bindings n) throws ScriptException {return engine.eval(script, n);}
	@Override public Object eval(Reader reader, Bindings n) throws ScriptException {return engine.eval(reader, n);}
	@Override public Object get(String key) {return engine.get(key);}
	@Override public Bindings getBindings(int scope) {return engine.getBindings(scope);}
	@Override public ScriptContext getContext() {return engine.getContext();}
	@Override public ScriptEngineFactory getFactory() {return engine.getFactory();}
	@Override public void put(String key, Object value) {engine.put(key, value);}
	@Override public void setBindings(Bindings bindings, int scope) {engine.setBindings(bindings, scope);}
	@Override public void setContext(ScriptContext context) {engine.setContext(context);}
	//# end ScriptEngine Overrides
}