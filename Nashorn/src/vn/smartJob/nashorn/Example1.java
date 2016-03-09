package vn.smartJob.nashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Example1 {

	public static void main(String[] args) throws ScriptException {
		ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
		engine.eval("print('SmartJob is smart choice');");
	}

}

// Kết quả:
// SmartJob is smart choice