// 제네릭(Generic) 개념과 사용법을 예제 코드로 구현해보시오
// 이 문제는 자바 문법 중 제네릭에 대한 개념과 사용법에 대해서 알고 있는지를 묻는 문제이다.


class Sample<T> {	// T가 아닌 다른 문자로 해도 되지만 웬만하면 T(Type)로 놓음
	// Field
	private T obj;
	
	// Constructor
	Sample(T sample) { this.obj = sample; }
	
	// Method
	T getObj() { return obj; }
	
	void printInfo() { System.out.println(obj.getClass().getName()); }
}

public class Java100_collection_Generic3 {
	public static void main(String[] args) {
		// [1] : 객체 생성 --> String
		Sample<String> stringOne =new Sample<String>("안녕하세요~");
		System.out.println(stringOne.getObj());
		stringOne.printInfo();
		System.out.println("-----------------------------");
		
		// [2] : 객체 생성 --> Integer
		Sample<Integer> integerOne = new Sample<Integer>(100);
		System.out.println(integerOne.getObj());
		integerOne.printInfo();
		
		// [3] : 형변환 없이 사용하기
		// String stringTwo = stringOne.getObj();
		// System.out.println(stringTwo.length());	// 6
		System.out.println(stringOne.getObj().length());	// 6
		System.out.println(integerOne.getObj() + 100);	// 200
		
	}
}