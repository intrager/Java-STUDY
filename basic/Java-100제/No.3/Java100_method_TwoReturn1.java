// 두 개의 정수형 값을 리턴하는 메서드를 구현하시오
// 이 문제는 두 개의 리턴 값을 반환하는 메서드 작성법을 아는지에 대해서 묻는 문제이다.
// 아래의 코드에서 두 개의 리턴 값을 받는 코드는 (1)과 (2)중 어느 것인가?

import java.util.Arrays;

public class Java100_method_TwoReturn1 {
	
	public static int[] testMethod() {
		int num1 = 100;
		int num2 = 200;
		
		return new int[] {num1, num2};
	}
	
	public static void main(String[] args) {
	
		// [1] : 배열 변수 선언 --> 메서드로부터 반환받을 값이 배열이기 때문에 
		int result[] = testMethod();
		
		// [2] : 출력
		System.out.println(result[0] + " " + result[1]);	// 각각의 값 출력
		System.out.println(result[0] + result[1]);	// 300
		System.out.println(result);	// 주소값 출력
		System.out.println(Arrays.toString(result));	// 한 방에 모든 요소를 반복문 사용 없이 출력
	}
}