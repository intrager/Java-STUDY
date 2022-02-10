// 객체 생성 시 초기값을 생성자 메서드에서 설정하는 클래스를 구현해보시오
// 이 문제는 클래스의 인스턴스 생성 시 생성자를 통해서 초기화하는 것을 알고 있는지 묻는 문제이다.

class Person {
	
	// [1] : 속성(Attribute)
	int age;		// 나이
	String name; 	// 이름
	
	// [2] : 생성자(Constructor)
	Person() {}
	Person(int age, String name) {
		this.age = age;	// this는 생성자 객체 자신을 가리킴
		this.name = name;
	}
	
	// [3] : 메서드(Method)
	void printPerson() {
		System.out.println("나이:" + age + ", 이름: " + name); 
	}
}

public class Java100_oop_Exam006 {
	public static void main(String[] args) {
		
		// [1] : 객체 생성
		Person hong = new Person(20, "홍길동");
		System.out.println(hong);
		System.out.println(hong.age + " " + hong.name);
		hong.printPerson();
		
		Person lee = new Person(40, "이순신");
		lee.printPerson();
		
		Person eul = new Person(30, "을지문덕");
		eul.printPerson();
	}
}