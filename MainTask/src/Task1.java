import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeMath.round;

public class Task1 {
    private static final String TEXT_INPUT = "Введите размерность массива: ";
    private static final String TEXT_INPUT_ROW = "Введите строки: ";
    private static final String TEXT_UOTPUT = "Массив до сортировки: ";
    private static final String TEXT_UOTPUT_ROWSORTING = "Массив после сортировки по строкам: ";
    private static final int MIN_RANDON_VALUE = -20;
    private static final int MAX_RANDON_VALUE = 20;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(TEXT_INPUT);
        int n = in.nextInt();

        double[][] array = new double[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                double randomNumber = Math.random() * (MAX_RANDON_VALUE - MIN_RANDON_VALUE) + MIN_RANDON_VALUE;
                array[i][j] = Math.round(randomNumber);
            }
        }
        System.out.println(TEXT_UOTPUT);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println(TEXT_INPUT_ROW);
        int row = in.nextInt();

        System.out.println(TEXT_UOTPUT_ROWSORTING);
        sortingRow(array,row-1); // ?? row-1
        in.close();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
    private static void sortingRow(double[][] array, int row){
        int p = row;
        for (int n = 0; n < array.length; n++) {
            for (int m= n+1; m<array.length-1;m++ )
            if (array[p][n]>array[p][m]){
                changeElement(array,n);
            }
        }
    }

    private static void changeElement(double[][] array, int n){
        for (int i = 0; i < array.length; i++) {
            double temp = array[i][n];
            array[i][n] = array[i][n+1];
            array[i][n+1] = temp;
        }
    }
}
