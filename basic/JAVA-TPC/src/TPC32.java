import kr.tpc.ConnectDB;
import kr.tpc.JavaMySQL;
import kr.tpc.JavaOracle;

public class TPC32 {
	public static void main(String[] args) {
		// Oracle, MySQL -> Driver class
		ConnectDB conn = new JavaOracle();
		conn.getConnection("url", "bit", "12345");
		
		conn = new JavaMySQL();
		conn.getConnection("url", "root", "ABCDEF");
	}
}
