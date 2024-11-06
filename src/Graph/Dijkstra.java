package Graph;

import java.util.*;

public class Dijkstra {

    static class Node implements Comparable<Node> {
        int vertex, weight;

        Node(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }

        public int compareTo(Node other) {
            return Integer.compare(this.weight, other.weight);
        }
    }

    public static int[] dijkstra(int[][] graph, int source) {
        int n = graph.length;
        int[] distances = new int[n];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[source] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(source, 0));

        while (!pq.isEmpty()) {
            Node node = pq.poll();
            int u = node.vertex;

            for (int v = 0; v < n; v++) {
                if (graph[u][v] != 0 && distances[u] + graph[u][v] < distances[v]) {
                    distances[v] = distances[u] + graph[u][v];
                    pq.add(new Node(v, distances[v]));
                }
            }
        }
        return distances;
    }

    public static void runDijkstra(int[][] graph, int source) {
        int[] distances = dijkstra(graph, source);
        System.out.println("Shortest distances from source: " + Arrays.toString(distances));
    }
}
