import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC24 {
	public static void main(String[] args) {
		// 2. 다형성 배열
		// Dog, Cat 저장할 배열을 생성하시오	
		Animal[] ani = new Animal[2];
		ani[0] = new Dog();
		ani[1] = new Cat();
		
		for(int i = 0; i < ani.length; i++) {
			ani[i].eat();
			if(ani[i] instanceof Cat) {	// Cat 타입 인스턴스로 ani[i]가 만들어졌으면
				((Cat)ani[i]).night();
			}
		}	// for
		display(ani);
	}

	private static void display(Animal[] ani) {
		// 다형성 배열, 서로 다른 여러 개의 타입을 메서드와 배열을 통해서 묶어서 받아서 쓸 수 있다.
		for(int i = 0; i < ani.length; i++) {
			ani[i].eat();
			if(ani[i] instanceof Cat) {
				((Cat)ani[i]).night();
			}
		}	// for
		
	}
}
