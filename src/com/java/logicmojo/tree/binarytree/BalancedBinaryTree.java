package com.java.logicmojo.tree.binarytree;

public class BalancedBinaryTree {

    public static boolean isBalanced(Node node){
        return (traversalUtil(node) != -1);
    }

    private static int traversalUtil(Node node){
        if(node == null) return 0;

        int leftHeight = traversalUtil(node.left);
        if(leftHeight == -1) return -1;
        int rightHeight = traversalUtil(node.right);
        if(rightHeight == -1) return -1;
        if(Math.abs(leftHeight - rightHeight) > 1) return -1;
        return Math.max(leftHeight, rightHeight) + 1;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        //root.right.left = new Node(6);
        //root.right.right = new Node(7);
        root.left.right.left = new Node(8);
        //root.right.right.left = new Node(9);
        //root.right.right.right = new Node(10);

        System.out.println(isBalanced(root));
    }
}
