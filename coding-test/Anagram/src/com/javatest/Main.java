package com.javatest;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public String solution(String s1, String s2) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();  // 제너릭 타입 생략
        for(char x : s1.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for(char x : s2.toCharArray()) {
            if(!map.containsKey(x) || map.get(x) == 0) return "NO"; // x라는 키가 존재하냐 // 존재하지 않으면 아나그램이 아님
            map.put(x, map.get(x)-1); // getOrDefault를 하기엔 위에서 이미 키의 존재 여부를 확인한 상태라 get()으로 해도 됨
        }
        return answer;
    }

    public static void main(String[] args) {
	    Main T = new Main();
	    Scanner kb = new Scanner(System.in);
	    String a = kb.next();
	    String b = kb.next();
	    System.out.print(T.solution(a, b));
    }
}
