package com.java.logicmojo.tree.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZagTraversal {

    public static List<List<Integer>> doZigZagTraversal(Node root){
        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        boolean flag = true;

        if(root == null) return result;

        queue.offer(root);

        while(!queue.isEmpty()){
            int numOfNodes = queue.size();
            List<Integer> levelList = new ArrayList<>(numOfNodes);
            for(int i = 0; i < numOfNodes; i++){
                Node temp = queue.poll();
                if(temp.left != null) queue.offer(temp.left);
                if(temp.right != null) queue.offer(temp.right);
                if(flag){
                    levelList.add(temp.data);
                }else{
                    levelList.add(0, temp.data);
                }
            }
            flag = !flag;
            result.add(levelList);
        }

        return result;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.right.left = new Node(8);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);

        List<List<Integer>> res = doZigZagTraversal(root);

        for(List<Integer> level: res){
            for(Integer it: level){
                System.out.print(it + " ");
            }
            System.out.println();
        }
    }
}
