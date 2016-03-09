package vn.smartJob.nashorn;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDateTime;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Example2 {
	public static void main(String[] args) throws ScriptException, FileNotFoundException, NoSuchMethodException {
		ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
		engine.eval(new FileReader("script1.js"));
		Invocable invocable = (Invocable) engine;

		Object WildAnimal = invocable.invokeFunction("displayInfo", "Tê giác có một hoặc nhiều sừng");
		System.out.println(WildAnimal);
		System.out.println("Kiểu Object của WildAnimal là " + WildAnimal.getClass());

		LocalDateTime now = LocalDateTime.now();
		invocable.invokeFunction("getTypeOfObject", now);
	}
}

// Kết quả:
// Nội dung này được gọi ra bởi JavaScript, nói rằng: Tê giác có thể có một hoặc nhiều sừng
// Tê giác sắp bị tuyệt chủng
// Kiểu Object của WildAnimal là class java.lang.String
// Kiểu đối tượng là: [object java.time.LocalDateTime]

