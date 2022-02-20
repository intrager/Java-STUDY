// 컴파일 단계에서는 에러가 안 나고, 실행 단계에서 ClassCast 오류가 발생하는 상황을 만들어보시오
// 이 문제는 제네릭의 필요성을 보여주는 예를 코드로 설명할 수 있는지를 묻는 문제이다.

class Person {
	// Field
	public Object obj;
	
	// Constructor
	Person(Object obj)	{ this.obj = obj; }
}

class Student {
	// Field
	public int grade;
	
	// Constructor
	Student(int grade) { this.grade = grade; }
}

class Teacher {}

public class Java100_collection_Generic2 {
	public static void main(String[] args) {
		// [1] : 객체 생성
		// 밑의 코드 그대로 하면 컴파일까지는 되지만, 실행 단계에서 에러를 일으킴	
		// java.lang.ClassCastException: 
		// class Student cannot be cast to class Teacher (Student and Teacher are in unnamed module of loader 'app')
		
		Person personOne = new Person(new Student(1));
		// System.out.println(personOne.obj);
		
		// [2] : 형변환 --> Cast
		Teacher string = (Teacher)personOne.obj;	
		
	}
}