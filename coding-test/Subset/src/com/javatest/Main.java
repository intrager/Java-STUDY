package com.javatest;

import java.util.Scanner;

public class Main {

    static int n;
    static int[] ch;

    public void depthFirstSearch(int l) {
        if(l == n + 1) {
            String tmp = "";
            for(int i = 1; i <= n; i++) {
                if(ch[i] == 1) tmp+=(i + " ");
            }
            if(tmp.length() > 0) System.out.println(tmp);
        } else {
            ch[l] = 1;
            depthFirstSearch(l + 1);
            ch[l] = 0;
            depthFirstSearch(l + 1);
        }
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        ch = new int[n + 1];
        T.depthFirstSearch(1);
    }
}
