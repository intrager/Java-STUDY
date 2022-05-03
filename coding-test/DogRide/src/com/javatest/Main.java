package com.javatest;

import java.util.Scanner;

public class Main {
    static int answer = Integer.MIN_VALUE, c, n;
    public void depthFirstSearch(int l, int sum, int[] arr) {
        if(sum > c) return;
        if(l == n) {
            answer = Math.max(answer, sum);
        } else {
            depthFirstSearch(l + 1, sum + arr[l], arr);
            depthFirstSearch(l + 1, sum, arr);
        }
    }
    public static void main(String[] args) {
	    Main t = new Main();
	    Scanner kb = new Scanner(System.in);
	    c = kb.nextInt();
	    n = kb.nextInt();
	    int[] arr = new int[n];
	    for(int i = 0; i < n; i++) {
	        arr[i] = kb.nextInt();
        }
	    t.depthFirstSearch(0, 0, arr);
	    System.out.println(answer);
    }
}
