// 한 학급에서 반장 선거를 하는데 3명의 후보자를 두고 10명의 학생이 투표를 하였다.
// 1~3번 까지의 후보자들 중에서 과반수 이상 득표를 하면 당선된다.
// 투표 박스는 배열의 리스트로 제공되며 여기에는 1~3번 각 후보자의 번호기 기표되어 있다.
// 아래와 같이 동작하도록 투표 솔루션 시스템을 자바 코드로 구현하시오
// (1) 각 후보자의 득표 수를 출력하시오
// (2) 가장 많은 득표 수와 그때의 후보자 번호를 출력하시오
// (3) 가장 많이 득표한 후보자의 득표 수가 과반수 이상을 확보하였는지 체크하여 당선 또는 미당선을 출력하시오

class Solution {}

public class Java100_license_SolutionVote1 {
	public static void main(String[] args) {
		// [1] : 객체 생성
		Solution solutionOne = new Solution();
	
		// [2] : 득표한 표 수를 저장하는 정수형 배열 선언
		int[] vote_box = {1, 3, 1, 3, 3, 2, 2};
		
		// [3] : solutionMethod() 호출 --> 2개 입력 파라미터 값 전달 --> 후보자 수, 득표 수 배열
		solutionOne.solutionMethod(3, vote_box);
	}
}