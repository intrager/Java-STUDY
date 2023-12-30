import org.json.JSONArray;
import org.json.JSONObject;

public class Project01_B {
	
	public static void main(String[] args) {
		// JSON-Java(org.json)
		JSONArray students = new JSONArray();
		JSONObject student = new JSONObject();
		student.put("name", "���浿");
		student.put("phone", "010-1111-1111");
		student.put("address", "����");
	
		System.out.println(student); // {"address":"����","phone":"010-1111-1111","name":"���浿"}
		
		students.put(student);
		
		student = new JSONObject();
		student.put("name", "�ѱ浿");
		student.put("phone", "010-2222-2222");
		student.put("address", "���");
		
		students.put(student);
		
		System.out.println(students);
	
		JSONObject object = new JSONObject();
		object.put("students", students);
		System.out.println(object.toString(2)); // indentation, �鿩���� 2ĭ ����
	}
}