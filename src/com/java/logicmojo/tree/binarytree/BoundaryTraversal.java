package com.java.logicmojo.tree.binarytree;

import java.util.ArrayList;
import java.util.List;

public class BoundaryTraversal {

    private static void doLeftBoundary(Node node, List<Integer> result){
        while(node != null){
            if(!isLeaf(node)) result.add(node.data);
            if(node.left != null) node = node.left;
            else node = node.right;
        }
    }

    private static void doRightBoundary(Node node, List<Integer> result){
        List<Integer> temp = new ArrayList<>();
        while(node != null){
            if(!isLeaf(node)) temp.add(node.data);
            if(node.right != null) node = node.right;
            else node = node.left;
        }

        for(int i = temp.size() -1; i >= 0; i--){
            result.add(temp.get(i));
        }
    }

    private static void doLeafBoundary(Node node, List<Integer> result){
        if(isLeaf(node)){
            result.add(node.data);
            return;
        }
        if(node.left != null) doLeafBoundary(node.left, result);
        if(node.right != null) doLeafBoundary(node.right, result);
    }

    public static List<Integer> doBoundaryTraversal(Node root){
        List<Integer> result = new ArrayList<>();

        if(!isLeaf(root)) result.add(root.data);

        //left boundary traversal//
            doLeftBoundary(root.left, result);
        //leaf node//
            doLeafBoundary(root, result);
        //right bondary traversal//
            doRightBoundary(root.right, result);

            return result;
    }

    private static boolean isLeaf(Node node){
        return (node.left == null && node.right == null);
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

        for(Integer it: doBoundaryTraversal(root)){
            System.out.print(it + " ");
        }
    }
}
