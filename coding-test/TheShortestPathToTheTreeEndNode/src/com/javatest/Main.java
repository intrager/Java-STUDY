package com.javatest;

class Node {
    int data;
    Node lt, rt;
    public Node(int val) {
        data = val;
        lt=rt=null;
    }
}
public class Main {
    Node root;
    public int depthFirstSearch(int l, Node root) {
        if(root.lt == null && root.rt == null) return l;
        else return Math.min(depthFirstSearch(l +1, root.lt), depthFirstSearch(l + 1, root.rt));
    }
    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.depthFirstSearch(0, tree.root));
    }
}
