package com.javatest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point> {  // 포인트라는 클래스의 객체를 정렬한다.
    public int x,y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public int compareTo(Point po) {
        /**
         * 지금은 오름차순 정렬이긴 한데,
         * 이걸 내림차순으로 하고 싶다면?
         * -> if문 후의 결과 값(return)은 음수가 나와야 하므로 po.y - this.y로 바꿔주면 된다.
         * 마찬가지로, else문 후에는 po.x - this.x로 연산할 객체의 순서를 바꿔주면 된다.
         */
        if(this.x == po.x) return this.y-po.y;  // 리턴에서 뺀 값이 음수값이 되어야 한다.
        else return this.x - po.x;
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
        Collections.sort(arr);
        for(Point o : arr) System.out.println(o.x + " " + o.y);
    }
}
