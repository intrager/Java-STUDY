// 랜덤으로 정수 10개의 값을 갖는 배열을 만들어 최댓값과 최솟값을 같이 출력해보시오
// 이때, 1의 자리 정수는 0~9 사이로 한다.
// 이 문제는 랜덤 숫자 생성과 최댓값, 최솟값 알고리즘을 다같이 사용할 수 있는지 묻는 문제이다.

public class Java100_algorithm_MaxMin {
	public static void main(String[] args) {
		
		// [1] : 정수 배열 선언
		int[] array = new int[10];
		
		// [2] : 반복문을 돌면서 랜덤으로 10개 정수 값을 세팅 --> Math.random()
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 10);
			System.out.println(array[i] + "");
			//System.out.println((int)(Math.random() * 10));
		}
		System.out.println();
		
		// [3] : 최댓값, 최솟값 변수 초기화
		int max = array[0], min = array[0];
		
		// [4] : 반복문을 돌면서 최댓값과 최솟값 비교
		for(int i = 0; i < array.length; i++) {
			if(max < array[i]) max = array[i];
			if(min > array[i]) min = array[i];
		}
		
		// [5] : 출력
		System.out.println("-------------------");
		System.out.println(max + " " + min);
		System.out.println("-------------------");
	}
}