package com.javatest;

public class Main {
    public void depthFirstSearch(int n) {
        if(n==0) return;
        else {
            depthFirstSearch(n/2);
            System.out.print(n%2 + " ");
        }
    }

    public static void main(String[] args) {
	    Main T = new Main();
	    T.depthFirstSearch(11);
    }
}
