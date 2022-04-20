package com.javatest;

import java.util.Scanner;

public class Main {

    public int depthFirstSearch(int n) {
        if(n==1) return 1;
        else if (n==2) return 1;
        else return depthFirstSearch(n-2) + depthFirstSearch(n-1);
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        for(int i = 1; i < n; i++) System.out.println(T.depthFirstSearch(i) + " ");
    }
}
