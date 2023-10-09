public class PrintfExample1 {
    public static void main(String[] args) {
        System.out.println(10.0/3);

        System.out.printf("%d%n", 15);
        System.out.printf("%#o%n", 15);
        System.out.printf("%#x%n", 15);
        System.out.printf("%s%n", Integer.toBinaryString(15));

        float f = 123.456789f;
        System.out.printf("%f%n", f);
        double d = 123.456789;
        System.out.printf("%f%n", d);
        double e = 123.456789;
        System.out.printf("%e%n", e);
        double g = 123.456789;
        System.out.printf("%g%n", g);

        System.out.printf("[%5d]%n", 1234567);
        System.out.printf("[%-5d]%n", 10);
        System.out.printf("[%05d]%n", 10);

        double ddd = 1.23456789;
        System.out.printf("%f%n",ddd);
        System.out.printf("%14.10f%n", ddd);
        System.out.printf("%14.6f%n", ddd);
        System.out.printf("%.6f%n", ddd);

        System.out.printf("%s%n", "www.codechobo.com");
        System.out.printf("[%20s]%n", "www.codechobo.com");
        System.out.printf("[%-20s]%n", "www.codechobo.com");
        System.out.printf("[%.10s]%n", "www.codechobo.com");
    }
}
