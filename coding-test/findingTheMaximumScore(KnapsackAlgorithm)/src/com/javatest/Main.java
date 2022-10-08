package com.javatest;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] dynamic = new int[m + 1];

        for(int i = 0; i < n; i++) {
            int perScore = kb.nextInt();
            int perTime = kb.nextInt();
            for(int j = m; j >= perTime; j--) {
                // dynamic[j] < dynamic[j -perTime] + perScore 면 max()로 최대값 바꿔줌
                dynamic[j] = Math.max(dynamic[j], dynamic[j -perTime] + perScore);
            }
        }
        System.out.println(dynamic[m]);
    }
}
