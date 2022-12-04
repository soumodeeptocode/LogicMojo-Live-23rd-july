package com.java.logicmojo.tree.binarytree;

public class CheckIdenticalTrees {

    public static boolean isIdentical(Node node1, Node node2){
        if(node1 == null && node2 == null) return true;
        else if(node1 == null || node2 == null) return false;

        return ((node1.data == node2.data) && isIdentical(node1.left, node2.left) && isIdentical(node1.right, node2.right));
    }

    public static void main(String[] args) {

    }
}
