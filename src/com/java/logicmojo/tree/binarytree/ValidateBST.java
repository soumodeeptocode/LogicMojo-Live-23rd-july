package com.java.logicmojo.tree.binarytree;

public class ValidateBST {

    private static boolean validateBST(Node node, int min, int max){
        if(node == null) return true;

        if(node.data <= min || node.data >= max) return false;

        if(validateBST(node.left, min, node.data) && validateBST(node.right, node.data, max)){
            return true;
        }

        return false;
    }

    public static boolean isValidBST(Node node){
        return validateBST(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static void main(String[] args) {

    }
}
