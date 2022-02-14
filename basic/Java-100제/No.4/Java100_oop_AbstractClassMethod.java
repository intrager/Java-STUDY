// 추상 클래스와 추상 메서드란 무엇인지 설명하고 관련된 예제 코드를 구현해보시오
// 이 문제는 자바의 추상 클래스, 추상 메서드의 개념과 역할에 대해 알고 있는지 묻는 문제이다.


abstract class Animal {
	// 구체적인 내용은 작성하지 않고 공통적인 특징을 추상적으로 선언 --> 리턴값도 없이 메서드명만 선언
	abstract void run();
}

class Dog extends Animal {
	void run() { System.out.println("멍멍이가 달린다"); }
}

class Cat extends Animal {
	void run() { System.out.println("냥이가 달린다"); }
}

class Cow extends Animal {
	void run() { System.out.println("소가 달린다"); }
}

class Animal2 {
	void fly() {System.out.println("날다");}
}

public class Java100_oop_AbstractClassMethod {
	public static void main(String[] args) {
	
		// [1] : 추상 클래스는 구체적인 내용이 없기 때문에 객체를 생성할 수 없다.
		// Animal dog = new Animal();	// err
		Animal2 dragonfly = new Animal2();	// 에러가 안 남
		dragonfly.fly();
		
		// [2] : 추상 클래스 사용은? --> 상속을 받아서 사용
		// 즉, 추상(부모) 클래스를 상속받은 자식 클래스에서 해당 메서드를 오버라이딩하여 재정의한 후 사용한다.
		Dog dog = new Dog();
		dog.run();
		
		Cat cat = new Cat();
		cat.run();
		
		Cow cow = new Cow();
		cow.run();
	}
}