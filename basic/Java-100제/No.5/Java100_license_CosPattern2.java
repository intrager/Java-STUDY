// 홀수, 짝수 구하기 문제를 while 반복문과 continue를 사용하여 구현해보시오
// 1~30까지의 수에서 짝수만 출력하시오
// 이 문제는 while 반복문과 그 안에서 continue 키워드의 역할과 사용법을 아는지 묻는 문제이다.
// 자격증 문제 말고도 이러한 continue 키워드를 사용하는 용법은 잘 익혀둬야 한다.

public class Java100_license_CosPattern2 {
	public static void main(String[] args) {
		
		// [1] : 변수 선언
		int number = 1;
		
		// [2] : 반복문 돌면서 홀수인지 체크 --> 홀수면 Pass(continue)
		while(number <= 30) {
			// number++;
			if(number % 2 != 0) {
				number++;
				continue;
			}
			System.out.print(number + " ");
			number++;
		}
		System.out.println();
	}
}