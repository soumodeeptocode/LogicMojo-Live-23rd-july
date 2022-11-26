package com.java.logicmojo.tree.binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrder {

    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(6);
        root.left.left = new Node(15);
        root.right.left = new Node(8);
        root.right.right = new Node(7);

        List<Integer> res = inOrderIterative(root);

        for(int it: res){
            System.out.println(it);
        }
    }

    private static List<Integer> inOrderIterative(Node node) {
        List<Integer> res = new ArrayList<>();

        Stack<Node> st = new Stack<>();
        while(true) {
            if (node != null) {
                st.push(node);
                node = node.left;
            } else {
                if (st.isEmpty()) break;
                Node temp = st.peek();
                res.add(temp.data);
                st.pop();
                node = temp.right;
            }
        }
        return res;
    }
}
