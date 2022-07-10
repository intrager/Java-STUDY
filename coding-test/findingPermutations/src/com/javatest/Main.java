package com.javatest;

import java.util.Scanner;

public class Main {
    static int n, m;
    static int[] arr, ch, pm;

    public void depthFirstSearch(int l) {
        if(l == m) {
            for (int x : pm) System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                if(ch[i] == 0) {
                    ch[i] = 1;
                    pm[l] = arr[i];
                    depthFirstSearch(l + 1);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
	    Main t = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
        ch = new int[n];
        pm = new int[m];
        t.depthFirstSearch(0);
    }
}