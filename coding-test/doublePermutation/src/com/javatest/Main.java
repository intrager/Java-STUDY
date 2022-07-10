package com.javatest;

import java.util.Scanner;

public class Main {
    static int[] pm;
    static int n, m;
    public static void main(String[] args) {
        Main t = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        pm = new int[m];
        t.depthFirstSearch(0);
    }

    public void depthFirstSearch(int l) {
        if(l == m) {
            for(int x : pm) System.out.print(x + " ");
            System.out.println();
        } else {
            for(int i = 1; i <= n; i++) {
                pm[l] = i;
                depthFirstSearch(l + 1);
            }
        }
    }
}
