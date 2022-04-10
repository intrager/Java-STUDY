package kr.tpc;

public class JavaMySQL implements ConnectDB {

	@Override
	public void getConnection(String url, String user, String password) {
		System.out.println("MySQL DB 연결을 시도합니다.");
	}

}
