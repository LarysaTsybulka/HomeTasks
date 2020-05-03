package maintasks;

import java.util.Scanner;

public class RandomNumbers {

    private static final String TEXT_PUT_COUNT = "Введите количество случайных чисел для генерации: ";
    private static final String TEXT_WITHOUT_NEW_LINE = "Вывод чисел без перехода на новую строку:";
    private static final String TEXT_WITH_NEW_LINE = "Вывод чисел с переходом на новую строку: ";
    private static final String SINGLE_LINE_FORMATTER = "%5.2f ";
    private static final String NEW_LINE_FORMATTER = "%5.2f%n";
    private static final int MIN_RANDON_VALUE = 10;
    private static final int MAX_RANDON_VALUE = 100;

    public static void main(String[] args) {
        int countNumbers;
        Scanner in = new Scanner(System.in);
        System.out.print(TEXT_PUT_COUNT);
        countNumbers = in.nextInt();
        System.out.println(TEXT_WITHOUT_NEW_LINE);
        print(countNumbers, SINGLE_LINE_FORMATTER);
        System.out.println();
        System.out.println(TEXT_WITH_NEW_LINE);
        print(countNumbers, NEW_LINE_FORMATTER);
        in.close();
    }

    private static void print(int count, String message) {
        for (int i = 0; i < count; i++) {
            System.out.printf(message, (Math.random() * (MAX_RANDON_VALUE - MIN_RANDON_VALUE) + MIN_RANDON_VALUE));
        }
    }
}
