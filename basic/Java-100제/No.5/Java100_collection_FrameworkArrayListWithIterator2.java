// Iterator 개념과 이를 이용하여 ArrayList 요소를 순회 및 삭제하는 코드를 구현해보시오
// 이 문제는 Iterator에 대한 개념과 사용법 그리고 ArrayList에서 사용할 수 있는지 묻는 문제이다.
// 선행학습으로 추상 클래스, 인터페이스, 다형성 등의 OOP 개념이 숙지 되어있어야 한다.

import java.util.ArrayList;
import java.util.Iterator;

public class Java100_collection_FrameworkArrayListWithIterator2 {
	public static void main(String[] args) {
	
		// [1] : 객체 생성
		ArrayList<String> listOne = new ArrayList<>();
		
		// [2] : 요소 추가 --> add()
		listOne.add("Alligator");
		listOne.add("Hippo");
		listOne.add("Ostrich");
		listOne.add("Donkey");
		
		// [3] : Iterator(반복자) 객체 생성 --> 객체 생성 과정도 중요!
		// System.out.println(hasNext());	// error : cannot find symbol
		// Collection 인터페이스 --> iterator() 메서드를 정의하고 있고 --> 이를 상속받는 게 List, Set 인터페이스이므로,
		// List, Set 인터페이스를 상속받아 구현한 클래스들 객체를 통해서 iterator() 메서드를 사용할 수 있음
		
		Iterator<String> iter = listOne.iterator();
		
		// [4] : Iterator(반복자) 메서드 사용 --> hasNext(), next(), remove()
		/*System.out.println(iter.hasNext());	// true --> 왜? --> 첫 번째 요소인 Alligator가 있으니까
		System.out.println(iter.next());	// Alligator
		System.out.println(iter.hasNext());	// true --> 왜? --> 두 번째 요소인 Hippo가 있으니까
		System.out.println(iter.next());	// Hippo
		System.out.println(iter.hasNext());	// true --> 왜? --> 세 번째 요소인 Ostrich가 있으니까
		System.out.println(iter.next());	// Ostrich
		System.out.println(iter.hasNext());	// true --> 왜? --> 네 번째 요소인 Donkey가 있으니까
		System.out.println(iter.next());	// Donkey
		System.out.println(iter.hasNext());	// false*/
		// System.out.println(iter.next());	// error
		
		// [5] : 요소 출력 --> 향상된 for문
		for(String str : listOne)
			System.out.println(str);
		
		// [6] : 요소 출력 --> while 반복문 사용
		// [6-1] : 배열 요소 전체 출력
	/*	System.out.println("-----------------------------");
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("-----------------------------");
	*/
		// [6-2] : 아래의 출력 결과를 예상하여 말해보시오 --> 밑 소스를 실행시키면 아무것도 안 나옴 --> 노가다한 System.out.println으로 hasNext()을 이용하여 다 출력했으므로
	/*	System.out.println(iter.hasNext());	// true --> 왜? --> 첫 번째 요소인 Alligator가 있으니까
		System.out.println(iter.next());	// Alligator
		System.out.println(iter.hasNext());	// true --> 왜? --> 두 번째 요소인 Hippo가 있으니까
		System.out.println(iter.next());	// Hippo
		System.out.println(iter.hasNext());	// true --> 왜? --> 세 번째 요소인 Ostrich가 있으니까
		System.out.println(iter.next());	// Ostrich
		System.out.println(iter.hasNext());	// true --> 왜? --> 네 번째 요소인 Donkey가 있으니까
		System.out.println(iter.next());	// Donkey
		System.out.println(iter.hasNext());	// false
		System.out.println("-----------------------------");
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("-----------------------------");
	*/
		// [6-3] : Hippo 요소만 출력해보시오
	/*	System.out.println("-----------------------------");
		while(iter.hasNext()) {
			String hippo = iter.next();
			if("Hippo".equals(hippo))
				System.out.println(hippo);
		}
		System.out.println("-----------------------------");
	*/	
		// [6-4] : Hippo 요소만 삭제해보시오
		System.out.println("-----------------------------");
		while(iter.hasNext()) {
			String hippo = iter.next();
			if("Hippo".equals(hippo)) {
				iter.remove();
				System.out.println("하마 삭제");
			}
			// System.out.println(hippo);
		}
		System.out.println("-----------------------------");
		
		for(String printAfter : listOne)
			System.out.println(printAfter);
	}
}