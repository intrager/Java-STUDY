// 자식 클래스로 생성하는 객체를 부모의 타입으로 받아서 객체를 생성하면 사용범위가 어떻게 되는지 말해보시오
// 이 문제는 다형성의 관계에서 부모, 자식 클래스 자원을 어떻게 쓸 수 있는지 묻는 문제이다.

class Person {
	String stringOne = "부모 클래스";
	void methodOne () {System.out.println("에이에이에이");}
	void methodTwo () {System.out.println("twotwotwo");}
}
class Student extends Person {
	String stringTwo = "자식 클래스";
	void methodOne () {System.out.println("재사용 - AAA");}
	void methodThree () {System.out.println("threethreethree");}
}

public class Java100_oop_Polymorphism3 {
	public static void main(String[] args) {
		
		// [3] 객체 생성
		Person personOne = new Person();
		personOne.methodOne();	// 에이에이에이
		// personOne.methodTwo(); // error
		
		// [2] : 객체 생성 --> 범위는 부모의 자원을 쓸 수 있다.
		System.out.println("-----------------------");
		Person studentTwo = new Student();
		System.out.println(studentTwo.stringOne);
		// System.out.println(studentTwo.stringTwo); // error	// 자식의 자원은 쓸 수 없다.
		studentTwo.methodTwo();	// twotwotwo
		// studentTwo.methodThree();	// error
		studentTwo.methodOne();	// 재사용 - AAA -> 오버라이딩된 자식의 메서드로 실행
		
		// [!] : 만약, 자식의 메서드를 바로 호출하고 싶다면?
		
		// [1] : 객체 생성 -> 부모 + 자식 클래스의 모든 자원을 다 쓸 수 있다.
		System.out.println("-----------------------");
		Student studentOne = new Student();
		System.out.println(studentOne.stringOne);
		System.out.println(studentOne.stringTwo);
		studentOne.methodOne();
		studentOne.methodThree();
		studentOne.methodTwo();
		
		// [!] : 만약, 자식 클래스에서 오버라이딩된 부모 클래스의 원본 메서드를 호출하고 싶다면?
		


	}
}