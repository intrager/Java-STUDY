package com.javatest;

import java.util.Scanner;

public class Main {
    static int[] combi;
    static int n, m;
    public void depthFirstSearch(int l, int s) {
        if(l == m) {
            for(int x : combi) System.out.print(x + " ");
            System.out.println();
        } else {
            for(int i = s; i <= n; i++) {
                combi[l] = i;
                depthFirstSearch(l + 1, i + 1);
            }
        }
    }
    public static void main(String[] args) {
        Main t = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        combi = new int[m];
        t.depthFirstSearch(0, 1);
    }
}
