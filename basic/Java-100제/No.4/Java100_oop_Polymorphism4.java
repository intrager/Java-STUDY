// 자식 클래스로 생성하는 객체를 부모의 타입으로 받아서 객체를 생성하면 사용범위가 어떻게 되는지 말해보시오
// 이 문제는 다형성의 관계에서 부모, 자식 클래스 자원을 어떻게 쓸 수 있는지를 묻는 문제이다.

class Person {
	String stringOne = "난 부모 클래스";
	void methodOne () {System.out.println("에이에이에이");}
	void methodTwo () {System.out.println("twotwotwo");}	
}

class Student extends Person {
	String stringTwo = "난 자식 클래스";
	void methodOne () {System.out.println("재사용 - AAA");}
	void methodThree () {System.out.println("threethreethree");}
	void callMethod () {
		methodOne();
		super.methodOne();
	}
}

public class Java100_oop_Polymorphism4 {
	public static void main(String[] args) {
		
		// [1] : 객체 생성 -> 부모 + 자식 클래스의 모든 자원을 다 쓸 수 있다.
		Student studentOne = new Student();
	
		// [!] : 만약, 자식 클래스에서 오버라이딩된 부모 클래스의 원본 메서드를 호출하고 싶다면?
		System.out.println("-----------------------");
		studentOne.callMethod();
		System.out.println("-----------------------");
		
		// [2] : 객체 생성 --> 범위는 부모의 자원을 쓸 수 있다
		Person studentTwo = new Student();
	
		// [!] : 만약, 자식의 메서드를 바로 호출하고 싶다면? --> Cast 필요
		((Student) studentTwo).methodThree();
		System.out.println("-----------------------");
	}
}