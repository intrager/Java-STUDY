import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC22 {
	public static void main(String[] args) { 
		
		// upcasting
		// Cat ani = new Cat();
		// Object ani = new Cat();
		Animal ani = new Cat();	// upcasting
		ani.eat();	// 컴파일시점 -> Animal, 실행 시점에서는 -> Cat
		
		// ani.night();
		//Cat c = (Cat)ani;	// downcasting
		//c.night();
		// (Cat)ani.night(); // .(점)연산자가 캐스팅 연산자보다 더 우선순위임
		((Cat)ani).night();
		
		ani = new Dog();
		ani.eat();
		// 다형성
		// 상위 클래스가 하위 클래스에게 동일한 메세지로 서로 다르게 동작시키는 객체지향 원리
	
		Object o = new Dog();
		// o.eat();
		((Dog)o).eat();
	}
}
