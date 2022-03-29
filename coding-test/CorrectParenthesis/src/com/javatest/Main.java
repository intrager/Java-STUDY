package com.javatest;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public String solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>(); // stack 객체 생성
        for(char x : str.toCharArray()) { // 이 str을 기반으로 문자 배열이 만들어짐.
            if(x == '(') stack.push(x);
            else {
                if (stack.isEmpty()) return "NO";   // 닫는 괄호가 많을 때
                stack.pop();    // 바로 위 if에서 거짓으로 판명되면 어차피 pop을 해야함.
            }
        }
        if(!stack.isEmpty()) return "NO"; // (, 여는 괄호가 많은 상황

        return answer;  // 최종적 YES
    }

    public static void main(String[] args) {    // stack 하면 떠오르는 문제 // LIFO
	    Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
