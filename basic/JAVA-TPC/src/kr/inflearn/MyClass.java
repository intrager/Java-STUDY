package kr.inflearn;
// public 제거하면 default로 접근됨
public class MyClass {
	public int sum(int a, int b) {
		int hap = 0;
		for(int i = a; i <= b; i++) {
			hap += i;
		}
		return hap;
	}
}
