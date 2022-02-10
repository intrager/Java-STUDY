// 메인 메서드에서 정수 100을 Call by Reference 방식으로 메서드를 호출하는 코드를 구현하시오.
// 이 문제는 앞서 다뤘던 문제의 Call by value 방식을 Call by Reference 방식으로 수정ㅎ서 보내라는 의미다.
// a 값이 같은 결과가 나오도록 코드를 수정해보시오.
// 단, 클래스와 Wrapper, 객체 생성에 대한 개념이 필요하므로 관련 공부를 하고 보는 것이 이해하는데 도움이 된다.

class TestNumber {
	int num;
	TestNumber(int num) {this.num = num; }
}

public class Java100_method_MethodCall3 {
	
	public static void sum(TestNumber a) {
		System.out.println(a);	// a 값에는 TestNumber 의 주소 값이 들어있음.
		System.out.println(a.num);	// 100
		a.num = a.num + 400;
		System.out.println(a.num);	// 500
	}
	
	public static void main(String[] args) {
		
		// [1] : 객체 변수 선언
		TestNumber a = new TestNumber(100);
		sum(a);
	
		System.out.println(a.num);	// 100 -> 500
		
	}
}