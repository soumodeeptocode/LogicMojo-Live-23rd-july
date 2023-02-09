package com.java.logicmojo.tree.binarytree;

import javax.swing.tree.TreeNode;

public class DeleteNode {

    public static Node delete(Node node, int key){
        if(node == null) return null;

        if(node.data == key) {
            //delete
            return deleteUtil(node);
        }
        Node temp = node;
        while(node != null) {
            if(node.data > key){
                if(node.left != null && node.left.data == key){
                    node.left = deleteUtil(node.left);
                }else{
                    node = node.left;
                }
            }else{
                if(node.right != null && node.right.data == key){
                    node.right = deleteUtil(node.right);
                }else{
                    node = node.right;
                }
            }
        }

        return temp;
    }

    private static Node deleteUtil(Node node){
        if(node.left == null) return node.right;
        else if(node.right == null) return node.left;
        else{
            Node rightChild = node.right;
            Node lastRight = findLastRight(node.left);
            lastRight.right = rightChild;
            return node.left;
        }
    }

    private static Node findLastRight(Node node){
        if(node.right == null) return node;

        return findLastRight(node.right);
    }

    private static void print(Node node){
        if(node == null) return;

        print(node.left);
        System.out.print(node.data + " ");
        print(node.right);
    }
    public static void main(String[] args) {

        Node root = new Node(9);

        root.right = new Node(12);
        root.right.left = new Node(10);
        root.right.right = new Node(13);

        root.left = new Node(5);

        root.left.left = new Node(3);
        root.left.left.left = new Node(1);
        root.left.left.right = new Node(4);

        root.left.right = new Node(7);
        root.left.right.left = new Node(6);
        root.left.right.right = new Node(8);

        System.out.println("Before delete a node :: ");
        print(root);

        Node temp = delete(root, 5);
        System.out.println();
        System.out.println("After delete :: ");
        print(temp);
    }
}
