package com.java.logicmojo.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch {

    public static List<Integer> findBfs(List<List<Integer>> adjList){
        List<Integer> result = new ArrayList<>();

        boolean[] visited = new boolean[adjList.size()];

        Queue<Integer> q = new LinkedList<>();

        q.add(3);
        visited[3] = true;
        //result.add(3);

        while(!q.isEmpty()){
            Integer node = q.poll();
            result.add(node);

            for(Integer item: adjList.get(node)){
                if(!visited[item]){
                    visited[item] = true;
                    q.add(item);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        List<List<Integer>> adjList = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            adjList.add(new ArrayList<>());
        }

        adjList.get(0).add(1);
        adjList.get(1).add(0);
        adjList.get(0).add(2);
        adjList.get(2).add(0);
        adjList.get(1).add(3);
        adjList.get(3).add(1);
        adjList.get(2).add(4);
        adjList.get(4).add(2);
        adjList.get(3).add(4);
        adjList.get(4).add(3);

        for(Integer item: findBfs(adjList))
            System.out.print(item + " ");
        }
}
