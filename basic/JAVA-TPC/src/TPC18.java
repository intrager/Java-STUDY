import com.google.gson.Gson;

import kr.tpc.BookVO;
import kr.tpc.MyUtil;

// import java.lang.*;	// 디폴트 패키지(생략)
public class TPC18 {
	public static void main(String[] args) {
		// 1. Java에서 제공해주는 클래스들, API
		// 문자열(String)
		java.lang.String str = new String("javaCoffee");	// 그냥 String으로 써도 됨
		System.out.println(str.toLowerCase());	// javacoffee	// java.lang.System
		
		// 2. 직접 만들어서 사용하는 클래스들이 있다. DTO/VO, DAO, Utility -> API
		MyUtil my = new kr.tpc.MyUtil();	// 매번 이럴 필요는 없고 import를 통해서 MyUtil만 찍으면 됨.
		int sum = my.hap();
		System.out.println(sum);
	
		// 3. 다른 회사에서 만들어놓은 클래스들, API
		// Gson -> Json : https://mvnrepository.com/
		Gson g = new Gson();
		BookVO vo = new BookVO("자바책", 123322, "이지스", 5001);
		String json = g.toJson(vo);
		System.out.println(json);
		// {"title":"자바책","price":123322,"company":"이지스","page":5001}
	}
}
