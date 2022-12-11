package com.java.logicmojo.tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class SerializeDeSerialize {

    public static String doSerialize(Node node){
        if(node == null) return "";

        Queue<Node> q = new LinkedList<>();
        StringBuilder str = new StringBuilder();

        q.add(node);

        while(!q.isEmpty()){
            Node temp = q.poll();
            if(temp == null){
                str.append("# ");
                continue;
            }

            str.append(temp.data + " ");
            q.add(temp.left);
            q.add(temp.right);
        }
        return str.toString();
    }

    public static Node deserialize(String node){
        if(node == "") return null;
        Queue<Node> q = new LinkedList<>();
        String[] nodeVal = node.split(" ");

        Node root = new Node(Integer.parseInt(nodeVal[0]));
        q.add(root);

        for(int i = 1; i < nodeVal.length; i++){
            Node parent = q.poll();
            if(!nodeVal[i].equals("#")){
                Node left = new Node(Integer.parseInt(nodeVal[i]));
                parent.left = left;
                q.add(left);
            }

            if(!nodeVal[++i].equals("#")){
                Node right = new Node(Integer.parseInt(nodeVal[i]));
                parent.right = right;
                q.add(right);
            }
        }
        return root;
    }

    public static void print(Node node){
        if(node == null) return;

        System.out.print(node.data + " ");
        print(node.left);
        print(node.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.right = new Node(6);

        String str = doSerialize(root);
        System.out.println(str);

        Node node = deserialize(str);
        print(node);
    }
}
