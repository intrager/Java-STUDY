package kr.tpc;

public class JavaOracle implements ConnectDB {

	@Override
	public void getConnection(String url, String user, String password) {
		System.out.println("Oracle DB 연결을 시도합니다.");		
		
	}

}
