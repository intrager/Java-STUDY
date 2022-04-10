// import java.lang.*;
public class TPC34 {
	public static void main(String[] args) {
		// String
		String str = new String("APPLE");
		String lower = str.toLowerCase();
		System.out.println(lower);	// apple
		System.out.println(str.charAt(3)); // L
		System.out.println(str.length());	// 5
		System.out.println(str.indexOf("PL"));	// 2
		System.out.println(str.indexOf("PX"));	// -1
		System.out.println(str.replaceAll("P", "A"));	// AAALE
	}
}
