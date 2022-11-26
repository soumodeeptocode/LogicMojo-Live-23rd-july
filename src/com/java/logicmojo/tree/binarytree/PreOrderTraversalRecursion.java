package com.java.logicmojo.tree.binarytree;

public class PreOrderTraversalRecursion {

    public static void doPreOrderTraversal(Node node){
        if(node == null) return;

        /**
                PreOrder means (Root, Left, Right)
         */
        System.out.print(node.data+" ");
        doPreOrderTraversal(node.left);
        doPreOrderTraversal(node.right);

        /**
         *  InOrder means (Left, Root, Right)

         */
        doPreOrderTraversal(node.left);
        System.out.print(node.data + " ");
        doPreOrderTraversal(node.right);

        /**
         *  PostOrder means (Left, Right, Root)

         */
        doPreOrderTraversal(node.left);
        doPreOrderTraversal(node.right);
        System.out.print(node.data + " ");
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(8);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);

        doPreOrderTraversal(root);

    }
}
