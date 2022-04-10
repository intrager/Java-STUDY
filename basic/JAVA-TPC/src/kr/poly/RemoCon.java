package kr.poly;

public interface RemoCon {	// 객체 생성 안 됨
	// 얘네는 본디 final static이 붙어있는 상수로 사용 가능
	int MaxCh = 100;	// public static final int MaxCh
	public final static int MinCh = 1;		// public static final int MinCh
	// 추상메서드
	public void chUp();	// abstract가 생략되어있음(묵시적임)
	public void chDown();
	public void internet();
}
