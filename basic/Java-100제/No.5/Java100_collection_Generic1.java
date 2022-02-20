// 제네릭(Generic)의 개념과 필요성에 대해서 예제 코드로 설명해보시오
// 이 문제는 자바 문법중 제네릭에 대한 개념과 필요성에 대해서 알고 있는지 묻는 문제이다.
// 모든 타입을다 받는 클래스를 만들어보시오

class Sample {
	// Field
	private Object obj;
	
	// Constructor
	Sample(Object x) {
		this.obj = x;
	}
	
	// Method
	public Object getObj() {
		return obj;
	}
	
	void printInfo() {
		System.out.println(obj.getClass().getName());	// 객체가 속하는 클래스의 정보를 출력하는 메서드
	}
}

public class Java100_collection_Generic1 {
	public static void main(String[] args) {
		// [1] : 객체 생성 --> 문자열
		Sample sampleOne = new Sample("안녕하세요~");
		System.out.println(sampleOne.getObj());
		sampleOne.printInfo();
		System.out.println("-----------------------");
		
		// [2] : 객체 생성 --> 정수
		Sample sampleTwo = new Sample(100);	// error
		System.out.println(sampleTwo.getObj());	// 100
		sampleTwo.printInfo();
		System.out.println("-----------------------");
		
		// [3] : 객체 생성 --> Object
		Sample sampleThree = new Sample(new Object());
		System.out.println(sampleThree.getObj());
		sampleThree.printInfo();
		System.out.println("-----------------------");

		// [4] : 위와 같이 사용 시 --> 단점
		// sampleOne --> 문자열
		//Object object = sampleOne.getObj();	// 리턴 시 반환 타입이 Object이다.
		String string = (String)sampleOne.getObj();	// 형변환 
		System.out.println(string.length());
		
		// sampleTwo --> 정수
		//Object num = sampleTwo.getObj();
		//System.out.println((int)num + 100);
		int num = (int)sampleTwo.getObj();	// Integer로 형변환 해도 됨
		System.out.println(num + 100);
	}
}