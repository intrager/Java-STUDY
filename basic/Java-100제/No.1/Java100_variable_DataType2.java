// 기본형 타입의 값을 초기화한 아래의 코드에서 틀린 곳을 찾아 수정하시오.
// 이 문제는 기본형 타입의 값을 초기화하는 방법에 대해 알고 있는지를 묻는 문제이다.

public class Java100_variable_DataType2 {
	public static void main(String[] args) {
		
		// [1] : 기본형 타입 --> 8게 --> 변수 선언과 동시에 값을 입력
		byte b = 100;
		short s = 30000;
		int i = 2100000000;
		long l = 7000000000L;	// 뒤에 L 혹은 l 붙여야함
		float f = 9.8f;	// 뒤에 f 붙여야함
		double d = 3.14;
		char c = 'A';
		boolean bl = false;
		
		//[2] : 출력
		System.out.println(b + "\tbyte 최댓값 -->" + Byte.MAX_VALUE);
		System.out.println(s + "\tshort 최댓값 --> " + Short.MAX_VALUE); 
		System.out.println(i + "\tint 최댓값 --> " + Integer.MAX_VALUE); 
		System.out.println(l + "\tlong 최댓값 --> " + Long.MAX_VALUE); 
		System.out.println(f + "\tfloat 최댓값 --> " + Float.MAX_VALUE); 
		System.out.println(d + "\tdouble 최댓값 --> " + Double.MAX_VALUE); 
		System.out.println(c + "\tchar 최댓값은 없음"); 
		System.out.println(bl);  
	}
}
		