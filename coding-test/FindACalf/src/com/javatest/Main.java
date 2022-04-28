package com.javatest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    int answer = 0;
    int[] dis = {1, -1, 5};
    int[] ch;
    Queue<Integer> q = new LinkedList<>();
    public int breadthFirstSearch(int s, int e) {
        ch = new int[10001];
        ch[s] = 1;
        q.offer(s);
        int l = 0;
        while(!q.isEmpty()) {
            int len = q.size();
            for(int i = 0; i < len; i++) {
                int x = q.poll();
                // if(x == e) return l;
                for(int j = 0; j < 3; j++) {
                    int nx = x + dis[j];
                    if (nx == e) return l+1;
                    if(nx >= 1 && nx <= 10000 && ch[nx] == 0) {
                        ch[nx] = 1;
                        q.offer(nx);
                    }
                }
            }
            l++;
        }
        return 1;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int s = kb.nextInt();
        int e = kb.nextInt();
        System.out.println(T.breadthFirstSearch(s, e));
    }
}
