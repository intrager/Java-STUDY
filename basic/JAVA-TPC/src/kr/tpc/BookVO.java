package kr.tpc;
// 책(Object) -> 제목, 가격, 출판사, 페이지 수... 
public class BookVO {
	public String title;
	public int price;
	public String company;
	public int page;
	// 디폴트 생성자 메서드 생략돼있음
	public BookVO() {
		// 초기화 작업
		title="자바";
		price=14000;
		company="이지스";
		page=700;
	}
	// 생성자 메서드의 중복정의(Overloading)
	public BookVO(String title, int price, String company, int page) {
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}
}
