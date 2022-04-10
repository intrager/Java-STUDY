import java.util.ArrayList;

import kr.inflearn.ObjectArray;
import kr.tpc.A;
import kr.tpc.B;

public class TPC37 {
	public static void main(String[] args) {
		//ObjectArray arr = new ObjectArray(5);	// default 10
		// 크기를 5만 설정해놨는데, 더 이상 추가하면 // Index out of Bounds 에러 뜸
		ArrayList arr = new ArrayList(5);	// Object[], 배열의 길이에 제약이 없다.
		arr.add(new A());
		arr.add(new B());	// Object배열을 가지고 있기 때문에 서로 다른 타입의 객체를 넣을 수 있다.
		arr.add(new A());
		arr.add(new A());
		arr.add(new B());
		arr.add(new B()); 
		for(int i = 0; i < arr.size(); i++) {
			Object o = arr.get(i);
			if(o instanceof A) {
				((A)o).go();
			} else {
				((B)o).go();
			}
		}
	}
}
