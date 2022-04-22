package com.javatest;

import java.util.Scanner;

public class Main {
    // n = 45 기준 첫 번째에 비해 두 번째는 10배정도 빨라짐.
    // 세 번째에서는 거의 1초만에 나옴 (세 번째 : Memoization)
    static int[] fibo;
    public int depthFirstSearch(int n) {
        if(fibo[n] > 0) return fibo[n];
        if(n==1) return fibo[n] = 1;
        else if (n==2) return fibo[n] = 1;
        else return fibo[n] = depthFirstSearch(n-2) + depthFirstSearch(n-1);
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        fibo = new int[n+1];
        T.depthFirstSearch(n);
        for(int i = 1; i <= n; i++) System.out.print(fibo[i] + " ");
    }
}
