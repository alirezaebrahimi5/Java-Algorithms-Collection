**"Java Algorithms Collection"**

A comprehensive collection of classic and advanced algorithms implemented in Java. This repository includes a variety of algorithms such as sorting, searching, graph traversal, dynamic programming, and more, designed to help you understand algorithmic principles and improve your problem-solving skills. Each implementation is optimized for clarity, efficiency, and ease of understanding, making it suitable for both beginners and experienced developers. Perfect for interview preparation, coding competitions, or general algorithmic learning.

---

### 1. **Binary Search**
- **Description**: Efficient search in a sorted array, repeatedly dividing the search interval in half.
- **Pros**:
    - Very fast for large datasets.
    - Works only on sorted data.
- **Cons**:
    - Only applicable to sorted arrays.
- **Speed**: Very fast with logarithmic time complexity.
- **Memory Usage**: `O(1)` (constant space), if implemented iteratively.
- **Usage**: Used for searching elements in a sorted array or list, e.g., in dictionary lookups.

### 2. **Quick Sort**
- **Description**: Fast comparison-based sorting using a pivot element and partitioning the array around it.
- **Pros**:
    - Very efficient on average.
    - In-place sorting (low memory usage).
- **Cons**:
    - Worst-case time complexity of `O(n^2)` (rare, can be avoided with good pivot selection).
- **Speed**: Very fast on average, `O(n log n)` with good pivoting.
- **Memory Usage**: `O(log n)` due to recursive calls.
- **Usage**: General-purpose sorting, often used in built-in sort functions.

### 3. **Merge Sort**
- **Description**: Stable sorting algorithm that divides and merges sub-arrays.
- **Pros**:
    - Stable sorting (preserves order of equal elements).
    - Predictable time complexity.
- **Cons**:
    - Requires extra space for the merging process.
- **Speed**: Stable and predictable, with time complexity of `O(n log n)`.
- **Memory Usage**: `O(n)` due to the need for auxiliary space.
- **Usage**: Suitable for large datasets and for cases where stability is important.

### 4. **BFS (Breadth-First Search)**
- **Description**: Graph traversal exploring all nodes at a current depth level before moving deeper.
- **Pros**:
    - Guarantees the shortest path in an unweighted graph.
- **Cons**:
    - High memory consumption for large graphs.
- **Speed**: Efficient for finding shortest paths in unweighted graphs.
- **Memory Usage**: `O(V)` due to the queue storing nodes.
- **Usage**: Used for finding shortest paths in unweighted graphs, web crawlers, and finding connected components.

### 5. **DFS (Depth-First Search)**
- **Description**: Graph traversal exploring as far as possible along a branch before backtracking.
- **Pros**:
    - Simple implementation.
    - Uses less memory than BFS in some cases.
- **Cons**:
    - May not find the shortest path in unweighted graphs.
- **Speed**: Generally fast for tree/graph traversal.
- **Memory Usage**: `O(V)` for recursive stack.
- **Usage**: Used for tasks like topological sorting, pathfinding, and solving puzzles.

### 6. **Fibonacci Dynamic Programming**
- **Description**: Efficient dynamic programming approach for computing Fibonacci numbers.
- **Pros**:
    - Avoids recomputation using memoization.
    - Optimized for large Fibonacci numbers.
- **Cons**:
    - Requires memory to store intermediate results.
- **Speed**: Linear time complexity `O(n)`.
- **Memory Usage**: `O(n)` due to memoization.
- **Usage**: Used in dynamic programming problems and algorithm optimizations where the Fibonacci sequence is needed.

### 7. **Knapsack Dynamic Programming**
- **Description**: Solves the 0/1 Knapsack problem using dynamic programming.
- **Pros**:
    - Provides optimal solution for 0/1 knapsack problem.
- **Cons**:
    - Memory-intensive for large values of `W` (capacity).
