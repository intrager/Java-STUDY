import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import kr.inflearn.BookDto;

public class Project01_A {
	public static void main(String[] args) {
		// Object(BookDto) -> JSON(String)
		BookDto dto = new BookDto("�ڹ�", 21000, "������", 670);
		
		Gson gson = new Gson();
		String json = gson.toJson(dto);
		System.out.println(json); // {"title":"�ڹ�","price":21000,"company":"������","page":670}
	
		// JSON(String) -> Object(BookDto)
		BookDto bookDto = gson.fromJson(json, BookDto.class);
		System.out.println(bookDto); // BookDto [title=�ڹ�, price=21000, company=������, page=670]
		System.out.println(bookDto.getTitle() + "\t" + bookDto.getPrice());
	
		// Object(List<BookDto>) -> JSON(String) : [{  },{  },...]
		List<BookDto> list = new ArrayList<>();
		
		list.add(new BookDto("�ڹ�0", 21000, "������0", 670));
		list.add(new BookDto("�ڹ�1", 31000, "������1", 770));
		list.add(new BookDto("�ڹ�2", 41000, "������2", 870));
		
		String jsonList = gson.toJson(list);
		System.out.println(jsonList);
		
		// JSON(String) -> Object(List<BookDto>)
		List<BookDto> bookList = gson.fromJson(jsonList, new TypeToken<List<BookDto>>(){}.getType());
		for(BookDto book : bookList) {
			System.out.println(book);
		}
	}
}
