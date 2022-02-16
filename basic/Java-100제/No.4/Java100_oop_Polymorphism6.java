// 다형성(polymorphism)을 활용한 객체 생성 시 배열과 반복문을 사용하여 객체를 생성해보시오
// 반복문은 향상된 for문으로도 출력해본다.
// 이 문제는 다형성을 이용한 객체 생성 시 배열과 for문을 통해서 자동으로 객체를 생성할 수 있는지를 묻는 문제이다.

abstract class Car {
	abstract void run();
}

class Ambulance extends Car {
	void run() {System.out.println("앰뷸런스 지나가요~");}
}

class Cultivator extends Car {
	void run() {System.out.println("경운기 지나가요~");}
}

class SportsCar extends Car {
	void run() {System.out.println("스포츠카 지나가요~");}
}

public class Java100_oop_Polymorphism6 {
	public static void main(String[] args) {
	
		// [1] : 배열 길이가 3인 Car 객체 배열 선언
		int[] array = new 
	}
}
