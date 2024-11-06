package Sorting;

import java.util.*;

public class TopologicalSort {
    private int vertices;
    private LinkedList<Integer> adj[];

    public TopologicalSort(int v) {
        vertices = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    private void topologicalSortUtil(int v, boolean visited[], Stack<Integer> stack) {
        visited[v] = true;

        for (Integer neighbor : adj[v]) {
            if (!visited[neighbor]) {
                topologicalSortUtil(neighbor, visited, stack);
            }
        }

        stack.push(v);
    }

    public void topologicalSort() {
        Stack<Integer> stack = new Stack<>();
        boolean visited[] = new boolean[vertices];

        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                topologicalSortUtil(i, visited, stack);
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static void runTopologicalSort(int[][] arr) {
        TopologicalSort g = new TopologicalSort(arr.length);

        for (int[] edge : arr) {
            g.addEdge(edge[0], edge[1]);
        }

        System.out.println("Topological Sort of the graph:");
        g.topologicalSort();
    }
}
