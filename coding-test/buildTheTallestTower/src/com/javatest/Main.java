package com.javatest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Brick implements Comparable<Brick> {
    public int square, height, weight;

    Brick(int square, int height, int weight) {
        this.square = square;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Brick object) {
        return object.square - this.square; // 넓이 기준 내림차순
    }
}

public class Main {
    static int[] dynamic; //전역

    public int solution(ArrayList<Brick> array) {
        int answer = 0;
        Collections.sort(array);
        dynamic[0] = array.get(0).height; //높이 구하는 문제이므로
        answer = dynamic[0];
        for(int i = 1; i < array.size(); i++) {
            int maxHeight = 0;
            for(int j = i - 1 ;j >= 0; j--) {
                if(array.get(j).weight > array.get(i).weight && dynamic[j] > maxHeight) {
                    maxHeight = dynamic[j];
                }
            }
            dynamic[i] = maxHeight + array.get(i).height;
            answer = Math.max(answer, dynamic[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Brick> array = new ArrayList<Brick>();
        dynamic = new int[n];

        for(int index = 0; index < n; index++) {
            int square = kb.nextInt();
            int height = kb.nextInt();
            int weight = kb.nextInt();
            array.add(new Brick(square, height, weight));
        }
        System.out.println(T.solution(array));
    }
}
