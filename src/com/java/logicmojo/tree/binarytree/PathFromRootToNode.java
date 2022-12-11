package com.java.logicmojo.tree.binarytree;

import java.util.ArrayList;
import java.util.List;

public class PathFromRootToNode {

    public static boolean getPath(Node node, List<Integer> pathArr, int val){
        //
        if(node == null) return false;

        pathArr.add(node.data);

        //
        if(node.data == val) return true;

       if(getPath(node.left, pathArr, val) || getPath(node.right, pathArr, val)){
           return true;
       }

       //backtracking to the parent node//
       pathArr.remove(pathArr.size() -1);
       return false;
    }

    public static void main(String[] args) {
            Node root = new Node(1);
            root.left = new Node(2);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.left.right.left = new Node(6);
            root.left.right.right = new Node(7);
            root.right = new Node(3);

            List<Integer> result = new ArrayList<>();

            if(getPath(root, result, 9)){
                for(Integer it: result) System.out.print(it + " ");
            }else{
                System.out.println("The node is not present.");
            }
    }
}
