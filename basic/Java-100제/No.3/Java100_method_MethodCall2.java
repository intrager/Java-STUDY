// 메인 메서드에서 100을 보냈을 때 값이 수정되게끔 Call by reference 방식으로 코드를 수정하시오
// 이 문제는 앞서 다뤘던 문제의 Call by value 방식을 Call by reference 방식으로 수정해서 보내라는 의미다.
// a 값이 같은 결과가 나오도록 코드를 수정해보시오

public class Java100_method_MethodCall2 {
	
	public static void sum(Java100_method_MethodCall2 a) {
		System.out.println("sum 메서드 안에서 출력 : " + a);	// 참조(주소)값
	}
	
	public static void sum2(Integer c) {
		c += 400;
		System.out.println("sum 메서드 안에서 출력 : " + c);	// 참조(주소)값
	}
	
	public static void main(String[] args) {
		
		// [1] : 변수 선언 및 메서드 호출
		// Wrapper 클래스의 Integer 클래스 타입으로 변수 a를 선언하고, new로 객체를 생성하여 해당 주소 값을 메서드로 보낸다.
		int[] a = new int[5];
		System.out.println(a);

		// 객체 생성 해서 Call by Reference
		Java100_method_MethodCall2 b = new Java100_method_MethodCall2();
		sum(b);
		System.out.println(b);
		
		// Call by Value
		Integer c = new Integer(100);
		sum2(c);
		System.out.println(c);
	}
}