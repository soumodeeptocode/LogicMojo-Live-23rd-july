package com.java.logicmojo.graph;

import java.util.ArrayList;
import java.util.List;

public class DepthFirstSearch {

    private static void dfsUtil(int node, List<List<Integer>> adjList, boolean[] visited, List<Integer> result){
        visited[node] = true;
        result.add(node);

        for(Integer item: adjList.get(node)){
            if(!visited[item]){
                dfsUtil(item, adjList, visited, result);
            }
        }
    }

    public static List<Integer> findDFS(List<List<Integer>> adjList){
        List<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[adjList.size()];

        dfsUtil(2,adjList, visited, result);

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

        for(Integer item: findDFS(adjList))
            System.out.print(item + " ");
    }

}
