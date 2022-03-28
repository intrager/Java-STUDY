package com.javatest;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public int solution(int[] arr, int n, int k) {
        int answer = -1;    // 다 돌았는데도 마지막에 뭐 없을 때 -1 출력
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());  //

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                for(int l = j + 1; l < n; l++) {
                    Tset.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        int cnt = 0;

        // Tset.remove(143);
        // System.out.println(Tset.size()); // 값(원소)의 개수

        // System.out.println("first : " + Tset.first());   // 내림차순 기준 : 최대값
        // System.out.println("last : " + Tset.last()); // 내림차순 기준 : 최소값

        for(int x : Tset) {
            cnt++;
            if(cnt == k) return x;
        }

        return answer;
    }

    public static void main(String[] args) {
	    Main T = new Main();
	    Scanner kb = new Scanner(System.in);
	    int n = kb.nextInt();
	    int k = kb.nextInt();
	    int[] arr = new int[n];
	    for(int i = 0; i < n; i++) {
	        arr[i] = kb.nextInt();
        }
	    System.out.println(T.solution(arr, n, k));
    }
}
