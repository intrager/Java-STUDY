package com.javatest;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node lt, rt;
    public Node(int val) {
        data = val;
        lt=rt=null;
    }
}

public class Main {
    Node root;
    public int breadthFirstSearch(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int l = 0;
        while(!q.isEmpty()) {
            int len = q.size();
            for(int i = 0; i < len; i++) {
                Node cur = q.poll();
                if(cur.lt == null && cur.rt == null) return l;
                if(cur.lt!=null) q.offer(cur.lt);   // add도 가능
                if(cur.rt!=null) q.offer(cur.rt);   // add도 가능
            }
            l++;
        }
        return 1;   // 아무 값이나 해도 됨
    }

    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.breadthFirstSearch(tree.root));
    }
}
