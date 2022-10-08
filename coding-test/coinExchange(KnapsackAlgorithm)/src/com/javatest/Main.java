package com.javatest;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n, m;
    static int[] dynamic;

    public int solution(int[] coin) {
        Arrays.fill(dynamic, Integer.MAX_VALUE); // 최대치로 다 초기화함
        dynamic[0] = 0; // 제일 앞에 있는 것은 0으로 초기화
        for (int i = 0; i < n; i++) {
            for(int j = coin[i]; j <= m; j++) { // 동전의 금액부터(coin[i]) 거슬러줄 금액까지 쭉 증가
                // dynamic[j] > dynamic[j-coin[i]] + 1 이면 바꿈
                dynamic[j] = Math.min(dynamic[j], dynamic[j-coin[i]] + 1);
            }
        }
        return dynamic[m];
    }

    public static void main(String[] args) {
	    Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        int[] array = new int[n];

        // 동전의 단위
        for(int index = 0; index < n; index++) {
            array[index] = kb.nextInt();
        }
        m = kb.nextInt(); //거슬러줄 금액
        dynamic = new int[m + 1]; //인덱스 번호가 m까지 생겨야 하므로
        System.out.println(T.solution(array));
    }
}
