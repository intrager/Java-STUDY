package com.javatest;

import java.util.Scanner;

/**
 * 문자 찾기
 */
public class Main {

    public int solution(String str, char t) {
        int answer = 0;
        str=str.toUpperCase();
        t=Character.toUpperCase(t);
        //System.out.println(str + " " + t);
        /*
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==t) {
                answer++;
            }
        }
        */
        for(char x : str.toCharArray()) // 문자 배열 객체를 생성해냄
            if(x==t) answer++;
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next(); // next()는 콘솔로 문자열 하나 읽어 들이는 것
        char c = kb.next().charAt(0);
        System.out.print(T.solution(str,c));
    }
}
