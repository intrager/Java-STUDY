// 사용자 입력을 받아 2차원 배열을 생성하고 값을 입력하는 코드를 구현하시오
// 이때, 중첩 반복문을 사용하여 출력도 같이 해보시오
// 이 문제는 배열 생성 시 사용자로부터 입력을 받아서 2차원 배열을 만들 수 있는지 묻는 문제이다.

import java.util.Scanner;

public class Java100_array_TwoArrayUserInput {
	public static void main(String[] args) {
	
		// [1] : 사용자 입력을 위한 객체 선언
		Scanner sc = new Scanner(System.in);
		
		// [2] : 2차원 배열의 행과 열 선언 --> 사용자 입력으로 처리
		System.out.println("행의 개수를 입력하고 [Enter] 치세요 = ");
		int readRow = sc.nextInt();
		System.out.println("열의 개수를 입력하고 [Enter] 치세요 = ");
		int readColumn = sc.nextInt();
		
		// [3] : char 2차원 배열 선언 --> 사용자로부터 R, C 입력 받아서 --> hangMap[readRow][readColumn]
		char[][] hangMap = new char[readRow][readColumn];
		
		// [4] : 사용자 입력을 받아서 저장할 String 배열 선언 --> 이때, 크기를 [readRow]로 해주도록 한다.
		// 크기를 R 만큼만 해주면 되는 이유? --> 어차피 사용자가 입력하는 값은 안쪽 for문을 돌면서 2차원 배열에 입력되기 때문
		String [] strAr = new String[readRow];
		
		// [5] : 2차원 배열 요소 --> 사용자가 입력하는 값으로 세팅
		for(int i = 0; i < readRow; i++) {
			System.out.println("행에 입력할 문자 5개를 차례대로 입력하고 [Enter] 치세요 = ");
			strAr[i] = sc.next();
			for(int j = 0; j < readColumn; j++) {
				hangMap[i][j] = strAr[i].charAt(j);
			}
		}
	}
}