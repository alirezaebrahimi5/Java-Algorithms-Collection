package Optimization;
import java.util.Random;

public class Genetic {

    static Random random = new Random();

    public static void runGenetic(int populationSize, int maxGenerations) {
        int[] population = new int[populationSize];

        for (int i = 0; i < populationSize; i++) {
            population[i] = random.nextInt(100);
        }

        for (int generation = 0; generation < maxGenerations; generation++) {
            int bestValue = evaluate(population);
            System.out.println("Generation " + generation + " - Best value: " + bestValue);

            int[] newPopulation = new int[populationSize];
            for (int i = 0; i < populationSize; i++) {
                int parent1 = select(population, populationSize);
                int parent2 = select(population, populationSize);
                int child = crossover(parent1, parent2);
                newPopulation[i] = mutate(child);
            }
            population = newPopulation;
        }
    }

    public static int evaluate(int[] population) {
        int bestValue = 0;
        for (int value : population) {
            bestValue = Math.max(bestValue, value * value);
        }
        return bestValue;
    }

    public static int select(int[] population, int populationSize) {
        return population[random.nextInt(populationSize)];
    }

    public static int crossover(int parent1, int parent2) {
        return (parent1 + parent2) / 2;
    }

    public static int mutate(int value) {
        if (random.nextDouble() < 0.1) {
            value += random.nextInt(10) - 5;
        }
        return value;
    }
}

