// 컬렉션 프레임워크의 ArrayList 기반으로 2차원 배열을 만들어 요소를 추가하고 출력해보시오
// 이 문제는 ArrayList를 이용한 2차원 배열에 대한 개념을 잘 알고 있는지 묻는 문제이다.
// 배열과 2차원에 대한 개념이 약하면 거의 풀지 못하므로, 배열과 2차원에 대한 선학습이 요구된다.

import java.util.ArrayList;

public class Java100_collection_FrameworkArrayListTwoArr2 {
	public static void main(String[] args) {

		// [1] : 객체 생성
		ArrayList<Integer[]> array = new ArrayList<Integer[]>();
		
		// [2] : 요소 추가 --> add()
		array.add(new Integer[] {11, 12, 13, 14});
		array.add(new Integer[] {21, 22, 23, 24});
		array.add(new Integer[] {31, 32, 33, 34});
	
		// [3] : 요소 출력
		for(int i = 0; i < array.size(); i++) 
			System.out.println(array.get(i)[0]);	// 11 (0번째 배열의 첫 번째 값), 21 (1번째 배열의 첫 번째 값), 31 (2번째 배열의 첫 번째 값)
	
		// [4] : 전체 요소 출력 --> 이중 반복문 --> 그런데, 그 전에 안쪽 배열의 사이즈를 미리 체크 --> 여기서 약간 주의!
		//System.out.println(array.get(0).size());	// error -> 컬렉션 프레임워크 타입의 길이를 알고 싶을 때 사용
		//System.out.println(array.get(0).length());	// error -> 문자열의 길이를 알고 싶을 때 사용
		System.out.println(array.get(0).length);	// 4	--> 배열( int[], Integer[], String[] )의 길이를 알고 싶을 때 사용
	
		// [5] : 전체 요소 출력
		System.out.println("--------------------------");
		for(int i = 0; i < array.size(); i++) {	// 배열 자체 크기(행 개수)
			for(int j = 0; j < array.get(i).length; j++)	// 배열의 그 행의 길이(열 개수)
				System.out.print(array.get(i)[j] + "  ");
			System.out.println();
		}
		System.out.println("--------------------------");
	}
}