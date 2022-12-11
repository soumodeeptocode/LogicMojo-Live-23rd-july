package com.java.logicmojo.tree.binarytree;

public class SearchBST {

    public static Node doSearch(Node node, int key){
        if(node == null) return null;

        if(key < node.data){
            return doSearch(node.left, key);
        }else if(key > node.data){
            return doSearch(node.right, key);
        }

        return node;
    }

    public static void main(String[] args) {
                Node root = new Node(4);
                root.left = new Node(2);
                root.left.left = new Node(1);
                root.left.right = new Node(3);
                root.right = new Node(6);
                root.right.left = new Node(5);
                root.right.right = new Node(7);

        Node node = doSearch(root, 8);
        System.out.println(node.data);
    }
}
