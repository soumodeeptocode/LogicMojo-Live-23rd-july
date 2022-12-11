package com.java.logicmojo.tree.binarytree;

public class CeilBST {

    public static int doFindCeil(Node node, int key){
        int ceil = -1;

        while(node != null){
            if(node.data == key){
                ceil = node.data;
                return ceil;
            }

            if(key > node.data){
                node = node.right;
            }else{
                ceil = node.data;
                node = node.left;
            }
        }
        return ceil;
    }
    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right = new Node(6);
        root.right.left = new Node(5);
        root.right.right = new Node(8);

        System.out.println(doFindCeil(root, 7));
    }
}
