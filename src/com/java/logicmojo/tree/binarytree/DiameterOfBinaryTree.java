package com.java.logicmojo.tree.binarytree;

public class DiameterOfBinaryTree {

    public static int doFindDiameter(Node node){
        int diameter[] = new int[1];
        height(node, diameter);
         return diameter[0];
    }

    private static int height(Node node, int[] diameter) {
        if (node == null) return 0;

        int leftHeight = height(node.left, diameter);
        int rightHeight = height(node.right, diameter);
        diameter[0] = leftHeight + rightHeight;
        return Math.max(leftHeight, rightHeight) + 1;
    }
    public static void main(String[] args) {

    }
}