- **Speed**: Time complexity is influenced by both the number of items and the knapsack's weight limit.
- **Memory Usage**: `O(nW)` due to the 2D DP array.
- **Usage**: Used in optimization problems involving resource allocation, like cargo loading and budget allocation.

### 8. **Activity Selection**
- **Description**: Greedy algorithm for selecting the maximum number of non-overlapping activities.
- **Pros**:
    - Greedy approach provides optimal solution.
- **Cons**:
    - Assumes sorted input; otherwise, it needs additional sorting.
- **Speed**: `O(n log n)` due to sorting.
- **Memory Usage**: `O(1)` for sorting in-place.
- **Usage**: Used in scheduling problems, such as allocating resources or time slots to activities.

### 9. **N-Queens**
- **Description**: Backtracking algorithm for placing `n` queens on a chessboard without attacking each other.
- **Pros**:
    - Can be optimized for small `n` values.
- **Cons**:
    - Factorial time complexity makes it infeasible for large `n`.
- **Speed**: Slow for large `n` due to factorial complexity.
- **Memory Usage**: `O(n)` for backtracking stack.
- **Usage**: Solving combinatorial problems like puzzle solving, constraint satisfaction problems.

### 10. **Maximum Subarray (Kadane’s Algorithm)**
- **Description**: Finds the contiguous subarray with the largest sum.
- **Pros**:
    - Simple and efficient solution for finding the maximum sum subarray.
- **Cons**:
    - Assumes no constraints like negative sums being unwanted.
- **Speed**: Very fast, linear time complexity.
- **Memory Usage**: `O(1)` (constant space).
- **Usage**: Commonly used in financial algorithms, signal processing, and problem-solving.

### 11. **Genetic Algorithm**
- **Description**: Optimization algorithm based on natural selection, with complexity dependent on generations `g` and population size `p`.
- **Pros**:
    - Suitable for complex optimization problems.
- **Cons**:
    - May require a large number of generations for convergence.
- **Speed**: Can be slow depending on the number of generations.
- **Memory Usage**: Depends on population size `p` and individual representation.
- **Usage**: Used in machine learning, optimization, scheduling problems, and game AI.

### 12. **Simple Neural Network**
- **Description**: Complexity varies based on the network structure, number of layers, and input data.
- **Pros**:
    - Can learn complex patterns in data.
- **Cons**:
    - Can be computationally expensive, especially with deep networks.
- **Speed**: Varies widely depending on the network architecture and training data.
- **Memory Usage**: High for large networks and datasets.
- **Usage**: Used in pattern recognition, speech processing, and image classification.

### 13. **Simulated Annealing**
- **Description**: Probabilistic optimization algorithm using a temperature parameter `k` to explore solutions.
- **Pros**:
    - Good for finding near-optimal solutions to complex problems.
- **Cons**:
    - Slower convergence as `k` decreases.
- **Speed**: Linear in the number of iterations `k`.
- **Memory Usage**: `O(1)` for each iteration.
- **Usage**: Used in optimization problems, such as traveling salesman, circuit design, and job scheduling.

### 14. **Ant Colony Optimization**
- **Description**: Optimization inspired by ants searching for the shortest path between food sources.
- **Pros**:
    - Effective for combinatorial optimization problems.
- **Cons**:
    - Computationally expensive for large problem spaces.
- **Speed**: Slower than traditional methods.
- **Memory Usage**: High, depending on the problem size.
- **Usage**: Used in routing, scheduling, and network optimization.

### 15. **Heap Sort**
- **Description**: Sorting algorithm based on a binary heap, with time complexity similar to merge sort.
- **Pros**:
    - In-place sorting.
    - Does not require auxiliary storage.
- **Cons**:
    - Slower in practice compared to quicksort due to overhead.
- **Speed**: `O(n log n)`, predictable.
- **Memory Usage**: `O(1)`.
- **Usage**: Used for sorting large datasets in memory-constrained environments.

### 16. **Selection Sort**
- **Description**: A simple sorting algorithm that repeatedly selects the smallest element and moves it to the sorted portion of the array.
- **Pros**:
    - Simple to implement.
