package com.java.logicmojo.tree.binarytree;

import java.util.ArrayList;
import java.util.List;

public class LeftView {

    public static List<Integer> findLeftView(Node root){
        List<Integer> result = new ArrayList<>();
        leftViewUtil(root, result, 0);
        return result;
    }

    private static void leftViewUtil(Node node, List<Integer> list, int level){
        if(node == null){
            return;
        }

        if(level == list.size()){
            list.add(node.data);
        }

        leftViewUtil(node.left, list, level + 1);
        leftViewUtil(node.right, list, level + 1);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(9);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(10);
        root.left.right.left = new Node(6);
        root.right.right.left = new Node(11);

        for(Integer it: findLeftView(root)){
            System.out.print(it + " ");
        }
    }
}
