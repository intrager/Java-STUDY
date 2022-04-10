package kr.poly;

public class TV implements RemoCon {
	int currCh = 70;
	@Override
	public void chUp() {
		if(currCh < RemoCon.MaxCh) {
			currCh++;
			System.out.println("TV의 채널이 올라간다. : " + currCh);		
		} else {
			currCh = 1;
			System.out.println("TV의 채널이 올라간다. : " + currCh);
		}
	}

	@Override
	public void chDown() {
		if(currCh > RemoCon.MinCh) {
			currCh--;
			System.out.println("TV의 채널이 내려간다. : " + currCh);
		} else {
			currCh = 100;
			System.out.println("TV의 채널이 내려간다. : " + currCh);
		}
	}

	@Override
	public void internet() {
		System.out.println("인터넷이 된다.");
	}
	// 추가적인 기능을 구현...
}
