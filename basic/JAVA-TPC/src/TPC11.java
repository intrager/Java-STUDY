import kr.tpc.BookVO;

public class TPC11 {
	public static void main(String[] args) {
		// 책 한 권을 저장하기 위한 객체를 생성하시오.
		BookVO b = new BookVO();
		b.title="자바스크립트";
		b.price=16000;
		b.company="에이콘";
		b.page=700;
		
		System.out.print(b.title +"\t");
		System.out.print(b.price +"\t");
		System.out.print(b.company +"\t");
		System.out.print(b.page +"\t");
		
		BookVO b1 = new BookVO();
		b1.title="리액트";
		b1.price=16000;
		b1.company="이지스퍼블리싱";
		b1.page=405;
		
		System.out.print(b1.title +"\t");
		System.out.print(b1.price +"\t");
		System.out.print(b1.company +"\t");
		System.out.print(b1.page +"\t");
	}
}
