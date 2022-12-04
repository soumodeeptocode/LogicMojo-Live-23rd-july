package com.java.logicmojo.tree.binarytree;

import java.util.*;

class NodeV {
    Node node;
    int vertical;
    public NodeV(Node _node, int _vertical){
        this.node = _node;
        this.vertical = _vertical;
    }
}
public class TopView {

    public static List<Integer> topView(Node root){
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;

        Map<Integer, Integer> map = new HashMap<>();
        Queue<NodeV> q = new LinkedList<NodeV>();

        q.offer(new NodeV(root, 0));

        while(!q.isEmpty()){
            NodeV nodeV = q.poll();
            Node temp = nodeV.node;
            int row = nodeV.vertical;

            if(!map.containsKey(row)){
                map.put(row, temp.data);
            }

            if(temp.left != null){
                q.offer(new NodeV(temp.left, row - 1));
            }

            if(temp.right != null){
                q.offer(new NodeV(temp.right, row + 1));
            }
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            result.add(entry.getValue());
        }
        return result;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(9);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(10);
        root.left.right.left = new Node(6);
        root.right.right.left = new Node(11);

        for(Integer it: topView(root)){
            System.out.print(it + " ");
        }
    }
}
