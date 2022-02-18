// 정수로 이루어진 배열에서 가장 큰 값을 구하는 최댓값 알고리즘을 구현해보시오
// 이 문제는 배열 내 정수 값들에서 최댓값을 구하는 알고리즘에 대해서 아는지 묻는 문제이다.

public class Java100_algorithm_MaxAlgorithm {
	public static void main(String[] args) {
		
		// [1] : 배열 선언
		int[] array = {4,13,15,17,-2};
	
		// [2] : max, min 함수
		System.out.println(Math.max(10,4));	// 10
		System.out.println(Math.min(10,4));	// 4
		
		// [3] : 일단 배열 내 첫 번째 원소의 값이 제일 크다고 가정하고 초기화
		//int max = Integer.MIN_VALUE;
		int max = array[0];
		
		// [4] : 반복문 돌면서 비교하여 출력 --> 이때, 비교는 2번째부터 비교하면 되니까 int i = 1로 시작
		System.out.println("현재 배열에서 가장 큰 값은 :" + max);
	
		for(int i = 1; i < array.length; i++)	// i를 0부터 시작해도 되지만 어차피 4< 4라는 결과가 나오므로 비교하는 의미가 없음.
			if(max < array[i])
				max = array[i];
		System.out.println("현재 배열에서 가장 큰 값은 :" + max);
	}
}