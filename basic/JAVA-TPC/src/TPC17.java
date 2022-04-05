import kr.tpc.MovieVO;

public class TPC17 {
	public static void main(String[] args) {
		int[] a = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		int[] b = {10, 20, 30, 40, 50};
		
		int[] c = new int[] {10, 20, 30, 40, 50};
		
		for(int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		// 영화(제목, 가격, 주인공, 등급, 시간)
		MovieVO mv = new MovieVO("봉오동전투", 12345, "원신연", 12, 4.5f);
		
		System.out.println(mv.toString());	// toString()은 생략 가능
		
		// 영화 3편을 저장 -> 객체 배열
		MovieVO[] mvrr = new MovieVO[3];
		mvrr[0] = new MovieVO("봉오동전투", 12345, "작가1", 12, 4.5f);
		mvrr[1] = new MovieVO("청산리전투", 23456, "작가2", 11, 4.7f);
		mvrr[2] = new MovieVO("남산의 부장들", 34567, "작가3", 12, 4.9f);
		
		System.out.println(mvrr[0].toString());
		System.out.println(mvrr[1]);
		System.out.println(mvrr[2]);
		
		System.out.println("---------------------------");
		
		for(int i = 0; i < mvrr.length; i++) {
			System.out.println(mvrr[i]);
		}
	}
}
