// 반복문(for)을 사용하여 객체 배열을 생성하고 출력해보시오
// 이 문제는 객체의 주소를 저장하고 있는 객체 배열을 반복문을 사용하여 만들 수 있는지를 묻는 문제이다.

class Person {
	// Field
	 String name;
	 int age;
	
	// Constructor
	Person() {}
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// Method
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
}

public class Java100_oop_ObjArray2 {
	public static void main(String[] args) { 
		// [1] : 객체 생성
		Person[] personArray;	// Person 타입의 객체 배열 변수 personArray선언
		personArray = new Person[5];	// Person 객체의 참조값을 원소로 가지는 배열 공간을 10개 생성 --> 
		
		// [2] : 반복문(for)을 돌면서 Person() 객체 생성
		for(int i = 0; i < personArray.length; i++) {
			personArray[i] = new Person( i + "번 후보자", i+20);	// i만 입력하면 안 되고, 문자열을 붙이면 문자열로 전달됨
		
			// [2-1] : getter, setter 메서드 사용해서 출력
			System.out.println(personArray[i].getName() + "의 나이 : " + personArray[i].getAge());
		
			// [2-2] : 배열 인덱스 사용해서 출력 --> 단, 이렇게 쓰려면 private 선언을 삭제하고 써야함.
			System.out.println(personArray[i].name + "의 나이는" + personArray[i].age + "살 이다.");
		
			// [2-3] : printf()
			System.out.printf("%s번 후보자의 나이는 %d살 이다.\n", personArray[i].name, personArray[i].age); 
		}
		System.out.println();
	}
}