public class VariableExample5 {
    public static void main(String[] args) {
        char ch = 'A';

        int i = ch;
        int a = 'A';

        System.out.println(i + " " + a);

        String str = "";    // 빈 문자열(empty string)
        String str2 = "ABCD";
        String str3 = "123";
        String str4 = str2 + str3;
        System.out.println(str4);

        System.out.println("" + 7 + 7);
        System.out.println(7 + 7 + "");
    }
}
