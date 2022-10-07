package com.javatest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Banquet implements Comparable<Banquet> {
    public int time;
    public char state;

    Banquet(int time, char state) {
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(Banquet object) {
        // 시간이 같으면 알파벳 오름차순
        if(this.time == object.time) return this.state - object.state;
        else return this.time - object.time;
    }
}

public class Main {

    public int solution(ArrayList<Banquet> array) {
        int answer = Integer.MIN_VALUE; //최대값을 저장할 것이기 때문
        Collections.sort(array);
        int count = 0; // 이 순간에 몇 명이 존재하는가
        for(Banquet b : array) {
            if(b.state  == 's') count++;
            else count--;
            answer = Math.max(answer, count); //answer, 자신보다 count보다 크면 교체
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int reception = kb.nextInt();
        ArrayList<Banquet> friend = new ArrayList<Banquet>();

        for(int index = 0; index < reception; index++) {
            int start = kb.nextInt();
            int finish = kb.nextInt();
            friend.add(new Banquet(start, 's'));
            friend.add(new Banquet(finish, 'e'));
        }
        System.out.println(T.solution(friend));
    }
}