- **Cons**:
    - Inefficient for large datasets.
- **Speed**: Slow for large datasets (`O(n^2)`).
- **Memory Usage**: `O(1)`.
- **Usage**: Educational purposes, small datasets.

### 17. **Insertion Sort**
- **Description**: Efficient for small or nearly sorted datasets, inserts elements into the sorted portion one at a time.
- **Pros**:
    - Fast for small or nearly sorted data.
- **Cons**:
    - Inefficient for large datasets (`O(n^2)`).
- **Speed**: `O(n^2)` for worst case, `O(n)` for nearly sorted data.
- **Memory Usage**: `O(1)`.
- **Usage**: Used in small or partially sorted data, often as part of more complex algorithms.

### 18. **Dijkstra’s Algorithm**
- **Description**: Finds the shortest path between nodes in a graph, with non-negative edge weights.
- **Pros**:
    - Efficient for finding the shortest path in weighted graphs.
    - Can be optimized with priority queues.
- **Cons**:
    - Requires priority queues or heaps for optimization.
- **Speed**: `O(V log V + E log V)` with a binary heap (priority queue).
- **Memory Usage**: `O(V)` for storing distances and predecessors.
- **Usage**: Used in routing algorithms, GPS navigation, and network optimization.

### 19. **A* Algorithm**
- **Description**: Finds the shortest path from a start node to a goal node, using heuristics to guide the search.
- **Pros**:
    - Can be faster than Dijkstra’s due to heuristic-driven search.
    - Guarantees the shortest path if the heuristic is admissible.
- **Cons**:
    - Requires a good heuristic function for performance.
- **Speed**: `O(V log V + E log V)` with a priority queue, but depends on the heuristic.
- **Memory Usage**: `O(V)` for storing open and closed lists.
- **Usage**: Used in pathfinding, AI, and robotics (e.g., in games and self-driving cars).

### 20. **Bellman-Ford Algorithm**
- **Description**: Finds the shortest paths from a source vertex to all other vertices in a graph, even if edges have negative weights.
- **Pros**:
    - Handles graphs with negative edge weights.
    - Can detect negative weight cycles.
- **Cons**:
    - Slower than Dijkstra’s algorithm (`O(V * E)`).
- **Speed**: `O(V * E)`, slower than Dijkstra’s algorithm for large graphs.
- **Memory Usage**: `O(V)` for distance and predecessor arrays.
- **Usage**: Used in network routing, dealing with graphs with negative weights or detecting negative cycles.

### 21. **Floyd-Warshall Algorithm**
- **Description**: Finds shortest paths between all pairs of nodes in a graph.
- **Pros**:
    - Works for graphs with negative weights (no negative weight cycles).
- **Cons**:
    - Inefficient for large graphs due to `O(V^3)` complexity.
- **Speed**: `O(V^3)` for all-pairs shortest paths.
- **Memory Usage**: `O(V^2)` for storing the distance matrix.
- **Usage**: Used for dense graphs, transitive closure, and solving all-pairs shortest path problems.

### 22. **Topological Sorting**
- **Description**: Orders vertices of a directed acyclic graph (DAG) such that for every directed edge `u → v`, `u` comes before `v`.
- **Pros**:
    - Provides a linear ordering of vertices.
- **Cons**:
    - Only applicable to directed acyclic graphs (DAGs).
- **Speed**: `O(V + E)`, linear time complexity for traversal.
- **Memory Usage**: `O(V)` for storing the graph.
- **Usage**: Used in scheduling problems, task ordering, and resolving dependencies.

### 23. **Union-Find (Disjoint Set)**
- **Description**: Data structure to track a collection of disjoint sets, supports union and find operations.
- **Pros**:
    - Efficient for dynamic connectivity problems.
    - Supports `O(α(n))` time complexity for union and find operations.
- **Cons**:
    - Not suitable for non-partitioned problems.
