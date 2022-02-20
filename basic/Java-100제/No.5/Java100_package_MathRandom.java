// 1부터 10 사이의 숫자가 무작위로 10개 출력되는 코드를 작성해보시오
// 예시) [2, 3, 9, 8, 0, 8, 5, 7, 2, 1]
// 이때, 0은 출력되면 안 된다.
// 이 문제는 랜덤 함수를 사용해서 무작위로 숫자를 출력할 수 있는지와 주의사항을 알고 있는지 묻는 문제이다.

public class Java100_package_MathRandom {
	public static void main(String[] args) {
		
		// [1] : 반복문 --> 랜덤 숫자 생성
		// 랜덤 숫자 생성 중 0을 제외하려면 --> 결과로 나오는 숫자에 1을 더해준다.
		for(int i = 0; i < 10; i++) {
			System.out.print((int)(Math.random() * 10 + 1) + "   ");
		}
		System.out.println();
	}
}

/*
	개인적으로는 아래 두 개 방법 중 에서 첫 번째 방법이 더 정확해보임
	
	((int)(Math.random() * 10)+ 1)
	↑ 위에는 정수형으로 바꾼 후 1 더함
	↓ 아래는 정수형으로 바꾸기 전에 1 더한 후 바꿈 
	(int)(Math.random() * 10 + 1)
*/