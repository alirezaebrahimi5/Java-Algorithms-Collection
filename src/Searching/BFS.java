package Searching;
import java.util.*;

public class BFS {

    public static void addEdge(Map<Integer, List<Integer>> graph, int u, int v) {
        graph.putIfAbsent(u, new ArrayList<>());
        graph.putIfAbsent(v, new ArrayList<>());
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    public static void bfs(Map<Integer, List<Integer>> graph, int start) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int neighbor : graph.get(node)) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }

    public static void runBFS(int [][] array) {
        Map<Integer, List<Integer>> graph = new HashMap<>();

        for (int [] i : array) {
            addEdge(graph, i[0], i[1]);
        }

        System.out.println("BFS traversal starting from node 1:");
        bfs(graph, 1);
    }
}
