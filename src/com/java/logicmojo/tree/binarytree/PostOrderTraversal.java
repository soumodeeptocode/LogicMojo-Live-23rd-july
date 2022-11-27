package com.java.logicmojo.tree.binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrderTraversal {

    public static List<Integer> postOrderTraversalUsing1Stack(Node curr){
        List<Integer> res = new ArrayList<>();

        if(curr == null) return res;

        Stack<Node> st = new Stack<>();

        while(curr != null || !st.isEmpty()){

            if(curr != null){
                st.push(curr);
                curr = curr.left;
            }else{
                Node temp = st.peek().right;

                if(temp == null){
                    temp = st.pop();
                    res.add(temp.data);
                    while(!st.isEmpty() && temp == st.peek().right){
                        temp = st.pop();
                        res.add(temp.data);
                    }
                }else{
                    curr = temp;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.right.left = new Node(8);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);

        List<Integer> list = postOrderTraversalUsing1Stack(root);

        for(int it : list){
            System.out.print(it + " ");
        }
    }
}
