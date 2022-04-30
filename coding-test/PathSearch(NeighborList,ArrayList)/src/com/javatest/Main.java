package com.javatest;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int n, m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;	// Integer형의 ArrayList 객체를 저장하는 ArrayList ?
    static int[] ch;
    public void depthFirstSearch(int v) {
		if(v == n) answer++;
		else {
			for(int nv : graph.get(v)) {
				if(ch[nv] == 0) {
					ch[nv] = 1;
					depthFirstSearch(nv);
					ch[nv] = 0;
				}
			}
		}
    }
    public static void main(String[] args) {
	    Main t = new Main();
	    Scanner kb = new Scanner(System.in);
	    n = kb.nextInt();
	    m = kb.nextInt();
	    graph = new ArrayList<ArrayList<Integer>>();
	    for(int i = 0; i <= n; i++) {	// 객체 생성
	        graph.add(new ArrayList<Integer>());
        }
	    ch = new int[n+1];	// 체크 배열 길이
	    for(int i = 0; i < m; i++) {
	        int a = kb.nextInt();
	        int b = kb.nextInt();
	        graph.get(a).add(b);	// a번 ArrayList에 접근
        }
	    ch[1] = 1;
	    t.depthFirstSearch(1);
	    System.out.println(answer);
    }
}
