// if~else 조건문의 사용법을 예제로 설명해보시오
// 이 문제는 자바의 if~else 조건문을 사용할 수 있는지에 대해서 묻는 문제이다.

public class Java100_if_Basic002 {
	public static void main(String[] args) {
		
		// [1] : 변수 선언
		int kor = 80, eng = 90, math = 100;
		
		// [2] : if 조건문만 사용하기
		if(math >= 95)
			System.out.println("당신의 수학 점수는 A+ 학점입니다.");
		
		System.out.println("학점이 안 나왔다면 95점이 안 되어서입니다.");
		System.out.println("-------------------------------");
		
		// [3] : if~else 조건문 사용하기
		if(eng >= 90) {
			System.out.println("영어 점수는 A학점 입니다.");
		} else {
			System.out.println("90점 미만입니다.");
		}
	}
}