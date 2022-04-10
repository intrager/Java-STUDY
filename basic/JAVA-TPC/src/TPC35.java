public class TPC35 {
	public static void main(String[] args) {
		//     ==			equals()
		String str1 = new String("APPLE");
		String str2 = new String("APPLE");
		
		System.out.println(str1.toString());
		System.out.println(str2.toString());
		System.out.println(str1==str2);	// 주소까지 비교	// false
		System.out.println(str1.equals(str2));	// 내용물만 비교	// true
	
		String str3 = "APPLE";
		String str4 = "APPLE";
		System.out.println(str3);	// str3.toString()
		System.out.println(str4);	// str4.toString()
		System.out.println(str3==str4);	// true
		System.out.println(str3.equals(str4));	// true
	}
}
