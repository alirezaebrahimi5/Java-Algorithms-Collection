package Graph;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BellmanFord {
    static class Edge {
        int src, dest, weight;

        Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    public static void bellmanFord(Edge[] edges, int V, int source) {
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;

        for (int i = 1; i < V; i++) {
            for (Edge edge : edges) {
                if (dist[edge.src] != Integer.MAX_VALUE && dist[edge.src] + edge.weight < dist[edge.dest]) {
                    dist[edge.dest] = dist[edge.src] + edge.weight;
                }
            }
        }

        for (Edge edge : edges) {
            if (dist[edge.src] != Integer.MAX_VALUE && dist[edge.src] + edge.weight < dist[edge.dest]) {
                System.out.println("Graph contains a negative-weight cycle");
                return;
            }
        }

        System.out.println("Distances from source: " + Arrays.toString(dist));
    }

    public static void runBellmanFord(int[][] arr, int V, int source) {
        Edge[] edges = new Edge[arr.length];
        for (int i = 0; i < arr.length; i++) {
            edges[i] = new Edge(arr[i][0], arr[i][1], arr[i][2]);
        }

        bellmanFord(edges, V, source);
    }
}
