package com.javatest;

import java.util.Scanner;

public class Main {
    static int[] dynamic;

    public int solution(int[] array) {
        int answer = 0;
        dynamic = new int[array.length];
        dynamic[0] = 1;
        for(int i = 1; i < array.length; i++) {
            int max = 0;    // 참이 되는 게 없으면 0으로 되어있어야 함
            for(int j = i - 1; j >= 0; j--) {
                // j번째 항이 i번째 항의 바로 앞 && j번째 항을 마지막 값으로 하는 최대 길이의 dynamic 값, 그 중 최대값
                if(array[j] < array[i] && dynamic[j] > max)
                    max = dynamic[j];
            }
            dynamic[i] = max + 1;
            answer = Math.max(answer, dynamic[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
	    Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt(); // 지역변수
        int[] array = new int[n];

        for(int index = 0; index < n; index++) {
            array[index] = kb.nextInt();
        }
        System.out.println(T.solution(array));
    }
}
