package com.javatest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] tmp = arr.clone();    // clone()을 통한 깊은 복사, tmp를 정렬해도 arr은 그대로 있음.
        Arrays.sort(tmp);
        for(int i = 0; i < n; i++) {
            if(arr[i] != tmp[i]) answer.add(i+1);
        }

        return answer;
    }

    public static void main(String[] args) {
	    Main T = new Main();
	    Scanner kb = new Scanner(System.in);
	    int n = kb.nextInt();
	    int[] arr = new int[n];
	    for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
	    for(int x : T.solution(n, arr)) System.out.print(x + " ");
    }
}
