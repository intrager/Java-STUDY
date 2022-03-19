package com.javatest;

import java.util.Scanner;

public class Main {

    public int solution(int n, int m, int[] arr) {
        int answer = 0, sum = 0, lt = 0;
        for(int rt = 0; rt < n; rt++) {
            sum += arr[rt]; // lt부터 rt까지의 합
            if(sum==m) answer++;
            while(sum >= m) {
                sum -= arr[lt++];   // arr배열의 lt 인덱스값을 먼저 빼고 lt를 1씩 증가
                if(sum==m) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.print(T.solution(n, m, arr));
    }
}
