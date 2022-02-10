// 클래스의 상속을 코드로 구현해보시오
// 이 문제는 자바 OOP 문법에서 상속에 대한 개념과 그것을 코드로 구현할 수 있는지를 묻는 문제이다.

class Person{
	// Field
	int gender;
	int power;

	// Constructor
	Person() {
		this.gender = 1;	// 1: 남성, 2: 여성
		this.power = 100;	// 기본 파워
	}
	
	// Method
	void walk() {
		System.out.println("걸어가는 중이다");
	}
}

class Hero extends Person{
	// Field
	String name;
	int age;
	
	// Constructor
	Hero() {}
	Hero(String name, int age) {
		this.name = name;
		this.age = age;
	}		
	
	// Method
	void walk() {	// 이거 주석 처리하면 호출 시 부모 클래스에 있는 메서드가 사용됨
		System.out.print("2배로 빨리 걷는 중이다");
	}
	
	void eat() {
		System.out.println("밥먹는 중이에여");
	}
	
	void displayPerson() {
		System.out.println("이름 : " + name + ", 나이: " + age + ", 성별 : "+ gender + ", 파워 : " + power);
	}
}

class Villain extends Person{}

class Car {}

class FireEngine extends Car{}

class Ambulance extends Car{}

public class Java100_oop_InheritanceSample2 {
	public static void main(String[] args) {
		
		// [1] : 객체 생성
		Person personOne = new Person();
		personOne.walk();
		
		// [2]: 상속을 통한 Hero 객체 생성
		Hero heroOne = new Hero("영웅", 25);
		System.out.println(heroOne.name);
		System.out.println(heroOne.age);
		System.out.println(heroOne.gender);	// 부모 클래스 필드(변수)
		System.out.println(heroOne.power);	// 부모 클래스 필드(변수)
	}
}