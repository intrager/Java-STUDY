// 한 학급에서 반장 선거를 하는데 3명의 후보자를 두고 7명의 학생이 투표를 하였다.
// 1 ~ 3번 까지의 후보자들 중에서 과반수 이상 득표를 하면 당선이 된다.
// 투표 박스는 배열의 리스트로 제공되며 여기에는 1~3번 각 후보자의 번호가 기표되어 있다.
// 아래와 같이 동작하도록 투표 솔루션 시스템을 자바 코드로 구현하시오
// (1) 각 후보자가 득표한 득표 수를 출력하시오
// (2) 가장 많은 득표 수와 그때의 후보자 번호를 출력하시오
// (3) 가장 많은 득표를 한 후보자의 득표 수가 과반수 이상을 확보하였는지 체크하여 최종적인 당선 또는 미당선을 출력하시오

class Solution {
	// Field
	
	// Constructor
	Solution() {}
	
	// Method
	public void solutionMethod(int num, int[] vote_box) {
		
		// [1] : array 카운트(득표 수) 배열 선언 --> 정수형 배열은 0으로 초기화가 되어진다는 점을 활용 --> 즉, 처음에는 후보자 모두가 0득표라고 초기화 하자. 
		// 이때, 후보자는 1번부터 있고, 0번 후보는 없으므로 후보자 수보다 1증가된 상태로 배열의 크기를 만든다.
		int[] array = new int[num + 1];
		
		// [2] : 전달된 vote_box 배열을 반복문 돌면서 각 후보자별로 표를 받은 득표 수 계산 --> 결과적으로 array배열에는 득표한 수가 저장
		for(int i = 0; i < vote_box.length; i++)
			array[vote_box[i]]++;
		
		// [3] : 각 후보자 득표 수 출력 --> 득표 수를 저장하고 있는 배열 --> array[]
		// 이때, 0번 후보는 없으므로 array[0]번째 방의 특표 수는 항상 0이므로 아예 1번부터 순회를 시킨다.
		for(int i = 1; i < array.length; i++)
			System.out.println( i + "번 후보 : " + array[i] + "표"); 
		
		// [4] : array 카운트 배열에서 가장 많은 득표 수와 그때의 후보자 출력 --> 최댓값 알고리즘 문제
		
		// [5] : 과반수 체크
	}
}

public class Java100_license_SolutionVote2 {
	public static void main(String[] args) {
		// [1] : 객체 생성
		Solution solutionOne = new Solution();
		
		// [2] : 득표한 표 수를 저장하는 정수형 배열 선언
		int[] vote_box = {1, 3, 1, 3, 3, 2, 2};
		
		// [3] : solutionMethod() 호출 --> 2개 입력 파라미터 값 전달 --> 후보자 수, 투표 박스 배열
		solutionOne.solutionMethod(3, vote_box);
	}
}