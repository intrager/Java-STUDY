// 정수, 실수, 문자형 타입의 변수 사용에서 틀린 곳을 찾아서 모두 수정하시오.
// 에러가 안 나더라도 올바르게 수정하시오
// 이 문제는 변수 선언과 사용 시 주의할 점에 대해서 알고 있는지를 묻는 문제이다.

public class Java100_variable_DataType1 {
	public static void main(String[] args) {
		
		// [1] : 변수 선언
		int a;	// 정수가 저장될 변수 이름을 a로 만들어라
		int b; int c = 90;
		double d;	// 실수가 저장될 변수 이름을 d로 만들어라
		char e;	// 문자가 저장될 변수 이름을 e로 만들어라
		
		// [2] : 선언된 변수에 값을 대입
		a = 10;
		b = 30;
		d = 10;
		e = 'A';	// 큰따옴표하면 에러 발생
		
		// [3] : 출력
		System.out.println(a);	// 10
		System.out.println(b);	// 30
		System.out.println(c);	// 90
		System.out.println(d);	// 10.0
		System.out.println(e);	// A
		
		// [4] : 여러 개 변수 선언 및 초기화 --> 선언 후 값을 세팅
		// [4-1]
		int w;	// 선언만 했을 때에는 에러가 나지 않음
		// int x, y, z = 900;	// z만 초기화가 되고 x,y는 초기화 안 됨 
		//System.out.println("[4-1]:" + x + "-" + y + "-" + z);
		
		// [4-2]
		int x, y, z;
		x = 700;
		y = 800;
		z = 900;
		System.out.println("[4-2]:" + x + "-" + y + "-" + z);
		
		// [4-3]
		int x1 = 300, y1 = 400, z1 = 500;
		System.out.println("[4-3]:" + x1 + "-" + y1 + "-" + z1);
		
		// [4-4] : 같은 값으로 초기화
		// String str1, str2, str3;
		// str1, str2, str3 = "hello"; // 이렇게 하면 not a statement /  ';' expected 에러남
		String str1, str2, str3 = "hello";
		System.out.println(str3);	// str1인나 str2를 출력하려고 하면 못 함 ㅇㅇ
		
		str1 = str2 = str3 = "world";
		System.out.println("[4-4] 여러 문자열 변수 한꺼번에 초기화 : " + str1 + "-"+ str2 + "-" + str3);
		
		int i, j, k = 100;
		i = j = k = 100;
		System.out.println("[4-4] 여러 정수형 변수 한꺼번에 초기화:" + i + "-" + j + "-" + k);
	}
}