package com.java.logicmojo.tree.binarytree;

public class InsertNodeBST {

    public static Node insertBST(Node node, int key){
        if(node == null) return null;

        Node cur = node;

        while(true){
            if(cur.data <= key){
                if(cur.right != null) cur = cur.right;
                else{
                    Node temp = new Node(key);
                    cur.right = temp;
                    break;
                }
            }else{
                if(cur.left != null) cur = cur.left;
                else{
                    Node temp = new Node(key);
                    cur.left = temp;
                    break;
                }
            }
        }
        return node;
    }

    public static void print(Node node){
        if(node == null) return;

        System.out.print(node.data + " ");
        print(node.left);
        print(node.right);
    }

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right = new Node(6);
        root.right.left = new Node(5);
        root.right.right = new Node(7);

        Node node = insertBST(root, 8);

        print(node);
    }
}
