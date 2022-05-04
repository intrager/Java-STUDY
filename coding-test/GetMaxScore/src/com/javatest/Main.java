package com.javatest;

import java.util.Scanner;

public class Main {
    static int answer = Integer.MIN_VALUE, n, m;
    boolean flag = false;
    public void depthFirstSearch(int l, int sum, int time, int[] ps, int[] pt) {
        if(time > m) return;
        if(l == n) {
            answer = Math.max(answer, sum);
        } else {
            depthFirstSearch(l + 1, sum + ps[l], time+pt[l], ps, pt);
            depthFirstSearch(l + 1, sum, time, ps, pt);
        }
    }
    public static void main(String[] args) {
	    Main t = new Main();
	    Scanner kb = new Scanner(System.in);
	    n = kb.nextInt();
	    m = kb.nextInt();
	    int[] a = new int[n];
	    int[] b = new int[n];
	    for(int i = 0; i < n; i++) {
	        a[i] = kb.nextInt();
	        b[i] = kb.nextInt();
        }
	    t.depthFirstSearch(0, 0, 0, a, b);
	    System.out.println(answer);
    }
}
