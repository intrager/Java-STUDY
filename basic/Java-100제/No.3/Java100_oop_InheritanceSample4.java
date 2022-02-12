// 클래스 상속에서 메서드 오버라이딩에 대해서 설명하고 구현해보시오
// 이 문제는 상속에서 부모 클래스의 메서드를 자식이 오버라이딩해서 구현할 수 있는지를 묻는 문제이다.

class Person {
	// Field
	int gender;
	int power;
	
	// Constructor
	Person() {
		this.gender = 1;	// 1 : 남성, 2 : 여성
		this.power = 100;	// 기본 파워
	}
	
	// Method
	void walk() {
		System.out.println("걸어가는 중이다");
	}
}

class Hero extends Person {
	// Field
	String name;
	int age;
	
	// Constructor
	Hero() {}
	Hero(String name, int age) {
		super();	// 명시적으로 부모클래스의 생성자를 호출
		this.name = name;
		this.age = age;
	}
	
	// Method
	void walk() {	// 이거 주석 처리하면 호출 시 부모 클래스에 있는 메서드가 사용됨
		System.out.println("2배로 빨리 걷는 중이다.");
	}	
	
	void eat() {
		System.out.println("밥먹는 중이에요");
	}
	
	void displayPerson() {
		System.out.println("이름 : " + name + ", 나이 : " + age + ", 성별 : " + gender + ", 파워 : " + power);
	}
}

class Villain extends Person{}

class Car{}

class FireEngine extends Car{}
 
class Ambulance extends Car{}

public class Java100_oop_InheritanceSample4 {
	public static void main(String[] args) {
		
		// [1] : 객체 생성
		Person personOne = new Person();
		personOne.walk();
		
		// [2] : 상속을 통한 Hero 객체 생성
		Hero heroOne = new Hero("영웅", 26);
		System.out.println(heroOne.name);
		System.out.println(heroOne.age);
		System.out.println(heroOne.gender);	// 부모 클래스 필드(변수)
		System.out.println(heroOne.power);	// 부모 클래스 필드(변수)
		heroOne.walk();
		heroOne.eat();
		heroOne.displayPerson();
		
		// [3] : 원더우면 객체 생성
		Hero heroTwo = new Hero("원더우면", 30);
		heroTwo.gender = 2;
		heroTwo.power = 300;
		heroTwo.displayPerson();
		heroTwo.walk();
	}
}