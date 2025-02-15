package com.warmup;

import java.util.*;

public class GraphBFS21 {
    // Record to represent a vertex and its neighbors
    private record Vertex(int id, List<Integer> neighbors) {
    }

    // List of vertices in the graph
    private final List<Vertex> vertices;

    // Constructor to initialize the graph with a given number of vertices
    public GraphBFS21(int vertexCount) {
        this.vertices = new ArrayList<>(vertexCount);
        for (int i = 0; i < vertexCount; i++) {
            vertices.add(new Vertex(i, new ArrayList<>()));
        }
    }

    // Method to add an edge between two vertices (undirected graph)
    public void addEdge(int source, int destination) {
        // Add destination to source's neighbors
        vertices.get(source).neighbors().add(destination);
        // Add source to destination's neighbors (since it's undirected)
        vertices.get(destination).neighbors().add(source);
    }

    // Method to print the graph
    public void printGraph() {
        for (var vertex : vertices) {
            System.out.print("Vertex " + vertex.id() + " is connected to: ");
            for (var neighbor : vertex.neighbors()) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    // Method to perform BFS starting from a given vertex
    public void bfs(int startVertex) {
        // Queue for BFS
        var queue = new LinkedList<Integer>();
        // Set to keep track of visited vertices
        var visited = new HashSet<Integer>();

        // Mark the start vertex as visited and enqueue it
        visited.add(startVertex);
        queue.add(startVertex);

        System.out.println("BFS starting from vertex " + startVertex + ":");

        while (!queue.isEmpty()) {
            // Dequeue a vertex from the queue
            int currentVertex = queue.poll();
            System.out.print(currentVertex + " ");

            // Visit all neighbors of the current vertex
            for (var neighbor : vertices.get(currentVertex).neighbors()) {
                if (!visited.contains(neighbor)) {
                    // Mark the neighbor as visited and enqueue it
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a graph with 5 vertices
        var graph = new GraphBFS21(5);

        // Add edges to the graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);

        // Print the graph
        graph.printGraph();

        // Perform BFS starting from vertex 0
        graph.bfs(0);
    }
}