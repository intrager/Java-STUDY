package com.javatest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Lecture implements Comparable<Lecture> {
    public int money;
    public int time;

    Lecture(int money, int time) {
        this.money = money;
        this.time = time;
    }

    @Override
    public int compareTo(Lecture object) {
        return object.time - this.time;
    }
}

public class Main {
    static int n, max = Integer.MIN_VALUE;
    public int solution(ArrayList<Lecture> array) {
        int answer = 0;
        // Collections.reverseOrder()를 빼면 poll을 했을 때 작은 값부터 빼감
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(array);
        int j = 0;
        for(int i = max; i > 0; i--) {
            for( ; j < n; j++) {
                if(array.get(j).time < i) break; // time이 i날짜보다 작으면
                priorityQueue.offer(array.get(j).money);
            }
            // i 날짜에 강연을 할 수 있다 -> i날짜보다 일단 커야한다
            if(!priorityQueue.isEmpty()) answer += priorityQueue.poll(); // i 날짜에 어떤 강의를 할지 선택해야 함
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        ArrayList<Lecture> lecture = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            int money = kb.nextInt();
            int time = kb.nextInt();
            lecture.add(new Lecture(money, time));
            if(time > max) max = time;
        }
        System.out.println(T.solution(lecture));
    }
}
