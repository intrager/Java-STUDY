package com.javatest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Edge implements Comparable<Edge> {
    public int v1;
    public int v2;
    public int cost;
    Edge(int v1, int v2, int cost) {
        this.v1 = v1;
        this.v2 = v2;
        this.cost = cost;
    }
    @Override
    public int compareTo(Edge object) {
        return this.cost - object.cost;
    }
}
public class Main {
    static int[] unf;
    public static int Find(int v) {
        if(v == unf[v]) return v;
        else return unf[v] = Find(unf[v]);
    }
    public static void Union(int a, int b) {
        int fa = Find(a);
        int fb = Find(b);
        if(fa != fb) unf[fa] = fb;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt(); // vertex 개수
        int m = kb.nextInt(); // 도로(간선) 개수
        unf = new int[n + 1]; // Union & Find
        ArrayList<Edge> array = new ArrayList<>();
        for(int i = 1; i <= n; i++) unf[i] = i;
        for(int i = 0; i < m; i++) {
            int a = kb.nextInt(); // 도시
            int b = kb.nextInt(); // 간선
            int c = kb.nextInt(); // 가중치
            array.add(new Edge(a, b, c));
        }
        int answer = 0;
        Collections.sort(array);
        for(Edge object : array) {
            int fv1 = Find(object.v1);
            int fv2 = Find(object.v2);
            if(fv1 != fv2) {
                answer += object.cost;
                Union(object.v1, object.v2); // 한 집합으로 묶음
            }
        }
        System.out.println(answer);
    }
}
