import static Backtracking.NQueens.runNQueens;
import static DivideAndConquer.ClosestPairOfPoints.runClosestPairOfPoints;
import static DivideAndConquer.Strassen.runStrassen;
import static DivideAndConquer.StrassenMatrixMultiplication.runStrassenMatrixMultiplication;
import static DynamicProgramming.LIS.runLIS;
import static DynamicProgramming.MatrixChainMultiplication.runMatrixChainMultiplication;
import static Graph.BellmanFord.runBellmanFord;
import static Graph.FloydWarshall.INF;
import static Graph.FloydWarshall.runFloydWarshall;
import static Graph.Kruskal.runKruskal;
import static ML.KMeans.runKMeans;
import static ML.KNearestNeighbors.runKNearestNeighbors;
import static Matching.RabinKarp.runrabinKarp;
import static Matching.SuffixArray.runSuffixArray;
import static Mathematics.FastExponentiation.runFastExponentiation;
import static Mathematics.SieveOfEratosthenes.runSieveOfEratosthenes;
import static Mathematics.SimpleNeuralNetwork.runSimpleNeuralNetwork;
import static DivideAndConquer.MaximumSubarray.runMaximumSubarray;
import static Greedy.ActivitySelection.runActivitySelection;
import static Optimization.AntColonyOptimization.runAntColonyOptimization;
import static DynamicProgramming.FibonacciDP.runFibonacciDP;
import static Optimization.BranchAndBoundTSP.runBranchAndBoundTSP;
import static Optimization.DynamicTimeWarping.runDynamicTimeWarping;
import static Optimization.Genetic.runGenetic;
import static DynamicProgramming.KnapsackDP.runknapsack;
import static Optimization.SimulatedAnnealing.runSimulatedAnnealing;
import static Searching.AStarSearch.runAStarSearch;
import static Searching.BFS.runBFS;
import static Searching.BinarySearch.runBinarySearch;
import static Searching.DFS.runDFS;
import static Searching.DepthLimitedSearch.runDepthLimitedSearch;
import static Searching.ExponentialSearch.runExponentialSearch;
import static Searching.FibonacciSearch.runFibonacciSearch;
import static Searching.JumpSearch.runJumpSearch;
import static Searching.TernarySearch.runTernarySearch;
import static Sorting.BubbleSort.runBubbleSort;
import static Sorting.BucketSort.runBucketSort;
import static Sorting.CountingSort.runCountingSort;
import static Sorting.InsertionSort.runInsertionSort;
import static Sorting.MergeSort.runMergeSort;
import static Sorting.QuickSort.runQuickSort;
import static Sorting.RadixSort.runRadixSort;
import static Sorting.SelectionSort.runSelectionSort;
import static Sorting.ShellSort.runShellSort;
import static Sorting.TopologicalSort.runTopologicalSort;

public class Run {

