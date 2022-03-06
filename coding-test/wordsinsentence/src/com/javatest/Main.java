package com.javatest;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE, pos;
        while((pos=str.indexOf(' ')) != -1) {
            String tmp = str.substring(0, pos); // 0부터 pos전까지
            int len = tmp.length();
            if(len > m) {
                m = len;
                answer = tmp;
            }
            str = str.substring(pos+1);
        }
        if(str.length() > m) answer = str;
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(T.solution(str));
    }

//    public String solution(String str) {
//        String answer = "";
//        int m = Integer.MIN_VALUE;
//        String[] s = str.split(" ");
//        for(String x : s) {
//            int len = x.length();
//            if(len > m) {
//                m = len;
//                answer = x;
//            }
//        }
//        return answer;
//    }
}
