import java.util.Scanner;

import static java.lang.Math.random;

public class Task4 {
    private static final String TEXT_INPUT = "Введите размерность массива: ";
    private static final String TEXT_OUTPUT = "Массив: ";
    private static final String TEXT_OUTPUT_MAX_ELEMENT = "Максимальный элемент:";
    private static final int MIN_VALUE = -20;
    private static final int MAX_VALUE = 20;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(TEXT_INPUT);
        int n = in.nextInt();
        in.close();
        double[][] array = generateArray(n);

        System.out.println(TEXT_OUTPUT);
        printArray(array);
        double maxElem = findMaxElement(array);
        deleteRowsColumns(array, maxElem);
        System.out.println(TEXT_OUTPUT);
        printArray(array);
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

    private static double findMaxElement(double[][] array) {
        double maxElem = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > maxElem) {
                    maxElem = array[i][j];
                }
            }
        }
        return maxElem;
    }
    private static void deleteRowsColumns(double[][] array, double maxElem) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == maxElem) {
                    deleting(array, i,j);
                }
            }
        }
    }
    private static void deleting(double[][] array, int m, int n) {
        for (int j = 0; j < array.length; j++) {
            array[m][j] = 0;
        }
        for (int i = 0; i < array.length; i++) {
            array[i][n] = 0;
        }
    }
}
