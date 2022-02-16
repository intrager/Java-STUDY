// 자바 인터페이스 문법을 예제 코드로 구현해보시오
// 이 문제는 자바 문법 중 인터페이스에 대한 개념 및 어떻게 사용하는지에 대해서 아는지를 묻는 문제이다.
// 앞서 문제를 가지고 다양한 문법 텟트를 ㅐㅎ보시오
// (1) extends vs implements 우선 순위는?
// (2) 인터페이스 내 일반 메서드 작성이나, 인터페이스 내 멤버 필드(변수)작성은 정말 안 되나?

class Person {
	// Field
	String name;
	int age;
	double weight;
	
	// Constructor
	Person() {}
	Person(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	// Method
	void wash() {System.out.println("씻다");}
	void study() {System.out.println("공부하다");}
	void play() {System.out.println("놀다");}	
}

interface Allowance {
	// Field
	// 변수는 안 되나 상수는 되므로, 상수로 지정해주면 됨 --> public static final을 붙여주면 됨
	// 인터페이스 내 모든 멤버 필드(변수)는 public static final 이어야 함. --> 생략이 가능 --> 그냥 "타입 상수명"지정해서 쓰면 됨
	String aaa = "korea";
	int bbb = 100;
	
	// Abstract Method
	// 인터페이스 내 모든 메서드는 public abstract 이어야 함 --> 생략이 가능
	public abstract void input(int price, String name);
	abstract void output(int price, String name);
	// void wash() {System.out.println("씻다");}	// 선언만 되어 있어야 한다.
}

interface Train {
	// Abstract Method
	abstract void train(int training_pay, String name);
}

class Student extends Person implements Allowance, Train {
	// Field
	
	// Constructor
	Student() {}
	Student(String name, int age, int weight) {
		super(name, age, weight);
	}
	
	// Method 
	public void input(int price, String name) {System.out.printf("%s에게서 %d원을 획득했다\n", name, price);}
	public void output(int price, String name) {System.out.printf("%d원을 지불했다 [지출용도 -->%s]\n%n", price, name);}
	public void train(int training_pay, String name) {System.out.printf("[%s에게서 %d원 입금완료]\n", name, training_pay);}
}

public class Java100_oop_Interface4 {
	public static void main(String[] args) {
		
		// [1] : 객체 생성
		Student studentOne = new Student("홍길동", 20, 85);
		
		// [2] : 클래스와 인터페이스로부터 상속(Person)과 구현(Allowance, Train)을 한 메서드들 호출하기
		studentOne.wash();
		studentOne.study();
		studentOne.play();
		studentOne.input(10000, "코인");
		studentOne.output(5000, "편의점");
		studentOne.train(123400, "주식");
		
		// [3] : 상수 필드 출력하기
		System.out.println(studentOne.aaa);
		System.out.println(studentOne.bbb);
		System.out.println(Allowance.aaa);	// korea
		System.out.println(Allowance.bbb);	// 100
	
	}
}