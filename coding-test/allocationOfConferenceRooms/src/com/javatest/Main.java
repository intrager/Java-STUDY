package com.javatest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Conference implements Comparable<Conference> {
    public int start, finish;

    Conference(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }

    @Override
    public int compareTo(Conference object) {
        // 끝나는 시간이 같으면 시작 시간을 기준으로 오름차순
        if(this.finish == object.finish) return this.start - object.start; // this에서 매개변수로 넘어온 객체 빼서 오름차순(음수)
        else return this.finish - object.finish; //같지 않으면 끝나는 시간으로 내림차순
    }
}

public class Main {
    public int solution(ArrayList<Conference> array) {
        int count = 0;
        Collections.sort(array);
        int endTime = 0; //0시부터 시작하므로
        for(Conference con : array) {
            if(con.start >= endTime) { // 다음 회의 시작시간 >= 이전 회의 끝난 시간
                // 한 번 시작된 회의는 중단될 수 없음, 아래 두 줄의 순서는 상관없어보임
                endTime = con.finish; // 회의 하고서 끝난 시간을 삽입
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int selection = kb.nextInt();
        ArrayList<Conference> team = new ArrayList<Conference>();

        for(int index = 0; index < selection; index++) {
            int start = kb.nextInt();
            int finish = kb.nextInt();
            team.add(new Conference(start, finish));
        }
        System.out.println(T.solution(team));
    }
}
