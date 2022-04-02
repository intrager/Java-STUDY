
public class TPC04 {
	public static void main(String[] args) {
		// 4. 데이터를 이동하라(변수 vs 배열)
		int a, b, c;
		a = 10;
		b = 20;
		c = 30;
		// a+b+c= ?	메서드 처리 -> hap()
		hap(a, b, c);
		
		int[] arr = new int[3];	// 바구니
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		
		hap1(arr);
	}
	
	public static void hap(int x, int y, int z) {
		int sum = x + y + z;
		System.out.println(sum);
	}
	
	public static void hap1(int[] x) {
		 // 반복문 활용 - for, while
		 //int sum = x[0] + x[1] + x[2];
		 int sum = 0;
		 for(int i = 0; i < x.length; i++) {
			 sum += x[i];
		 }
		 System.out.println(sum);
	}
	
	// -> 어떤 데이터(매개변수)가 다른 메서드로 이동하려면 배열을 만들어 넣어서 이동하는 게 낫다.
}
