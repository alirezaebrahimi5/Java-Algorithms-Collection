package Searching;

import java.util.*;

public class AStarSearch {

    static class Node {
        int x, y;
        int gCost, hCost;
        Node parent;

        Node(int x, int y) {
            this.x = x;
            this.y = y;
            this.gCost = Integer.MAX_VALUE;
            this.hCost = Integer.MAX_VALUE;
            this.parent = null;
        }

        int fCost() {
            return gCost + hCost;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Node node = (Node) obj;
            return x == node.x && y == node.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    public static void addEdge(Map<Integer, List<Integer>> graph, int u, int v) {
        graph.putIfAbsent(u, new ArrayList<>());
        graph.putIfAbsent(v, new ArrayList<>());
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    public static int heuristic(Node a, Node b) {
        return Math.abs(a.x - b.x) + Math.abs(a.y - b.y); // Manhattan distance
    }

    public static List<Node> aStarSearch(Map<Integer, List<Integer>> graph, Node start, Node goal) {
        Set<Node> closedList = new HashSet<>();
        PriorityQueue<Node> openList = new PriorityQueue<>(Comparator.comparingInt(Node::fCost));
        start.gCost = 0;
        start.hCost = heuristic(start, goal);
        openList.add(start);

        Map<String, Node> allNodes = new HashMap<>(); // Store all nodes by their position

        while (!openList.isEmpty()) {
            Node current = openList.poll();

            if (current.equals(goal)) {
                return reconstructPath(current);
            }

            closedList.add(current);

            // Expanding neighbors
            for (int neighbor : graph.get(current.x)) {
                String neighborKey = neighbor + "," + current.y;
                Node neighborNode = allNodes.getOrDefault(neighborKey, new Node(neighbor, current.y));

                if (closedList.contains(neighborNode)) continue;

                int tentativeGCost = current.gCost + 1;
                if (tentativeGCost < neighborNode.gCost) {
                    neighborNode.gCost = tentativeGCost;
                    neighborNode.hCost = heuristic(neighborNode, goal);
                    neighborNode.parent = current;
                    openList.add(neighborNode);
                    allNodes.put(neighborKey, neighborNode); // Store or update the node in the map
                }
            }
        }

        return null; // No path found
    }

    private static List<Node> reconstructPath(Node goal) {
        List<Node> path = new ArrayList<>();
        Node current = goal;
        while (current != null) {
            path.add(current);
            current = current.parent;
        }
        Collections.reverse(path);
        return path;
    }

    public static void runAStarSearch(int[][] array, int[] start_point, int[] goal_point) {
        Map<Integer, List<Integer>> graph = new HashMap<>();

        // Build the graph from the array
        for (int[] i : array) {
            addEdge(graph, i[0], i[1]);
        }

        Node start = new Node(start_point[0], start_point[1]);
        Node goal = new Node(goal_point[0], goal_point[1]);

        List<Node> path = aStarSearch(graph, start, goal);

        if (path != null) {
            System.out.println("Path found:");
            for (Node node : path) {
                System.out.println("(" + node.x + ", " + node.y + ")");
            }
        } else {
            System.out.println("No path found.");
        }
    }
}
