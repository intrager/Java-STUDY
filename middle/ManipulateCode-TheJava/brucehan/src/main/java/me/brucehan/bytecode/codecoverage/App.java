package me.brucehan.bytecode.codecoverage;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        ClassLoader classLoader = App.class.getClassLoader();
        System.out.println(classLoader);
        System.out.println(classLoader.getClass());
        System.out.println(classLoader.getParent());
        System.out.println(classLoader.getParent().getParent());
    }
}
