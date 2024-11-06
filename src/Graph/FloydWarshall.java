package Graph;

public class FloydWarshall {
    public static int INF = 99999;

    public static void floydWarshall(int[][] graph) {
        int V = graph.length;
        int[][] dist = new int[V][V];

        for (int i = 0; i < V; i++)
            System.arraycopy(graph[i], 0, dist[i], 0, V);

        for (int k = 0; k < V; k++) {
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    if (dist[i][k] + dist[k][j] < dist[i][j])
                        dist[i][j] = dist[i][k] + dist[k][j];
                }
            }
        }

        printSolution(dist);
    }

    public static void printSolution(int[][] dist) {
        for (int[] row : dist) {
            for (int value : row) {
                if (value == INF) System.out.print("INF ");
                else System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void runFloydWarshall(int[][] graph) {
        floydWarshall(graph);
    }
}
