package com.javatest;

import java.util.ArrayList;
import java.util.Scanner;

class Point {
    public int x, y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Main {
    static int n, m, count, answer = Integer.MAX_VALUE;
    static int[] combination;
    static ArrayList<Point> pizza, house;
    public void DFS(int level, int start) {
        if(level == m) {
            int sum = 0;    //이 조합 경우에서 도시의 피자 배달 거리
            for(Point h : house) {
                int distance = Integer.MAX_VALUE;
                for(int i : combination) { //조합의 인덱스 번호가 하나하나 대응됨
                    // i는 살아남은 피자가게의 ArrayList 인덱스 번호
                    distance = Math.min(distance, Math.abs(h.x - pizza.get(i).x) + Math.abs(h.y - pizza.get(i).y));
                }
                sum += distance; //도시의 피자배달 거리
            }
            answer = Math.min(answer, sum); //기존 값보다 sum이 작으면 바꾸기
        } else {
            for(int i = start; i < count; i++) {
                combination[level] = i;
                DFS(level + 1, i + 1);
            }
        }
    }
    public static void main(String[] args) {
	    Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt(); // 살려야 할 피자가게 수
        pizza = new ArrayList<>();
        house = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                int tmp = kb.nextInt();
                if(tmp == 1) house.add(new Point(i, j));
                else if (tmp == 2) pizza.add(new Point(i, j));
            }
        }
        count = pizza.size();
        combination = new int[m];
        T.DFS(0, 0);
        System.out.println(answer);
    }
}
