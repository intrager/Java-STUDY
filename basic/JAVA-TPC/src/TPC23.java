import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC23 {
	public static void main(String[] args) {
		// 1. 다형성인수
		Dog d = new Dog();
		display(d);	// 개처럼 먹는다.
		Cat c = new Cat();
		display(c);	// 고양이처럼 먹다
	}	// upcasting

	private static void display(Animal r) {	// 다형성 인수
		r.eat();
		// r.night();
		if(r instanceof Cat) {	// Cat 타입으로 인스턴스가 만들어졌으면 
			((Cat)r).night();	// downcasting // 밤에 눈에도 빛이 난다.
		}
	}
}
