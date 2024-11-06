package Optimization;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AntColonyOptimization {
    static int numberOfCities;
    static double[][] pheromones;
    static Random random = new Random();

    public static void runAntColonyOptimization(int numCities, int[][] distanceMatrix, double evaporationRate, double pheromoneConstant) {
        numberOfCities = numCities;
        pheromones = new double[numberOfCities][numberOfCities];

        initializePheromones();

        int iterations = 100;
        int[] bestTour = null;
        double bestTourLength = Double.MAX_VALUE;

        for (int iteration = 0; iteration < iterations; iteration++) {
            int[] tour = generateTour();
            double tourLength = calculateTourLength(tour, distanceMatrix);

            if (tourLength < bestTourLength) {
                bestTourLength = tourLength;
                bestTour = tour.clone();
            }

            updatePheromones(tour, tourLength, pheromoneConstant);
            evaporatePheromones(evaporationRate);
        }

        printBestTour(bestTour, bestTourLength);
    }

    private static void initializePheromones() {
        for (int i = 0; i < numberOfCities; i++) {
            for (int j = 0; j < numberOfCities; j++) {
                pheromones[i][j] = 1.0;
            }
        }
    }

    private static int[] generateTour() {
        List<Integer> cities = new ArrayList<>();
        for (int i = 0; i < numberOfCities; i++) {
            cities.add(i);
        }

        int[] tour = new int[numberOfCities];
        for (int i = 0; i < numberOfCities; i++) {
            int randomIndex = random.nextInt(cities.size());
            tour[i] = cities.remove(randomIndex);
        }
        return tour;
    }

    private static double calculateTourLength(int[] tour, int[][] distanceMatrix) {
        double length = 0.0;
        for (int i = 0; i < numberOfCities - 1; i++) {
            length += distanceMatrix[tour[i]][tour[i + 1]];
        }
        length += distanceMatrix[tour[numberOfCities - 1]][tour[0]];
        return length;
    }

    private static void updatePheromones(int[] tour, double tourLength, double pheromoneConstant) {
        for (int i = 0; i < numberOfCities - 1; i++) {
            int from = tour[i];
            int to = tour[i + 1];
            pheromones[from][to] += pheromoneConstant / tourLength;
            pheromones[to][from] += pheromoneConstant / tourLength;
        }
    }

    private static void evaporatePheromones(double evaporationRate) {
        for (int i = 0; i < numberOfCities; i++) {
            for (int j = 0; j < numberOfCities; j++) {
                pheromones[i][j] *= (1 - evaporationRate);
            }
        }
    }

    private static void printBestTour(int[] bestTour, double bestTourLength) {
        System.out.println("Best tour found: ");
        for (int city : bestTour) {
            System.out.print(city + " -> ");
        }
        System.out.println(bestTour[0]); // بازگشت به شهر اول
        System.out.println("Best tour length: " + bestTourLength);
    }
}
