// 추상 클래스와 상속을 사용하여 다형성 예제를 만들어보시오
// 이 문제는 추상 클래스와 상속의 개념을 이해하고 이를 활용하여 다형성을 구현할 수 있는지를 묻는 문제이다.

abstract class Car{
	abstract void run();
}

class Ambulance extends Car{
	void run() {System.out.println("앰뷸런스 지나가요~");}
}

class Cultivator extends Car{
	void run() {System.out.println("경운기 지나가요~");}
}

class SportsCar extends Car{
	void run() {System.out.println("스포츠카 지나가요~");}
}

public class Java100_oop_Polymorphism5 {
	public static void main(String[] args) {
	
		// [1] : 객체 생성
		Car carOne = new Ambulance();	// 정상
		Car carTwo = new Cultivator();	// 정상x
		Car carThree = new SportsCar();	// 정상
	
		// [2] : run() 메서드 호출
		carOne.run();
		carTwo.run();
		carThree.run();
	}	
}
	