package com.javatest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static int n, m, answer = Integer.MAX_VALUE;

    public void depthFirstSearch(int l, int sum, Integer[] arr) {
        if(sum > m) return ;
        if(l >= answer) return ;
        if(sum == m) {
            answer = Math.min(answer, l);
        } else {
            for(int i = 0; i < n; i++) {
                depthFirstSearch(l + 1, sum + arr[i], arr);
            }
        }
    }

    public static void main(String[] args) {
        Main t = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        Integer[] arr = new Integer[n];
        for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
        Arrays.sort(arr, Collections.reverseOrder());
        m = kb.nextInt();
        t.depthFirstSearch(0, 0, arr);
        System.out.println(answer);
    }
}
