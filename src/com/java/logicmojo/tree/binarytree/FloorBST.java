package com.java.logicmojo.tree.binarytree;

public class FloorBST {
    public static int doFindFloor(Node node, int key){
        int floor = -1;

        while(node != null){
            if(node.data == key){
                floor = node.data;
                return floor;
            }

            if(key > node.data){
                floor = node.data;
                node = node.right;
            }else{
                node = node.left;
            }
        }
        return floor;
    }
    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right = new Node(6);
        root.right.left = new Node(5);
        root.right.right = new Node(7);

        System.out.println(doFindFloor(root, 8));
    }
}
