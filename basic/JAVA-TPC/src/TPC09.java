public class TPC09 {
	public static void main(String[] args) {
		int a = 56;
		int b = 40;
		// a+b=?
		// int v = sum(a, b);
		TPC09 tpc = new TPC09();
		int v = tpc.sum(a, b);
		System.out.println(v);
	}
	
	public int sum(int a1, int b1) {
		int v1 = a1 + b1;
		return v1;
	}
}
