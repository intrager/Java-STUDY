package com.javatest;

import java.util.Scanner;

public class Main {

    public int depthFirstSearch(int m) {
        if(m==1) return 1;
        else return m * depthFirstSearch(m - 1);
    }
    public static void main(String[] args) {
	    Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.depthFirstSearch(n));
    }
}