- **Speed**: Nearly constant time, `O(α(n))`, where `α(n)` is the inverse Ackermann function.
- **Memory Usage**: `O(n)` for storing the sets.
- **Usage**: Used in connected components, Kruskal’s algorithm for MST, and dynamic connectivity problems.

### 24. **Kruskal’s Algorithm**
- **Description**: A greedy algorithm for finding the minimum spanning tree (MST) of a graph.
- **Pros**:
    - Simple and efficient, especially for sparse graphs.
- **Cons**:
    - Needs sorting of edges.
- **Speed**: `O(E log E)` due to edge sorting.
- **Memory Usage**: `O(V)` for storing parent and rank in the union-find structure.
- **Usage**: Used in network design, minimum spanning tree problems, and clustering.

### 25. **Prim’s Algorithm**
- **Description**: A greedy algorithm for finding the MST, starting from an arbitrary node and expanding the tree.
- **Pros**:
    - Efficient for dense graphs.
- **Cons**:
    - Requires priority queue or binary heap for optimization.
- **Speed**: `O(E log V)` with a priority queue.
- **Memory Usage**: `O(V)` for the priority queue and auxiliary storage.
- **Usage**: Used for MST problems in dense graphs or network design.

### 26. **Radix Sort**
- **Description**: Non-comparative integer sorting algorithm that processes digits one by one from least significant to most significant.
- **Pros**:
    - Linear time complexity for integers with fixed size.
- **Cons**:
    - Requires additional memory for counting sort.
- **Speed**: `O(nk)` where `n` is the number of elements and `k` is the number of digits.
- **Memory Usage**: `O(n + k)` for counting sort.
- **Usage**: Used in sorting integers, strings, or fixed-length data.

### 27. **Counting Sort**
- **Description**: A non-comparative sorting algorithm that counts the frequency of each element.
- **Pros**:
    - Very efficient when the range of input elements is small.
- **Cons**:
    - Not suitable for large ranges of input elements.
- **Speed**: `O(n + k)` where `n` is the number of elements and `k` is the range of input values.
- **Memory Usage**: `O(k)` for the counting array.
- **Usage**: Used for sorting integers, typically in situations where the range is known and not too large.

### 28. **Bucket Sort**
- **Description**: Distributes elements into a number of buckets, sorts each bucket, and then concatenates the results.
- **Pros**:
    - Can achieve linear time sorting under certain conditions.
- **Cons**:
    - Inefficient if the range of input values is large.
- **Speed**: `O(n + k)` where `n` is the number of elements and `k` is the number of buckets.
- **Memory Usage**: `O(n)` for the bucket storage.
- **Usage**: Suitable for uniformly distributed data and floating-point numbers.

### 29. **Shell Sort**
- **Description**: An extension of insertion sort, sorting elements at specific intervals to improve efficiency.
- **Pros**:
    - Faster than basic insertion sort.
- **Cons**:
    - Performance depends on the gap sequence.
- **Speed**: `O(n^1.5)` on average, but depends on gap sequence.
- **Memory Usage**: `O(1)` for in-place sorting.
- **Usage**: Used for small to medium-sized datasets when simplicity is prioritized.

### 30. **Radix-Heap Sort**
- **Description**: A hybrid algorithm that combines the techniques of radix sort and heap sort.
- **Pros**:
    - Good for large-scale sorting.
- **Cons**:
    - Complex implementation.
- **Speed**: `O(n log n)` for large datasets.
- **Memory Usage**: `O(n)` for the heap structure.
- **Usage**: Sorting large datasets, especially in computational problems requiring efficient processing.

### 31. **Depth-Limited Search**
- **Description**: A variant of DFS that limits the depth to avoid infinite loops.
- **Pros**:
    - Useful in preventing infinite recursion in deep trees.
- **Cons**:
    - Might miss solutions in deeper levels of the tree.
