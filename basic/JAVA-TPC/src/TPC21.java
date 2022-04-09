import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC21 {
	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.eat();
		
		Cat c = new Cat();
		c.eat();
		c.night();
		
		// Dog.class, Cat.class
		Animal ani = new Dog();	// 상속관계가 전제되어야 함. upcasting, 부모쪽으로 객체를 만듦
		ani.eat();	// 개처럼 먹는다.
		
		ani = new Cat();	// upcasting
		ani.eat();	// 고양이처럼 먹다
		((Cat)ani).night();	// downcasting
	}
}
