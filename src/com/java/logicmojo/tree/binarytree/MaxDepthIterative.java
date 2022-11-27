package com.java.logicmojo.tree.binarytree;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MaxDepthIterative {

    public static int maxDepthUsingQueue(Node node){
        if(node == null) return 0;

        int maxDepth = 1;
        Queue<Node> q = new LinkedList<>();

        q.offer(node);
        q.offer(null);

        while(!q.isEmpty()){
            Node temp = q.poll();
            if(temp != null){
                if(temp.left != null) q.offer(temp.left);
                if(temp.right != null) q.offer(temp.right);
            }else{
                if(!q.isEmpty()){
                    maxDepth ++;
                    q.offer(null);
                }
            }

        }
        return maxDepth;
    }

    public static int maxDepthUsingStack(Node node){
        if(node == null) return 0;

        int maxDepth = 0;
        Stack<Node> st = new Stack<>();

        //first step//
        st.push(node);
        Node prev = null;
        while(!st.isEmpty()){
            Node curr = st.peek();
            if(prev == null || prev.left == curr || prev.right == curr){
                if(curr.left != null) st.push(curr.left);
                else if(curr.right != null) st.push(curr.right);
            }else if(curr.left == prev){
                if(curr.right != null) st.push(curr.right);
            }else{
                st.pop();
            }
        prev = curr;
            if(st.size() > maxDepth) maxDepth = st.size();
        }
        return maxDepth;
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(6);
        root.right = new Node(7);
        root.left.left = new Node(8);
        root.left.right = new Node(9);
        root.left.right.left = new Node(3);

        System.out.println(maxDepthUsingStack(root));
        System.out.println(maxDepthUsingQueue(root));
    }
}
