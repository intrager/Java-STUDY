package com.javatest;

import java.util.Scanner;

public class Main {
    int[][] dy = new int[35][35];
    public int depthFirstSearch(int n, int r) {
        if(dy[n][r] > 0) return dy[n][r];
        if(n == r || r == 0) return 1;
        else return dy[n][r] = depthFirstSearch(n-1, r-1) + depthFirstSearch(n - 1, r);
    }

    public static void main(String[] args) {
	    Main t = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int r = kb.nextInt();
        System.out.println(t.depthFirstSearch(n, r));
    }
}
