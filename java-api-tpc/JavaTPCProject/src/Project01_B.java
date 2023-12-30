import org.json.JSONArray;
import org.json.JSONObject;

public class Project01_B {
	
	public static void main(String[] args) {
		// JSON-Java(org.json)
		JSONArray students = new JSONArray();
		JSONObject student = new JSONObject();
		student.put("name", "고길동");
		student.put("phone", "010-1111-1111");
		student.put("address", "서울");
	
		System.out.println(student); // {"address":"서울","phone":"010-1111-1111","name":"고길동"}
		
		students.put(student);
		
		student = new JSONObject();
		student.put("name", "한길동");
		student.put("phone", "010-2222-2222");
		student.put("address", "경기");
		
		students.put(student);
		
		System.out.println(students);
	
		JSONObject object = new JSONObject();
		object.put("students", students);
		System.out.println(object.toString(2)); // indentation, 들여쓰기 2칸 넣음
	}
}
