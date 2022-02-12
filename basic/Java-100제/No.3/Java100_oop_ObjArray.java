// 객체에 대한 참조값을 요소로 가지는 객체 배열을 생성하는 코드를 구현하시오
// 이 문제는 기본형 타입이 아닌 참조형 타입의 객체가 원소인 객체 배열을 구현할 수 있는지를 묻는 문제이다.

class Person {
	// Field
	String name;
	private int age;
	
	// Constructor
	Person() {}
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// Method
	public String getName() { return name; } 
	public void setName(String name) {this.name = name;}
	
	public int getAge() {return age;}
	public void setAge(int age) { this.age = age; }
}
public class Java100_oop_ObjArray {
	public static void main(String[] args) {
		// [1] : 객체 생성
		int[] ar1 = {1, 2, 3, 4, 5};
		char[] ar2 = {'A', 'B', 'C', 'D', 'E'};
		Person[] personArray = new Person[5];
		personArray[0] = new Person("홍길동", 20);
		personArray[1] = new Person("고길동", 21);
		personArray[2] = new Person("둘리", 22);
		personArray[3] = new Person("희동", 23);
		personArray[4] = new Person("마이콜", 24);
		
		// [2] : 출력
		for(int i = 0; i < personArray.length; i++) {
			System.out.print(personArray[i].getName());
			System.out.print(personArray[i].name);	// String의 접근 제어자가 private면 오류 발생
			System.out.print(personArray[i].getAge() + "\t\t");
		}
		System.out.println();
	}
}