package com.java.logicmojo.tree.binarytree;

import com.sun.source.tree.Tree;

import java.util.*;

class NodeVL{
    Node node;
    int vertical;
    int level;
    public NodeVL(Node _node, int _vertical, int _level){
        node = _node;
        vertical = _vertical;
        level = _level;
    }
}

public class VerticalOrderTraversal {

    public static List<List<Integer>> doFindVertialOrderTraversal(Node root){
        //Declare the map//
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<NodeVL> q = new LinkedList<>();

        q.offer(new NodeVL(root, 0, 0));

        while(!q.isEmpty()){
            NodeVL nodeVl = q.poll();
            Node temp = nodeVl.node;
            int row = nodeVl.vertical;
            int col = nodeVl.level;

            //check the vertical is present in map//
            if(!map.containsKey(row)){
                map.put(row, new TreeMap<>());
            }
            if(!map.get(row).containsKey(col)){
                map.get(row).put(col, new PriorityQueue<>());
            }

            map.get(row).get(col).offer(temp.data);

            if(temp.left != null){
                q.offer(new NodeVL(temp.left, row - 1, col + 1));
            }

            if(temp.right != null){
                q.offer(new NodeVL(temp.right, row + 1, col + 1));
            }
        }
    List<List<Integer>> result = new ArrayList<>();
        for(TreeMap<Integer, PriorityQueue<Integer>> list: map.values()){
            result.add(new ArrayList<>());
            for(PriorityQueue pq: list.values()){
                while(!pq.isEmpty()){
                    result.get(result.size() -1).add((Integer) pq.poll());
                }
            }
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

        List<List<Integer>> list = doFindVertialOrderTraversal(root);

        for(List<Integer> ls: list){
            for(Integer it: ls){
                System.out.print(it + " ");
            }
            System.out.println();
        }
    }
}
