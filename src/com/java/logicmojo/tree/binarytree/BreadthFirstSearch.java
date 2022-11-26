package com.java.logicmojo.tree.binarytree;

import java.util.ArrayList;
import java.util.List;

public class BreadthFirstSearch {

    private static void levelOrderUtil(List<List<Integer>> result, int level, Node node){

        if(result.size() == level){
            result.add(new ArrayList<>());
        }

        //adding values of current level//
        result.get(level).add(node.data);

        //process my child//
        if(node.left != null) levelOrderUtil(result, level + 1, node.left);
        if(node.right != null) levelOrderUtil(result, level + 1, node.right);
     }

    public static List<List<Integer>> levelOrder(Node root){
        List<List<Integer>> result = new ArrayList<>();
        int level = 0;

        levelOrderUtil(result, 0, root);

        return result;
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(6);
        root.left.left = new Node(15);
        root.right.left = new Node(8);
        root.right.right = new Node(7);

        List<List<Integer>> res = levelOrder(root);
    }
}
