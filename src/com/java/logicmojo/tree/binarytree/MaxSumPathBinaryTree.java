package com.java.logicmojo.tree.binarytree;

public class MaxSumPathBinaryTree {

    public static int doFindMaxSumPath(Node node){
        int maxPathSum[] = new int[1];
        maxPathSumTraversal(node, maxPathSum);
        return maxPathSum[0];
    }

    private static int maxPathSumTraversal(Node node, int[] maxPathSum){
        if(node == null) return 0;

        int leftHandSum = maxPathSumTraversal(node.left, maxPathSum);
        int rightHandSum = maxPathSumTraversal(node.right, maxPathSum);

        maxPathSum[0] = Math.max(maxPathSum[0], leftHandSum + rightHandSum + node.data);

        return Math.max(leftHandSum, rightHandSum) + node.data;
    }
    public static void main(String[] args) {

    }
}
