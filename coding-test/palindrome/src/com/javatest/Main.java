package com.javatest;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "NO";
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)) answer="YES";

//        str = str.toUpperCase();
//        int len = str.length();
//        for(int i = 0; i < len/2; i++) {
//            if(str.charAt(i) != str.charAt(len-i-1)) return "NO";
//        }
        return answer;
    }

    public static void main(String[] args) {
	    Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
