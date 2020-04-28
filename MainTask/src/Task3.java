import java.util.Scanner;

import static java.lang.Math.random;


public class Task3 {
    private static final String TEXT_INPUT = "Введите размерность массива: ";
    private static final String TEXT_OUTPUT = "Массив: ";
    private static final String TEXT_OUTPUT_SUMM_ROW = "Сумма строки:";
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
        findSummElements(array);
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

    private static void findSummElements(double[][] array) {

        for (int i = 0; i < array.length; i++) {
            double sum = 0;
            int k = 0;
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    k++;
                }
                if (k == 1 || k == 2) {
                    sum += array[i][j];
                }
                if (k >= 2) {
                    break;
                }
            }
            System.out.println(TEXT_OUTPUT_SUMM_ROW + i + " = " + sum);
        }
    }

}
