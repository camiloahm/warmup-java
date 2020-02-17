package com.crack.graph;

import java.util.LinkedList;

public class RouteBetweenNodes {

    private LinkedList<Integer> nodes[];
    private int size;

    RouteBetweenNodes(int size) {
        this.size = size;
        nodes = new LinkedList[this.size];
        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = new LinkedList<>();
        }
    }

    void addEdge(int source, int destination) {
        nodes[source].addFirst(destination);
    }

    private boolean searchUtil(boolean[] visited, int source, int destination) {

        System.out.println("visited:" + source);
        visited[source] = true;
        if (source == destination) {
            return true;
        }

        for (Integer node : nodes[source]) {
            if (!visited[node]) {
                if (searchUtil(visited, node, destination)) {
                    return true;
                }
            }
        }

        return false;
    }

    boolean search(int source, int destination) {

        return searchUtil(new boolean[size], source, destination);
    }

    public static void main(String[] args) {

        RouteBetweenNodes graph = new RouteBetweenNodes(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(3, 2);
        graph.addEdge(1, 4);
        graph.addEdge(1, 5);
        System.out.println(graph.search(0, 5));
    }
}
