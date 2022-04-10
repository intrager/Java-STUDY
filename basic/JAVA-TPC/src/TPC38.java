import java.util.ArrayList;
import java.util.List;

import kr.tpc.BookDTO;

public class TPC38 {
	public static void main(String[] args) {
		List<BookDTO> list = new ArrayList<BookDTO>(); // Object[] --> BookDTO[]
		
		list.add(new BookDTO("자바", 12000, "이지스", 630));
		list.add(new BookDTO("노드js", 20000, "영진", 700));
		list.add(new BookDTO("스프링", 40000, "제이펍", 800));
		
		for(int i = 0; i < list.size(); i++) {
			// Object o = list.get(i);
			BookDTO vo = list.get(i);
			System.out.println(vo.title + "\t" + vo.price + "\t" + vo.company + "\t" + vo.page);
		}
	}
}
