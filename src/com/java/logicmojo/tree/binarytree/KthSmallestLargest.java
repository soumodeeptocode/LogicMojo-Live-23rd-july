package com.java.logicmojo.tree.binarytree;

public class KthSmallestLargest {
    public static Node findKthLargest(Node node, int[] k){
        if(node == null) return null;

        Node right = findKthLargest(node.right, k);

        if(right != null) return right;
        k[0] --;
        if(k[0] == 0) return node;

        return findKthLargest(node.left, k);
    }
    public static Node findKthSmallest(Node node, int[] k){
        if(node == null) return null;

        //Left//
        Node left = findKthSmallest(node.left, k);

        //Node or Data//
        if(left != null) return left;
        k[0] --;
        if(k[0] == 0) return node;

        //Right//
        return findKthSmallest(node.right, k);

    }

    public static void main(String[] args) {

    }
}
