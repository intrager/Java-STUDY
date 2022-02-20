// 컬렉션(Collection) 프레임워크의 ArrayList를 사용하는 예제 코드를 구현해보시오
// 이 문제는 ArrayList에 대한 개념과 기본적인 사용법에 대해서 알고 있는지 묻는 문제다.


// [!] : ArrayList
// 먼저, 자바의 배열은 크기를 미리 지정하고 사용했다. --> 그러다보니 넉넉하게 크기를 지정해놓고 사용하곤 한다.
// 반면, ArrayList는 필요 시 언제든지 추가, 삭제가 가능하다.
// List 인터페이스를 상속하므로 인덱스가 있고, 저장 순서가 유지되며, 데이터 중복이 가능하다.
// 또한, 제네릭 문법을 사용할 수 있다. --> 만약, 제네릭을 사용하지 않는다면 내부적으로 Object 타입으로 처리한다.
// 사용을 위해서는 상단에 임포트가 필요하다. --> import java.util.ArrayList; 또는 import java.util.*;

import java.util.ArrayList;

class Person {}

public class Java100_collection_FrameworkArrayList1 {
	public static void main(String[] args) {
		// [1] : ArrayList를 제네릭이 아닌 Object 타입으로 사용하는 경우
		ArrayList listOne = new ArrayList();
		
		// [2] : 데이터 추가하기 --> add()
		listOne.add("한정수");	// 문자열 자료형 저장
		listOne.add(20);	// 정수 자료형 저장
		listOne.add("이순신");
		listOne.add(20);	// 데이터 중복이 가능
		listOne.add(new Person());
		
		// [3] : 데이터 가져오기 --> get() --> 이때, 해당 데이터 자료형으로 형변환하여 사용한다.
		// System.out.println(listOne.get(0));	//  한정수
		String string = (String)listOne.get(0);	// incompatible types: Object cannot be converted to String
		System.out.println(string.length());	// 3
		
		int num = (int)listOne.get(1);	// get(0)으로 하면 ArrayList를 제네릭이 아닌 Object 타입으로 사용하는 경우 컴파일까지는 되지만, 실행 단계에서 오류남.
		System.out.println(num + 100);	// 200
	
		// [!] : 결론
		// 여기까지 봤을 때, 제네릭 문법을 사용하지 않으면 ArrayList는 내부적으로 Object 타입으로 처리됨을 알 수 있다.
		// 제네릭을 사용하면 된다.
		
		// [4] : 출력 --> 반복문 --> 배열의 크기(size) --> 객체명.size()
		System.out.println(listOne.size());	// 5
		for(int i = 0; i < listOne.size(); i++)
			System.out.println(listOne.get(i) + " ");
		System.out.println();
	}
}