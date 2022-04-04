import kr.tpc.MemberVO;

public class TPC15 {
	public static void main(String[] args) {
		MemberVO m = new MemberVO("홍길동", 40, "010-1234-1234", "seoul"); // setter method 필요없음
		
		System.out.println(m.toString());
		
		MemberVO m1 = new MemberVO();
		m1.setName("고길동");
		m1.setAge(40);
		m1.setTel("010-1234-1234");
		m1.setAddr("경기도");
		
		System.out.print(m1.getName() + "\t");
		System.out.print(m1.getAge() + "\t");
		System.out.print(m1.getTel() + "\t");
		System.out.println(m1.getAddr() + "\t");
		
		System.out.println(m1);
	}
}
