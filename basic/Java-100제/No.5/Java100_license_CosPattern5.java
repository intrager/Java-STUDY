// Cos Pro 2급, 1급 문제에서 자주 나오는 패턴 중 하나인 2차원 배열을 구현해보시오
// 이때, Shape는 5X5 구조로 생성하여 값을 입력하고 출력도 해보시오
// 특정 좌표에는 '★'을 입력해보시오

public class Java100_license_CosPattern5 {
	public static void main(String[] args) {
		
		// [1] : 2차원 배열의 행과 열 선언
		int row = 5, column = 5;
		
		// [2] : char 2차원 배열 선언 및 요소 값 입력 세팅
		char[][] array = new char[][] {
			{'□','□','□','□','□'},
			{'□','□','□','□','□'},
			{'□','□','★','□','□'},
			{'□','□','□','□','□'},
			{'□','□','□','□','□'},
		};
		
		// [3] : 2차원 배열에 들어있는 요소 값들을 출력 --> 반복문을 이용
		System.out.println("----------------------");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++)
				System.out.print(array[i][j] + " ");
			System.out.println();
		}
		System.out.println("----------------------");
	}
}