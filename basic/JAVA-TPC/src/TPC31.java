import kr.tpc.Inflearn;

public class TPC31 {
	public static void main(String[] args) {
		Inflearn inf = new Inflearn();	// The constructor Inflearn() is not visible

		// static 메서드인 java() 메서드는 굳이 객체를 통해서 호출할 필요가 없음.
		inf.tpc();
		//Inflearn.tpc();
		// inf.java();
		Inflearn.java();
		
		// Java API 생성자 private
		// System sys = new System();
		System.out.println("출력");
	}
}
