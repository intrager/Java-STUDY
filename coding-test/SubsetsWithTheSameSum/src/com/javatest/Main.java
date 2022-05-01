package com.javatest;

import java.util.Scanner;

public class Main {
    static String answer = "NO";
    static int n, total = 0;
    boolean flag = false;

    public void depthFirstSearch(int l, int sum, int[] arr) {
        if(flag) return;
        if(sum > total/2) return;
        if(l == n) {
            if((total-sum) == sum) {
                answer = "YES";
                flag = true;
            }
        } else {
            depthFirstSearch(l+1, sum+arr[l], arr);
            depthFirstSearch(l+1, sum, arr);
        }
    }
    public static void main(String[] args) {
        Main t = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
            total += arr[i];
        }
        t.depthFirstSearch(0, 0, arr);
        System.out.println(answer);
    }
}
