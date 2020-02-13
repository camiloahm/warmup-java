package com.warmup;

import java.util.LinkedList;

public class GraphDFS {

    private final LinkedList<Integer> nodes[];

    GraphDFS(int size) {
        nodes = new LinkedList[size];
        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = new LinkedList<>();
        }
    }

    void addEdge(int source, int destination) {
        nodes[source].addFirst(destination);
        nodes[destination].addFirst(source);
    }

    void dfs(int source, boolean[] visited) {
        System.out.println("visited:" + source);
        visited[source] = true;
        for (int node : nodes[source]) {
            if (!visited[node]) {
                dfs(node, visited);
            }
        }

    }

    public static void main(String[] args) {
        GraphDFS graph = new GraphDFS(4);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 1);
        graph.addEdge(3, 0);
        graph.dfs(3, new boolean[4]);
    }
}
