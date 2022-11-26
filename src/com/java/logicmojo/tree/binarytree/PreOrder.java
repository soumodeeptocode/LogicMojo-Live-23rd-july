package com.java.logicmojo.tree.binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrder {

    public static List<Integer> preOrderIterative(Node node){
        List<Integer> res = new ArrayList<>();

        Stack<Node> st = new Stack<>();

        if(node == null) return res;

        st.push(node);

        while(!st.isEmpty()){
            Node temp = st.peek();
            res.add(temp.data);
            st.pop();
            if(temp.right != null) st.push(temp.right);
            if(temp.left != null) st.push(temp.left);
        }
    return res;
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(6);
        root.left.left = new Node(15);
        root.right.left = new Node(8);
        root.right.right = new Node(7);

        List<Integer> res = preOrderIterative(root);

        for(int it: res){
            System.out.println(it);
        }
    }
}
