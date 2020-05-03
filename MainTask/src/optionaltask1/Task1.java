package optionaltask1;

import java.util.Scanner;

public class Task1 {

    private static final String TEXT_ENTER_NUMBER = "Введите числа через пробел: ";
    private static final String TEXT_RESULT = "%nСамое короткое число: %s, его длина: %d%nСамое длинное число: %s, его длина: %d";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(TEXT_ENTER_NUMBER);
        String stringNumbers = in.nextLine();
        String[] numbers = stringNumbers.split(" ");

        String shortNumber = null;
        String longNumber = null;

        for (String number : numbers) {
            if (shortNumber == null || number.length() <= shortNumber.length()) {
                shortNumber = number;
            }

            if (longNumber == null || number.length() >= longNumber.length()) {
                longNumber = number;
            }
        }

        System.out.printf(TEXT_RESULT, shortNumber, shortNumber.length(), longNumber, longNumber.length());
    }
}
