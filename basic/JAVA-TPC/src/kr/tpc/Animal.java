package kr.tpc;

public class Animal extends Object {
	// Dog, Cat --> eat()
	public void eat() {
		System.out.println("고양이처럼 먹다");	// 포괄적, 추상적
	}
	public Animal() {
		super();	// new Object()
	}
}
