package stevebeeblebrox.events;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.script.ScriptException;
/**
 * A class with utils for loading files from memory and then into a InvocableJSScriptEngine
 * @author Steve B.
 */
public class FileUtils {
	//# start Paths
	/**
	 * @return The directory this jar was loaded from
	 * @throws IOException
	 */
	public static File getJarLocation() throws IOException {
		return new File(".").getCanonicalFile();
	}
	//# end Paths
	
	//# start File Getters
	/**
	 * @param directory - the directory to look in
	 * @param type - a file extension (without the dot) to look for
	 * @return All files in the given directory matching the given file type
	 */
	public static List<File> getAll(File directory, String type) {
		return Arrays.asList(directory.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith("." + type);
			}
		}));
	}
	
	/**
	 * @param directory - the directory to look in
	 * @param types - one ore more file extensions (without the dot) to look for
	 * @return All files in the given directory matching the given file types
	 */
	public static List<File> getAll(File directory, String... types) {
		List<File> list = new ArrayList<File>();
		for(String type : types)
			list.addAll(getAll(directory, type));
		return list;
	}
	//# end File Getters
	
	//# start File Loaders
	/**
	 * @param engine - the engine to load the give file to
	 * @param source - the file to load
	 * @throws ScriptException
	 * @throws IOException
	 */
	public static void loadToEngine(InvocableJSScriptEngine engine, File source) throws ScriptException, IOException {
		try(FileReader fileReader = new FileReader(source)) {
			try(BufferedReader bufferedReader = new BufferedReader(fileReader)) {
				engine.eval(bufferedReader);
			}
		}
	}
	
	/**
	 * 
	 * @param engine - the engine to load the discovered files to
	 * @param directory - the directory to look in
	 * @param types - one ore more file extensions (without the dot) to look for
	 * @throws ScriptException
	 * @throws IOException
	 */
	public static void loadAllToEngine(InvocableJSScriptEngine engine, File directory, String... types) throws ScriptException, IOException {
		for(File file : getAll(directory, types))
			loadToEngine(engine, file);
	}
	//# end File Loaders
}
