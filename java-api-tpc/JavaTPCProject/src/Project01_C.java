import java.io.IOException;
import java.io.InputStream;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;


public class Project01_C {
	public static void main(String[] args) throws IOException {
		String src = "info.json";
		// IO -> Stream(스트림)
		// 해당 클래스가 만들어진 곳에서 괄호 안에 있는 리소스와 연결 후 그 연결 객체를 스트림을 넘겨주는 방식으로 하면
		// info.json이 어떤 경로라도 Project01_C라는 파일과 같은 경로에 있으면 언제든지 불러올 수 있다.
		InputStream is = Project01_C.class.getResourceAsStream(src);
		if(is == null) {
			throw new NullPointerException("Cannot find resource file");
		}
		
		JSONTokener tokener = new JSONTokener(is);
		JSONObject object = new JSONObject(tokener);
		JSONArray students = object.getJSONArray("students");
		
		for(int i = 0; i < students.length(); i++) {
			JSONObject student = (JSONObject) students.get(i);
			System.out.print(student.get("name") + "\t");
			System.out.print(student.get("address") + "\t");
			System.out.println(student.get("phone"));
		}
	}
}