package com.javatest;

import java.util.ArrayList;
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
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        ArrayList<ArrayList<Edge>> graph = new ArrayList<ArrayList<Edge>>();
        for(int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Edge>());
        }
        int[] ch = new int[n+1];
        for(int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            int c = kb.nextInt();
            graph.get(a).add(new Edge(b, c));
            graph.get(b).add(new Edge(a, c));
        }
        int answer = 0;
        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(new Edge(1, 0));
        while(!priorityQueue.isEmpty()) {
            Edge tmp = priorityQueue.poll();
            int ev = tmp.vertex;
            if(ch[ev] == 0) {
                ch[ev] = 1;
                answer += tmp.cost;
                for(Edge object : graph.get(ev)) {
                    if(ch[object.vertex] == 0) priorityQueue.offer(new Edge(object.vertex, object.cost));
                }
            }
        }
        System.out.println(answer);
    }
}
