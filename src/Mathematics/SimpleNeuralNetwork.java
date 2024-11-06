package Mathematics;

import java.util.Arrays;

public class SimpleNeuralNetwork {

    public static void runSimpleNeuralNetwork(double[] input, double[][] weights) {
        double[] output = feedforward(input, weights);
        System.out.println("Output: " + Arrays.toString(output));
    }

    public static double[] feedforward(double[] input, double[][] weights) {
        double[] layer1 = new double[2];
        for (int i = 0; i < 2; i++) {
            layer1[i] = sigmoid(input[0] * weights[0][i] + input[1] * weights[1][i]);
        }
        return layer1;
    }

    public static double sigmoid(double x) {
        return 1 / (1 + Math.exp(-x));
    }
}

