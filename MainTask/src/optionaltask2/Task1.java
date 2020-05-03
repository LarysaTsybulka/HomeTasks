package optionaltask2;

import java.util.Scanner;

import static java.lang.Math.random;


public class Task1 {
    private static final String TEXT_INPUT = "Введите размерность массива: ";
    private static final String TEXT_INPUT_ROW = "Введите строки: ";
    private static final String TEXT_OUTPUT = "Массив до сортировки: ";
    private static final String TEXT_OUTPUT_ROW_SORTING = "Массив после сортировки по строкам: ";
    private static final int MIN_VALUE = -20;
    private static final int MAX_VALUE = 20;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(TEXT_INPUT);
        int n = in.nextInt();

        double[][] array = generateArray(n);

        System.out.println(TEXT_OUTPUT);
        printArray(array);

        System.out.println(TEXT_INPUT_ROW);
        int rowNumber = in.nextInt();
        in.close();

        System.out.println(TEXT_OUTPUT_ROW_SORTING);
        sortingRow(array, rowNumber - 1);

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

    private static void sortingRow(final double[][] array, final int row) {
        for (int n = 0; n < array.length - 1; n++) {
            for (int m = n + 1; m < array.length; m++) {
                if (array[row][n] > array[row][m]) {
                    changeElement(array, n, m);
                }
            }
        }
    }

    private static void changeElement(double[][] array, int n, int m) {
        for (int i = 0; i < array.length; i++) {
            double temp = array[i][n];
            array[i][n] = array[i][m];
            array[i][m] = temp;
        }
    }
}
