package com.javatest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 키를 내림차순으로 해놓고, 몸무게를 검사해서 이전 값보다 커야 선발됨.
 * 작으면 이전 선수보다 키도 작고 몸무게도 적은 선수라 선발 안 됨
 */
class Sumo implements Comparable<Sumo> { // Sumo 클래스의 객체를 정렬
    public int height, weight;

    Sumo(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Sumo object) {
        return object.height - this.height; //내림차순
    }
}

public class Main {
    public int solution (ArrayList<Sumo> array, int n) {
        int count = 0;
        Collections.sort(array);
        int max = Integer.MIN_VALUE;
        for(Sumo s : array) {
            if(s.weight > max) {
                max = s.weight;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int selection = kb.nextInt();
        ArrayList<Sumo> sumoArr = new ArrayList<Sumo>();

        for(int index = 0; index < selection; index++) {
            int hei = kb.nextInt();
            int wei = kb.nextInt();
            sumoArr.add(new Sumo(hei, wei));
        }
        System.out.println(T.solution(sumoArr, selection));
    }
}
