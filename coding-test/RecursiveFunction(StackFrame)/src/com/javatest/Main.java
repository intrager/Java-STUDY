package com.javatest;

public class Main {

    public void deepFirstSearch(int n) {
        if(n == 0) return;
        else {
            deepFirstSearch(n-1);
            System.out.print(n + " ");
        }
    }
    public static void main(String[] args) {
	    Main T = new Main();
	    T.deepFirstSearch(3);
    }
}
