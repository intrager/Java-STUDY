import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import kr.inflearn.BookDto;

public class Project01_A {
	public static void main(String[] args) {
		// Object(BookDto) -> JSON(String)
		BookDto dto = new BookDto("자바", 21000, "에이콘", 670);
		
		Gson gson = new Gson();
		String json = gson.toJson(dto);
		System.out.println(json); // {"title":"자바","price":21000,"company":"에이콘","page":670}
	
		// JSON(String) -> Object(BookDto)
		BookDto bookDto = gson.fromJson(json, BookDto.class);
		System.out.println(bookDto); // BookDto [title=자바, price=21000, company=에이콘, page=670]
		System.out.println(bookDto.getTitle() + "\t" + bookDto.getPrice());
	
		// Object(List<BookDto>) -> JSON(String) : [{  },{  },...]
		List<BookDto> list = new ArrayList<>();
		
		list.add(new BookDto("자바0", 21000, "에이콘0", 670));
		list.add(new BookDto("자바1", 31000, "에이콘1", 770));
		list.add(new BookDto("자바2", 41000, "에이콘2", 870));
		
		String jsonList = gson.toJson(list);
		System.out.println(jsonList);
		
		// JSON(String) -> Object(List<BookDto>)
		List<BookDto> bookList = gson.fromJson(jsonList, new TypeToken<List<BookDto>>(){}.getType());
		for(BookDto book : bookList) {
			System.out.println(book);
		}
	}
}
