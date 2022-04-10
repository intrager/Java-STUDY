import kr.poly.A;

public class TPC28 {
	public static void main(String[] args) {
		
		A a = new A();
		a.display();
		
		// System.out.println(a.toString());
		/**
		 * A클래스에 있던 재정의한 toString()을 지우면
		 * Object 클래스의 toString()이 실행됨
		 * 재정의된 메서드입니다. -> 객체의 주소
		 */
		System.out.println(a);
		
		Object o = new A();	// upcasting
		((A)o).display();
		System.out.println(o.toString());
	}
}
