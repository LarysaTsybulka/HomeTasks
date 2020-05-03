package optionaltask1;

import java.util.Scanner;

public class Task3 {
    private static final String TEXT_ENTER_NUMBER = "Введите числа через пробел: ";
    private static final String TEXT_AVERAGE_LENGTH = "Средняя длина по всем числам  равна: %d %n";
    private static final String SHOW_NUMBER_LESS_LENGTH = "Числа, длина которых меньше средней:";
    private static final String SHOW_NUMBER_MORE_LENGTH = "Числа, длина которых больше либо равна средней:";
    private static final String SHOW_NUMBER = "Число: %s, его длина: %d %n";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(TEXT_ENTER_NUMBER);
        String stringNumbers = in.nextLine();
        String[] numbers = stringNumbers.split(" ");
        in.close();
        int avgLenght = findAverage(numbers);


        System.out.printf(TEXT_AVERAGE_LENGTH, avgLenght);
        System.out.println(SHOW_NUMBER_LESS_LENGTH);

        showLessAvg(numbers, avgLenght);
        System.out.println(SHOW_NUMBER_MORE_LENGTH);
        showMoreAvg(numbers, avgLenght);
    }

    private static int findAverage(String[] numbers) {
        int commonLenght = 0;
        for (String num : numbers) {
            commonLenght += num.length();
        }
        float avgLenght = commonLenght / (float) numbers.length;
        return (int) ((avgLenght - (int) avgLenght) >= 0.5f ? avgLenght + 1.0f : avgLenght);
    }

    private static void showLessAvg(String[] numbers, final int avgLenght) {
        for (String num : numbers) {
            if (num.length() < avgLenght) {
                System.out.printf(SHOW_NUMBER, num, num.length());
            }
        }
    }

    private static void showMoreAvg(String[] numbers, final int avgLenght) {
        for (String num : numbers) {
            if (num.length() >= avgLenght) {
                System.out.printf(SHOW_NUMBER, num, num.length());
            }
        }
    }
}
