package me.brucehan.bytecode.magic;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.implementation.FixedValue;

import java.io.File;
import java.io.IOException;

import static net.bytebuddy.matcher.ElementMatchers.named;

public class Magician {
    public static void main(String[] args) {
/*        try {
            new ByteBuddy().redefine(Hat.class)
                    .method(named("pullOut")).intercept (FixedValue.value("Rabbit!"))
                    .make().saveIn(new File("/STUDY/Java-STUDY/middle/ManipulateCode-TheJava/brucehan/target/classes"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/
        System.out.println(new Hat().pullOut());
    }
}
