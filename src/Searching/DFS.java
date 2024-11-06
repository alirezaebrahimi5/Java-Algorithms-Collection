package Searching;

import java.util.*;

public class DFS {

    public static void addEdge(Map<Integer, List<Integer>> graph, int u, int v) {
        graph.putIfAbsent(u, new ArrayList<>());
        graph.putIfAbsent(v, new ArrayList<>());
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    public static void dfs(Map<Integer, List<Integer>> graph, int node, Set<Integer> visited) {
        visited.add(node);
        System.out.print(node + " ");

        for (int neighbor : graph.get(node)) {
            if (!visited.contains(neighbor)) {
                dfs(graph, neighbor, visited);
            }
        }
    }

    public static void runDFS(int [][] array) {
        Map<Integer, List<Integer>> graph = new HashMap<>();

        for (int [] i : array) {
            addEdge(graph, i[0], i[1]);
        }

        Set<Integer> visited = new HashSet<>();
        System.out.println("DFS traversal starting from node 1:");
        dfs(graph, 1, visited);
    }
}
