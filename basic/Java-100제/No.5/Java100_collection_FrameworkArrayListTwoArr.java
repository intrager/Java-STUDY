// 컬렉션 프레임워크의 ArrayList 기반으로 2차원배열을 만들어 요소를 추가하고 출력해보시오
// 이 문제는 ArrayList를 이용한 2차원 배열에 대한 개념을 잘 알고 있는지 묻는 문제이다.
// 배열과 2차원에 대한 개념이 약하면 거의 풀지 못하므로, 배열과 2차원에 대한 선학습이 요구된다.

import java.util.ArrayList;

public class Java100_collection_FrameworkArrayListTwoArr {
	public static void main(String[] args) {
	
		// [1] : 객체 생성
		ArrayList<Integer[]> array = new ArrayList<Integer[]>();
	
		// [2] : 요소 추가 --> add()
		array.add(new Integer[] {11, 12, 13, 14});
		array.add(new Integer[] {21, 22, 23, 24});
		array.add(new Integer[] {31, 32, 33, 34});

	}
}