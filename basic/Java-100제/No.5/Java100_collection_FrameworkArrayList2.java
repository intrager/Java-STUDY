// ArrayList를 이용한 자료의 추가, 수정, 삭제, 출력을 구현해보시오
// 이 문제는 컬렉션 프레임워크의 ArrayList에 대한 사용법을 알고 있는지 묻는 문제이다.

import java.util.ArrayList;

public class Java100_collection_FrameworkArrayList2 {
	public static void main(String[] args) { 
		// [0] : ArrayList 객체 생성 --> 제네릭을 사용 
		ArrayList<String> array = new ArrayList<String>();
	
		// [1] : 추가 --> add()
		array.add("홍길동");
		array.add("이순신");
		array.add("강감찬");
		array.add("을지문덕");
		array.add("김유신");
		System.out.println(array.get(3));	// 을지문덕
		
		String string = array.get(0);	// 형변환 없이 바로 사용 --> 타입 안정성 ↑
		
		// int intOne = (int)array.get(0);	// 컴파일 단계에서 오류 발견. String에서 int로 바꾸는 게 애초에 가능하지 않음
		
		// [2] : 수정 --> set(인덱스, 수정값)
		array.set(3, "징기스칸");
		System.out.println(array.get(3));	// 징기스칸
		
		// [3-1] : 삭제 --> 2가지(하나만 삭제 / 한꺼번에 삭제) --> 하나만 : remove(인덱스)
		array.remove(3);
		System.out.println("-------------------");
		System.out.println(array.get(0));	// 홍길동
		System.out.println(array.get(1));	// 이순신
		System.out.println(array.get(2));	// 강감찬
		System.out.println(array.get(3));	// 김유신
		System.out.println("-------------------");
		
		// [4-1] : 출력 --> 향상된 for문
		for(String str1 : array)
			System.out.print(str1 + " ");
		System.out.println();
	
		// [4-2] : 출력 --> 그냥 for문
		for(int i = 0; i < array.size(); i++)
			System.out.printf("%d번 학생의 이름은 %s 입니다. \n", i + 1, array.get(i));
			// System.out.print(array.get(i) + " ");
		System.out.println();
	
		// [3-2] : 삭제 --> 2가지(하나만 삭제 / 한꺼번에 삭제) --> 한꺼번에 : removeAll(배열명)
		array.removeAll(array);
		System.out.println(array.size());	// 0
		System.out.println("-------------------");
		for(String str2 : array)
			System.out.println(str2);
		System.out.println("-------------------");
	}
}