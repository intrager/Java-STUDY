package com.javatest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point> { //Point 클래스의 객체를 정렬한다
    public int x, y; //인스턴스 변수

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if(this.x == o.x) return this.y - o.y; //오름차순 : this.y - o.y, 내림차순 : o.y - this.y
        else return this.x - o.x; // 오름차순 : this.x - o.x, 내림차순 : o.x - this.x
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Point> arr = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            int x = kb.nextInt();
            int y = kb.nextInt();
            arr.add(new Point(x, y));
        }
        Collections.sort(arr); //위의 compareTo메서드를 기준으로 잡고 정렬
        for(Point o : arr) {
            System.out.println(o.x + " " + o.y);
        }
    }
}
