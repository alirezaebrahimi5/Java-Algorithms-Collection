package Optimization;

import java.util.Random;

public class SimulatedAnnealing {
    static Random random = new Random();

    public static void runSimulatedAnnealing(double initialTemperature, double coolingRate) {
        double currentSolution = random.nextDouble() * 100;
        double bestSolution = currentSolution;

        double temperature = initialTemperature;

        while (temperature > 1) {
            double newSolution = currentSolution + (random.nextDouble() - 0.5) * 10;

            double currentEnergy = objectiveFunction(currentSolution);
            double newEnergy = objectiveFunction(newSolution);

            if (acceptanceProbability(currentEnergy, newEnergy, temperature) > random.nextDouble()) {
                currentSolution = newSolution;
            }

            if (objectiveFunction(currentSolution) < objectiveFunction(bestSolution)) {
                bestSolution = currentSolution;
            }

            temperature *= 1 - coolingRate;
        }

        System.out.println("Best solution found: " + bestSolution);
        System.out.println("Objective function value: " + objectiveFunction(bestSolution));
    }

    public static double objectiveFunction(double x) {
        return x * x + 4 * Math.cos(x);
    }

    public static double acceptanceProbability(double currentEnergy, double newEnergy, double temperature) {
        if (newEnergy < currentEnergy) return 1.0;
        return Math.exp((currentEnergy - newEnergy) / temperature);
    }
}