    public static void main(String[] args) {

        int[] array = {1, 3, 5, 7, 9, 11};
        int[][] edges = {{1, 2}, {1, 3}, {2, 4}, {2, 5}, {3, 6}, {3, 7}};
        int[][] activities = {{1, 4}, {3, 5}, {0, 6}, {5,7}, {8, 9}, {5, 9}};
        int target = 7;
        int n = 7;
        int m = 40;
        int[] values = {60, 100, 120};
        int[] weights = {10, 20, 30};
        int W = 50;
        int s = 4;
        int[] arr = {-2, -5, 6, -2, -3, 1, 5, -6};
        int populationSize = 10;
        int maxGenerations = 50;
        double[][] nn_weights = {{0.3, 0.5}, {0.7, 0.9}};
        double[] input = {0.0, 1.0};
        double initialTemperature = 1000;
        double coolingRate = 0.003;
        int[][] distanceMatrix = {
                {0, 2, 9, 10, 7},
                {1, 0, 6, 4, 3},
                {15, 7, 0, 8, 9},
                {6, 3, 12, 0, 11},
                {9, 5, 7, 2, 0}
        };
        int [][] edges_2 = {
                {0, 1, -1},
                {0, 2, 4},
                {1, 2, 3},
                {1, 3, 2},
                {1, 4, 2},
                {3, 2, 5},
                {3, 1, 1},
                {4, 3, -3}
        };
        double evaporationRate = 0.5;
        double pheromoneConstant = 1.0;
        int numberOfCities = 5;
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";


        int[][] graph = {
                {0, 10, 0, 30, 100},
                {10, 0, 50, 0, 0},
                {0, 50, 0, 20, 10},
                {30, 0, 20, 0, 60},
                {100, 0, 10, 60, 0}
        };
        int[] dimensions = {10, 20, 30, 40, 30};
        int input_1 = 48;
        int input_2 = 18;
        int source = 0;

        int[][] graph_2 = {
                {0, 3, INF, 5},
                {2, 0, INF, 4},
                {INF, 1, 0, INF},
                {INF, INF, 2, 0}
        };

        int base = 3;
        int exp = 13;
        int mod = 7;


        int[][] edges_6 = {
                {0, 1, 10},
                {0, 2, 6},
                {0, 3, 5},
                {1, 3, 15},
                {2, 3, 4},
        };

        int V = 4;
        int E = 5;


        int d = 256;
        int q = 101;
        String txt = "ABABDABACDABABCABAB";
        String pat = "ABABCABAB";
        String text = "banana";
        int[][] arr_2 = {
                {2, 3}, {12, 30}, {40, 50},
                {5, 1}, {12, 10}, {3, 4}
        };

        int[][] A = {{1, 2}, {3, 4}};
        int[][] B = {{5, 6}, {7, 8}};
        int[][] dist = new int[][] {
                {0, 10, 15, 20},
                {10, 0, 35, 25},
                {15, 35, 0, 30},
                {20, 25, 30, 0}
        };
        double[] series1 = {1, 2, 3, 4, 2, 1};
        double[] series2 = {1, 2, 2, 3, 4, 5};

        double[][] data = {
                {1.0, 2.0},
                {2.0, 3.0},
                {3.0, 4.0},
                {5.0, 5.0}
        };
        int[] labels = {0, 0, 1, 1};
        double[] test = {4.0, 4.0};
        int k = 3;

        float[] float_arr = {0.42f, 0.32f, 0.23f, 0.52f, 0.16f};
        int x = 5;

        int[][] array_A = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int[][] array_B = {
                {16, 15, 14, 13},
                {12, 11, 10, 9},
                {8, 7, 6, 5},
                {4, 3, 2, 1}
        };
        int[][] edges_3 = {{0, 1}, {1, 2}, {2, 3}};
        int[][] edges_4 = {{0, 1}, {1, 2}, {2, 3}, {3, 4}};
        int[][] edges_5 = {{0, 1}, {0, 2}, {1, 3}, {2, 3}};
        int[] start = {0, 0};
        int[] goal = {3, 3};
        int start_2 = 0;
        int goal_2 = 4;
        int limit = 3;
        measurePerformance("Depth Limited Search", "O(b^l)", () -> runDepthLimitedSearch(edges_4, start_2, goal_2, limit));
        measurePerformance("A* Search", "O(b^d)", () -> runAStarSearch(edges_3, start, goal));
        measurePerformance("Strassen Algorithm", "O(n^log7)", () -> runStrassen(array_A, array_B));
        measurePerformance("Exponential Search", "O(log n)", () -> runExponentialSearch(array, x));
        measurePerformance("Fibonacci Search", "O(log n)", () -> runFibonacciSearch(array, x));
        measurePerformance("Ternary Search", "O(log n)", () -> runTernarySearch(array, x));
        measurePerformance("Jump Search", "O(√n)", () -> runJumpSearch(array, x));
        measurePerformance("KMeans", "O(n*k*d)", () -> runKMeans(data, k));
        measurePerformance("K-Nearest Neighbors", "O(n*k)", () -> runKNearestNeighbors(data, labels, test, k));
        measurePerformance("Dynamic Time Warping", "O(n*m)", () -> runDynamicTimeWarping(series1, series2));
        measurePerformance("Branch and Bound TSP", "O(n!)", () -> runBranchAndBoundTSP(dist));
        measurePerformance("Strassen Matrix Multiplication", "O(n^log7)", () -> runStrassenMatrixMultiplication(A, B));
        measurePerformance("Closest Pair of Points", "O(n log n)", () -> runClosestPairOfPoints(arr_2));
        measurePerformance("Suffix Array", "O(n log n)", () -> runSuffixArray(text));
        measurePerformance("Topological Sort", "O(V + E)", () -> runTopologicalSort(edges_5));
        measurePerformance("Fast Exponentiation", "O(log n)", () -> runFastExponentiation(base, exp, mod));
        measurePerformance("Sieve of Eratosthenes", "O(n log log n)", () -> runSieveOfEratosthenes(m));
        measurePerformance("Kruskal's Algorithm", "O(E log E)", () -> runKruskal(edges_6, V, E));
        measurePerformance("Counting Sort", "O(n+k)", () -> runCountingSort(array));
        measurePerformance("Rabin-Karp Algorithm", "O(n)", () -> runrabinKarp(txt, pat, d, q));
        measurePerformance("Radix Sort", "O(nk)", () -> runRadixSort(array));
        measurePerformance("Floyd-Warshall Algorithm", "O(V^3)", () -> runFloydWarshall(graph_2));
        measurePerformance("Bellman-Ford Algorithm", "O(V * E)", () -> runBellmanFord(edges_6, V, source));
        measurePerformance("Longest Increasing Subsequence", "O(n^2)", () -> runLIS(array));
        measurePerformance("Euclidean GCD", "O(log(min(a,b)))", () -> Mathematics.EuclideanGCD.runGCD(input_1, input_2));
        measurePerformance("KMP Search", "O(n+m)", () -> Matching.KMP.runKMPSearch(pat, txt));
        measurePerformance("Heap Sort", "O(n log n)", () -> Sorting.HeapSort.runHeapSort(array));
        measurePerformance("Matrix Chain Multiplication", "O(n^3)", () -> runMatrixChainMultiplication(dimensions));
        measurePerformance("Dijkstra's Algorithm", "O(V^2)", () -> Graph.Dijkstra.runDijkstra(graph, 0));
        measurePerformance("Bubble Sort", "O(n^2)", () -> runBubbleSort(array.clone()));
        measurePerformance("Shell Sort", "O(n^2)", () -> runShellSort(array.clone()));
        measurePerformance("Bucket Sort", "O(n+k)", () -> runBucketSort(float_arr));
        measurePerformance("Insertion Sort", "O(n^2)", () -> runInsertionSort(array.clone()));
        measurePerformance("Selection Sort", "O(n^2)", () -> runSelectionSort(array.clone()));
        measurePerformance("Longest Common Subsequence", "O(n*m)", () -> DynamicProgramming.LCS.runLCS(s1, s2));
        measurePerformance("Binary Search", "O(log n)", () -> runBinarySearch(array, target));
        measurePerformance("Quick Sort", "O(n log n)", () -> runQuickSort(array));
        measurePerformance("Merge Sort", "O(n log n)", () -> runMergeSort(array));
        measurePerformance("BFS", "O(V + E)", () -> runBFS(edges));
        measurePerformance("DFS", "O(V + E)", () -> runDFS(edges));
        measurePerformance("Fibonacci DP", "O(n)", () -> runFibonacciDP(n));
        measurePerformance("Knapsack DP", "O(nW)", () -> runknapsack(values, weights, W));
        measurePerformance("Activity Selection", "O(n log n)", () -> runActivitySelection(activities));
        measurePerformance("N-Queens", "O(n!)", () -> runNQueens(s));
        measurePerformance("Maximum Subarray", "O(n)", () -> runMaximumSubarray(arr));
        measurePerformance("Genetic Algorithm", "O(g * p)", () -> runGenetic(populationSize, maxGenerations));
        measurePerformance("Simple Neural Network", "Varies", () -> runSimpleNeuralNetwork(input, nn_weights));
        measurePerformance("Simulated Annealing", "O(k)", () -> runSimulatedAnnealing(initialTemperature, coolingRate));
        measurePerformance("Ant Colony Optimization", "O(n^2 * t)", () -> runAntColonyOptimization(numberOfCities, distanceMatrix, evaporationRate, pheromoneConstant));
    }

    private static void measurePerformance(String algorithmName, String complexity, Runnable algorithm) {
        System.out.println("Running " + algorithmName + " with complexity: " + complexity);

        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        long startMemory = runtime.totalMemory() - runtime.freeMemory();

        long startTime = System.nanoTime();

        algorithm.run();

        long endTime = System.nanoTime();

        long endMemory = runtime.totalMemory() - runtime.freeMemory();

        long timeElapsed = endTime - startTime;
        long memoryUsed = endMemory - startMemory;

        System.out.printf("%s took %d nanoseconds and used %d bytes of memory%n", algorithmName, timeElapsed, memoryUsed);
        System.out.println("--------------------------------------------------");
    }
}
