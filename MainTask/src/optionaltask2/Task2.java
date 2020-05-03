package optionaltask2;

import java.util.Scanner;

import static java.lang.Math.random;

public class Task2 {
    private static final String TEXT_INPUT = "Введите размерность массива: ";
    private static final String TEXT_OUTPUT = "Массив: ";
    private static final String TEXT_COUNT_ASCENDING_ELEMENTS = "Наибольшее количество возрастающих элементов: ";
    private static final int MIN_VALUE = -20;
    private static final int MAX_VALUE = 20;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(TEXT_INPUT);
        int n = in.nextInt();

        double[][] array = generateArray(n);
        System.out.println(TEXT_OUTPUT);
        printArray(array);

        double[] vector = changeArrayToVector(array);
        int count = findCountAscendingElements(vector);
        System.out.println(TEXT_COUNT_ASCENDING_ELEMENTS + count);
    }

    private static double[][] generateArray(int n) {
        double[][] array = new double[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random() * (MAX_VALUE - MIN_VALUE) + MIN_VALUE;
            }
        }
        return array;
    }

    private static void printArray(double[][] array) {
        for (double[] row : array) {
            for (double item : row) {
                System.out.printf("%4.2f\t", item);
            }
            System.out.println();
        }
    }

    private static double[] changeArrayToVector(double[][] array) {
        double[] vector = new double[array.length * array.length];
        int m = 0;
        for (double[] row : array) {
            for (double item : row) {
                vector[m] = item;
                m++;
            }
        }
        return vector;
    }

    private static int findCountAscendingElements(double[] vector) {
        int count = 0;
        int temp = 1;
        for (int i = 0; i < vector.length - 1; i++) {
                double current = vector[i];
                double next = vector[i + 1];
                if (current < next) {
                    temp++;
                } else {
                    if (count < temp) {
                        count = temp;
                    }
                    temp = 1;
                }
        }
        return count;
    }
}
