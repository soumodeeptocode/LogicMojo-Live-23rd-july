package com.java.logicmojo.tree.binarytree;

public class LCA {

    public static Node findLowestCommonAncestor(Node node, Node x, Node y){
        if(node == null || node == x || node == y){
            return node;
        }
       Node left =  findLowestCommonAncestor(node.left, x, y);
       Node right = findLowestCommonAncestor(node.right, x, y);

       if(left == null){
           return right;
       }else if(right == null){
           return left;
       }else {
           return node;
       }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.left.left = new Node(8);
        root.right.right = new Node(5);
        root.right.right.left = new Node(6);
        root.right.right.right = new Node(7);


        Node lca = findLowestCommonAncestor(root, root.right.left.left, root.right.right.right);

        System.out.println("The lowest common ancestor :: "+lca.data);
    }
}
