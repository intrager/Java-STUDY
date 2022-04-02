import kr.bit.Book;
import kr.bit.PersonVO;

public class TPC03 {
	public static void main(String[] args) {
		// 관계를 이해하라. Primitive Data Type vs. User Define Data Type.
		// 정수 1개를 저장하기 위한 변수를 선언하시오.
		int a;
		a = 10;
		
		// 책 1권을 저장하기 위한 변수를 선언하시오.
		Book b;
		b = new Book();	// () 생성자 메서드
		// 실체 -> Instance, 인스턴스 ==> b는 객체(변수)
		b.title="자바";
		b.price=15000;
		b.company="한빛미디어";
		b.page=700;
		
		System.out.println(b.title + " " + b.price + " " + b.company + " " + b.page);
		
		PersonVO p;
		p = new PersonVO();
		p.name="brucehan";
		p.age=26;
		p.weight=68.9;
		p.height=178.7;
		
		System.out.print(p.name + "\t");
		System.out.print(p.age + "\t");
		System.out.print(p.weight + "\t");
		System.out.println(p.height + "\t");
		
	}
}
