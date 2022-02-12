// getter, setter가 포함된 클래스의 상속을 코드로 구현해보시오
// 이 문제는 클래스의 상속을 구현 시 getter, setter의 개념과 용도를 알고 있는지를 묻는 문제이다.
// 부모 클래스 --> Person, 자식 클래스 --> Villain, Hero

class Person {
	// Field
	private String name;
	private int age;
	private double height;
	private double weight;
	
	// Constructor
	Person() {}
	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	// Method
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
	
	public double getHeight() { return height; }
	public void setHeight(double height) { this.height = height; }
	
	public double getWeight() { return weight; }
	public void setWeight(double weight) { this.weight = weight; }
	
	public void move() {
		System.out.println("이동중임당");
	}
}

class Villain extends Person {
	// Field
	private String unique_key;
	private int weapon;	// 1 ~ 9 숫자로 무기 분류
	private double power;
	
	// Constructor
	Villain() {}
	Villain(String name, int age, double height, double weight, String unique_key, int weapon, double power) {
		super(name, age, height, weight);
		this.unique_key = unique_key;
		this.weapon = weapon;
		this.power = power;
	}
	
	// Method
	public String getUnique_key() { return unique_key; }
	public void setUnique_key(String unique_key) { this.unique_key = unique_key; }
	
	public int getWeapon() { return weapon; }
	public void setWeapon(int weapon) { this.weapon = weapon; }
	
	public double getPower() { return power; }
	public void setPower(double power) { this.power = power; }
	
	// printPerson() 
	public void printPerson() {
		System.out.println("--------------------------------------");
		System.out.println("빌런 이름 : " + getName());
		System.out.println("빌런 나이 : " + getAge());
		System.out.println("빌런의 키 : " + getHeight());
		System.out.println("빌런 체중 : " + getWeight());
		System.out.println("빌런 번호 : " + getUnique_key());
		System.out.println("빌런 무기 : " + getWeaponName(getWeapon()));	// 숫자(1~9) --> 1 : 창, 2 : 방패, 3 : 총 ...etc
		System.out.println("빌런 공격력 : " + getPower());
		System.out.println("--------------------------------------");
	}
	
	// getWeaponName()
	String getWeaponName(int namingWeapon) {
		String weapon;
		switch(namingWeapon) {
			case 1:
				weapon = "창";
				break;
			case 2:
				weapon = "방패";
				break;
			case 3:
				weapon = "총";
				break;
			default:
				weapon = "주먹";
				break;
				
		}
		return weapon;
	}
}

class Hero extends Person{}

public class Java100_oop_InheritanceSample7 {
	public static void main(String[] args) {
		// [1] : 객체 생성
		Person personOne = new Person();
		personOne.setName("홍길동");
		System.out.println(personOne.getName());
		
		Villain villainOne = new Villain("악당", 77, 190.3, 77.2, "19880101", 1, 100.9);
		villainOne.printPerson();
		System.out.print(villainOne.getName() + " ");
		villainOne.move();	// 필요하면 부모 클래스의 move() 메서드를 호출할 수 있음
		
		// [2] : 객체 생성
		Villain villainTwo = new Villain("도깨비", 30, 175, 40, "12341012", 2, 55.7);
		villainTwo.printPerson();
		System.out.print(villainTwo.getName() + " ");
		villainTwo.move();
		
		// [3] : 객체 생성
		Villain villainThree = new Villain("카잔", 50, 180, 80, "09990723", 3, 300.3);
		villainThree.printPerson();
		System.out.print(villainThree.getName() + " ");
		villainThree.move();
	}
}