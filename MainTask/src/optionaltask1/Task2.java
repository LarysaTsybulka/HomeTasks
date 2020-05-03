package optionaltask1;

import java.util.Scanner;

public class Task2 {
    private static final String TEXT_ENTER_NUMBER = "Введите числа через пробел: ";
    private static final String TEXT_SORT_ASC = "Сортировка по возрастанию: ";
    private static final String TEXT_SORT_DESC = "Сортировка по убыванию: ";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(TEXT_ENTER_NUMBER);
        String stringNumbers = in.nextLine();
        String[] numbers = stringNumbers.split(" ");
        in.close();
        sortAscending(numbers);
        print(numbers, TEXT_SORT_ASC);
        sortDescending(numbers);
        print(numbers, TEXT_SORT_DESC);
    }

    private static void sortAscending(String[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i].length() > numbers[j].length()) {
                    String temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }

    private static void sortDescending(String[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i].length() < numbers[j].length()) {
                    String temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }

    private static void print(String[] numbers, String message) {
        System.out.println(message);
        for (String number : numbers) {
            System.out.println("Число:" + number + " длина:" + number.length());
        }
    }
}
