package Searching;

import java.util.*;

public class DepthLimitedSearch {

    public static void addEdge(Map<Integer, List<Integer>> graph, int u, int v) {
        graph.putIfAbsent(u, new ArrayList<>());
        graph.putIfAbsent(v, new ArrayList<>());
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    public static boolean depthLimitedSearch(Map<Integer, List<Integer>> graph, int node, int goal, int limit, Set<Integer> visited) {
        if (node == goal) {
            return true;
        }

        if (limit <= 0) {
            return false;
        }

        visited.add(node);

        for (int neighbor : graph.get(node)) {
            if (!visited.contains(neighbor)) {
                if (depthLimitedSearch(graph, neighbor, goal, limit - 1, visited)) {
                    return true;
                }
            }
        }

        visited.remove(node);
        return false;
    }

    public static void runDepthLimitedSearch(int[][] array, int start_point, int goal_point, int limit_pont) {
        Map<Integer, List<Integer>> graph = new HashMap<>();

        for (int [] i : array) {
            addEdge(graph, i[0], i[1]);
        }

        int start = start_point;
        int goal = goal_point;
        int limit = limit_pont;

        Set<Integer> visited = new HashSet<>();
        boolean result = depthLimitedSearch(graph, start, goal, limit, visited);

        if (result) {
            System.out.println("Goal found within depth limit " + limit);
        } else {
            System.out.println("Goal not found within depth limit " + limit);
        }
    }
}
