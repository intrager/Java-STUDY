package com.javatest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge implements Comparable<Edge> {
    public int vertex;
    public int cost;
    Edge(int vertex, int cost) {
        this.vertex = vertex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge object) {
        return this.cost - object.cost;
    }
}

public class Main {
    static int n, m;
    static ArrayList<ArrayList<Edge>> graph;
    static int[] dis;
    public void solution(int v) {
        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(new Edge(v, 0));
        dis[v] = 0;
        // 본격 다익스트라가 도는 부분
        while(!priorityQueue.isEmpty()) {
            Edge tmp = priorityQueue.poll();
            int now = tmp.vertex;
            int nowCost = tmp.cost;
            if(nowCost > dis[now]) continue;
            for(Edge object : graph.get(now)) {
                if(dis[object.vertex] > nowCost + object.cost) {
                    dis[object.vertex]  = nowCost + object.cost;
                    // object.vertex로 가는데 드는 비용인 nowCost + object.cost
                    priorityQueue.offer(new Edge(object.vertex, nowCost + object.cost));
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new ArrayList<ArrayList<Edge>>();
        for(int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Edge>());
        }
        dis = new int[n+1];
        Arrays.fill(dis, Integer.MAX_VALUE);
        for(int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            int c = kb.nextInt();
            graph.get(a).add(new Edge(b, c));
        }
        T.solution(1);
        for(int i = 2; i <= n; i++) {
            if(dis[i] != Integer.MAX_VALUE) System.out.println(i + " : " + dis[i]);
            else System.out.println(i + " : impossible");
        }
    }
}
