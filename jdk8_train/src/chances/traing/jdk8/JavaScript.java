package chances.traing.jdk8;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JavaScript {
	public static void main(String[] arrs){
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("nashorn");
		Object result = null;
		try {
			result = engine.eval("'hello world'.length");
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(result);
		
		//engine.eval(reader, n);
	}
}
