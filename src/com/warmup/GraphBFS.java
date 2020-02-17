package com.warmup;

import java.util.Iterator;
import java.util.LinkedList;

public class GraphBFS {

    private LinkedList<Integer> nodes[];

    GraphBFS(int size) {
        nodes = new LinkedList[size];
        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = new LinkedList<>();
        }
    }

    void addEdge(int source, int destination) {
        nodes[source].addFirst(destination);
        nodes[destination].addFirst(source);
    }

    private void bfs(final int source, final boolean[] visited) {

        visited[source] = true;
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(source);

        while (queue.size() != 0) {

            int node = queue.poll();
            System.out.println("visited: " + node);

            Iterator<Integer> i = nodes[node].listIterator();
            while (i.hasNext()) {

                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }

        }

    }

    public static void main(String[] args) {
        GraphBFS graph = new GraphBFS(4);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 1);
        graph.addEdge(3, 0);
        graph.bfs(0, new boolean[4]);
    }

}
