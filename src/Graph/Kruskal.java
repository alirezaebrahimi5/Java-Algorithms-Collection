package Graph;

import java.util.*;

class Edge implements Comparable<Edge> {
    int src, dest, weight;

    public Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }

    public int compareTo(Edge compareEdge) {
        return this.weight - compareEdge.weight;
    }
}

class Graph {
    int V, E;
    Edge[] edges;

    Graph(int v, int e) {
        V = v;
        E = e;
        edges = new Edge[E];
    }

    int find(int[] parent, int i) {
        if (parent[i] == -1)
            return i;
        return find(parent, parent[i]);
    }

    void union(int[] parent, int x, int y) {
        parent[x] = y;
    }

    void kruskalMST() {
        Edge[] result = new Edge[V];
        int e = 0;
        for (int i = 0; i < V; i++) {
            result[i] = new Edge(-1, -1, Integer.MAX_VALUE);
        }

        Arrays.sort(edges);

        int[] parent = new int[V];
        Arrays.fill(parent, -1);

        for (Edge nextEdge : edges) {
            int x = find(parent, nextEdge.src);
            int y = find(parent, nextEdge.dest);

            if (x != y) {
                result[e++] = nextEdge;
                union(parent, x, y);
            }
        }

        for (int i = 0; i < e; i++) {
            System.out.println(result[i].src + " -- " + result[i].dest + " == " + result[i].weight);
        }
    }
}

public class Kruskal {
    public static void runKruskal(int[][] arr, int V, int E) {
        if (arr.length != E) {
            throw new IllegalArgumentException("The number of edges in the input array must be equal to E.");
        }

        Graph graph = new Graph(V, E);

        for (int i = 0; i < E; i++) {
            graph.edges[i] = new Edge(arr[i][0], arr[i][1], arr[i][2]);
        }

        graph.kruskalMST();
    }
}