- **Speed**: Depends on the depth limit `d`.
- **Memory Usage**: `O(d)` for storing the search stack.
- **Usage**: Used in problem spaces where a depth bound is known or to avoid infinite recursion.

### 32. **Breadth-First Search (Iterative Deepening)**
- **Description**: Combines BFS and DFS by performing depth-limited searches iteratively, increasing the depth limit after each iteration.
- **Pros**:
    - Memory-efficient for large graphs or deep trees.
- **Cons**:
    - Slower than BFS for shallow graphs due to repeated exploration.
- **Speed**: `O(b^d)` where `b` is the branching factor and `d` is the depth of the solution.
- **Memory Usage**: `O(d)` where `d` is the depth of the search.
- **Usage**:

Used for deep graphs or in scenarios with unknown solution depths.

### 33. **Knapsack Problem (0/1 Knapsack)**
- **Description**: A dynamic programming problem where a set of items with given weights and values is chosen to maximize value without exceeding a weight limit.
- **Pros**:
    - Guarantees optimal solution.
- **Cons**:
    - Exponential in the number of items in brute force.
- **Speed**: `O(n * W)` where `n` is the number of items and `W` is the weight capacity.
- **Memory Usage**: `O(n * W)` for dynamic programming table.
- **Usage**: Used in resource allocation, project selection, and packing problems.

### 34. **Matrix Chain Multiplication**
- **Description**: A dynamic programming problem that finds the optimal way to parenthesize a sequence of matrices to minimize multiplication cost.
- **Pros**:
    - Guarantees optimal parenthesization for matrix multiplication.
- **Cons**:
    - Computationally intensive for larger matrices.
- **Speed**: `O(n^3)` for `n` matrices.
- **Memory Usage**: `O(n^2)` for the DP table.
- **Usage**: Used in optimizing matrix operations in computational mathematics.

### 35. **Fibonacci Heap**
- **Description**: A data structure that supports efficient union-find operations and priority queue operations.
- **Pros**:
    - Amortized `O(1)` time for insertion and decrease-key operations.
- **Cons**:
    - Complex to implement.
- **Speed**: Amortized `O(log n)` for extract-min and `O(1)` for insertion and decrease-key.
- **Memory Usage**: `O(n)` for storing the heap nodes.
- **Usage**: Used in graph algorithms like Dijkstra's and Prim’s where decrease-key operations are frequent.

### 36. **Rabin-Karp Algorithm**
- **Description**: A string-searching algorithm that uses hashing to find patterns in a text.
- **Pros**:
    - Efficient for searching multiple patterns.
    - Can be faster than other algorithms for certain cases with a good hash function.
- **Cons**:
    - Slower in the worst-case due to hash collisions.
- **Speed**: `O(n + m)` for searching a pattern of length `m` in a text of length `n`.
- **Memory Usage**: `O(m)` for storing the hash value of the pattern.
- **Usage**: Used in text searching and pattern matching algorithms.

### 37. **KMP (Knuth-Morris-Pratt) Algorithm**
- **Description**: A string-searching algorithm that avoids unnecessary re-examination of characters using precomputed partial match information.
- **Pros**:
    - Linear time complexity (`O(n + m)`).
- **Cons**:
    - Needs preprocessing of the pattern, which takes `O(m)` time.
- **Speed**: `O(n + m)` for searching a pattern of length `m` in a text of length `n`.
- **Memory Usage**: `O(m)` for storing the partial match table.
- **Usage**: Efficient for single or multiple pattern matching in strings.

### 38. **Boyer-Moore Algorithm**
- **Description**: A string-searching algorithm that uses two heuristics (bad character and good suffix) to skip over sections of the text efficiently.
- **Pros**:
    - Very fast in practice for large texts.
- **Cons**:
    - Complex to implement.
- **Speed**: `O(n/m)` for average case, `O(n * m)` for the worst-case.
- **Memory Usage**: `O(m)` for storing the bad character shift and good suffix tables.
- **Usage**: Used in text searching, especially for large texts with repeated patterns.

