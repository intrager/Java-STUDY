// static 선언이 안 되어있는 메서드를 사용하는 방법에 대해서 코드로 구현해보시오.
// 이 문제는 메인 메서드에서 static 선언이 없는 메서드를 사용하는 방법에 대해서 아는지를 묻는 문제이다.
// 클래스와 객체에 대한 선행 학습이 필요하므로 이에 대한 강의를 본 후 문제를 다시 풀어보는 것이 좋다.

public class Java100_method_ExamStatic2 {
	
	public void helloWorld() {
		System.out.println("Hello, World");
	}
	
	public static void main(String[] args) {
		// [1] : 메서드 호출
		// helloWorld(); // 객체 없이 메서드를 그냥 호출할 수는 없음
		
		// [2] : 객체 생성 후 메서드 호출
		Java100_method_ExamStatic2 javaMethod = new Java100_method_ExamStatic2();
		javaMethod.helloWorld();
	}
}