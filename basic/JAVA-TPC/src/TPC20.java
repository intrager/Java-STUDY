import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC20 {
	public static void main(String[] args) {
		// Animal이라는 부모 클래스를 사용하지 않음
		Dog d = new Dog();
		// Animal에 있는 eat()에서 재정의를 통해 '개처럼 먹는다'로 출력하도록 함.
		d.eat();
		
		Cat c = new Cat();
		c.eat();
		c.night();
		
		// Dog.class, Cat.class
		Animal ani = new Dog();	// upcasting(자동 형변환)
		ani.eat();	// 개처럼 먹는다.
		
		ani = new Cat();
		ani.eat();	// 고양이처럼 먹는다.
		((Cat)ani).night();	// 밤에도 눈에서 빛이 난다. --> downcastin(강제 형변환)
	}
}
