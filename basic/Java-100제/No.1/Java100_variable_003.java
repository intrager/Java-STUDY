// 자바의 Primitive Data Type의 바이트 크기와 비트 크기를 출력하는 코드를 구현하시오
// 정수형 타입과 문자형 타입에 대해서만 구현된다
// 이때, 각 타입의 최대값과 최솟값도 같이 구하여 출력하시오

public class Java100_variable_003 {
	public static void main(String[] args) {
		// byte, short, int, long, char
		System.out.println(Byte.BYTES);	// 바이트 계산
		System.out.println(Byte.SIZE);	// 비트 계산
		
		System.out.println("byte\t:" + Byte.BYTES + "(바이트)" + "-->" + Byte.SIZE + "(비트)\t" + Byte.MAX_VALUE + "\t, " + Byte.MIN_VALUE);
		System.out.println("short\t:" + Short.BYTES + "(바이트)" + "-->" + Short.SIZE + "(비트)\t" + Short.MAX_VALUE +"\t , "+ Short.MIN_VALUE);
		System.out.println("int\t:" + Integer.BYTES + "(바이트)" + "-->" + Integer.SIZE + "(비트)\t" + Integer.MAX_VALUE + "\t, " + Integer.MIN_VALUE);
		System.out.println("long\t:" + Long.BYTES + "(바이트)" + "-->" + Long.SIZE + "(비트)\t" + Long.MAX_VALUE + "\t, " + Long.MIN_VALUE);
		System.out.println("char\t:" + Character.BYTES + "(바이트)" + "-->" + Character.SIZE + "(비트)\t" + (int)Character.MAX_VALUE + "\t, " + (int)Character.MIN_VALUE);
	}
}  