### 39. **Trie Data Structure**
- **Description**: A tree-like data structure that stores a dynamic set of strings, typically used for efficient searching and retrieval.
- **Pros**:
    - Allows for fast prefix-based searches.
    - Space-efficient when storing common prefixes.
- **Cons**:
    - Can consume more space than other structures like hash maps.
- **Speed**: `O(k)` for insertion, search, and deletion, where `k` is the length of the key.
- **Memory Usage**: `O(n * k)` where `n` is the number of keys and `k` is the maximum length of the key.
- **Usage**: Used in autocomplete systems, dictionaries, and IP routing tables.

### 40. **Heap Sort**
- **Description**: A comparison-based sorting algorithm that utilizes a binary heap data structure.
- **Pros**:
    - Guaranteed `O(n log n)` time complexity.
    - In-place sorting.
- **Cons**:
    - Not stable (doesn't preserve equal elements' order).
- **Speed**: `O(n log n)` for all cases.
- **Memory Usage**: `O(1)` for in-place sorting.
- **Usage**: Used in sorting algorithms and priority queues.

### 41. **Merge Sort**
- **Description**: A divide-and-conquer algorithm that divides the array into halves, sorts them, and then merges them back together.
- **Pros**:
    - Stable sort.
    - Predictable `O(n log n)` time complexity.
- **Cons**:
    - Requires additional memory for the merged arrays.
- **Speed**: `O(n log n)` for all cases.
- **Memory Usage**: `O(n)` for auxiliary space during the merge process.
- **Usage**: Used for sorting large datasets, particularly in external sorting and linked lists.

### 42. **Quick Sort**
- **Description**: A divide-and-conquer algorithm that selects a pivot element, partitions the array around the pivot, and recursively sorts the subarrays.
- **Pros**:
    - Very fast in practice for average cases.
    - In-place sorting.
- **Cons**:
    - Unstable sort.
    - Worst-case time complexity of `O(n^2)` (but can be avoided with random pivoting).
- **Speed**: `O(n log n)` on average, `O(n^2)` in the worst case.
- **Memory Usage**: `O(log n)` for the recursive call stack.
- **Usage**: Commonly used for general-purpose sorting due to its average-case efficiency.

### 43. **Flood Fill Algorithm**
- **Description**: Used to determine the area connected to a given node in a multi-dimensional array.
- **Pros**:
    - Simple and intuitive for grid-based problems.
- **Cons**:
    - Can be inefficient for large grids.
- **Speed**: `O(n)` where `n` is the number of nodes in the grid.
- **Memory Usage**: `O(n)` for storing the visited nodes.
- **Usage**: Used in graphics (e.g., for paint bucket tools), solving puzzles, and flood fill algorithms in image processing.

### 44. **Dynamic Programming (DP)**
- **Description**: A method for solving complex problems by breaking them down into simpler subproblems and storing the results to avoid redundant work.
- **Pros**:
    - Reduces time complexity by avoiding recomputation of overlapping subproblems.
- **Cons**:
    - Requires significant memory for storing solutions to subproblems.
- **Speed**: Typically `O(n)` or `O(n^2)` depending on the problem.
- **Memory Usage**: `O(n)` or `O(n^2)` depending on the problem.
- **Usage**: Used in optimization problems such as knapsack, shortest paths, and sequence alignment.

### 45. **Simulated Annealing**
- **Description**: A probabilistic optimization algorithm inspired by the annealing process in metallurgy, used for finding an approximate solution to a problem by exploring neighboring solutions.
- **Pros**:
    - Can escape local minima to find a global minimum.
- **Cons**:
    - No guarantee of finding the optimal solution.
- **Speed**: Depends on the cooling schedule, typically `O(n)` per iteration.
- **Memory Usage**: `O(n)` for storing the current state and its neighbors.
- **Usage**: Used in combinatorial optimization problems such as traveling salesman, job scheduling, and circuit design.

---
