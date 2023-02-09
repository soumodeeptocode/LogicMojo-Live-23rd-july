package com.java.logicmojo.tree.binarytree;

public class LowestCommonAncestorBST {

    public static Node findLowestCommonAncestor(Node node, Node p, Node q){
        if(node == null) return null;
        int curr = node.data;

        if(curr < p.data && curr < q.data){
            return findLowestCommonAncestor(node.right, p, q);
        }

        if(curr > p.data && curr > q.data ){
            return findLowestCommonAncestor(node.left, p, q);
        }

        return node;
    }

    public static void main(String[] args) {

    }
}
