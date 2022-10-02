package com.javatest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
    public int x, y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] board, dis;
    static int n, m;
    static Queue<Point> Q = new LinkedList<>();
    public void BFS() {
        while(!Q.isEmpty()) {
            Point tmp = Q.poll();
            for(int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if(nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    Q.offer(new Point(nx, ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        m = kb.nextInt(); //열
        n = kb.nextInt(); //행
        board = new int[n][m];
        dis = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) { //토마토의 정보 읽음
                board[i][j] = kb.nextInt();
                if(board[i][j] == 1) Q.offer(new Point(i, j)); //익은 토마토의 위치, 미리 출발점들 다 넣어놔라
            }
        }
        T.BFS();
        boolean flag = true; //익지 않을 수도 있다
        int answer = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(board[i][j] == 0) flag = false; //익지 않은 토마토가 있다? -> -1 출력
            }
        }
        if(flag) { //다 익었다?
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    answer = Math.max(answer, dis[i][j]); //최댓값 answer에 삽입
                }
            }
            System.out.println(answer);
        } else
            System.out.println(-1);
    }
}
