package optionaltask1;

import javafx.util.Pair;

import java.util.Scanner;

public class MinCountDifferentNumbers {
    private static final String TEXT_ENTER_NUMBER = "Введите числа через пробел: ";
    private static final String TEXT_RESULT = "Число в котором количество различных цифр минимально: %s," +
            " количество различных цифр равно: %d";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(TEXT_ENTER_NUMBER);
        String stringNumbers = in.nextLine();
        String[] numbers = stringNumbers.split(" ");
        in.close();
        Pair<String, Integer> result = getMinNonRepeatableNumbersString(numbers);
        System.out.printf(TEXT_RESULT, result.getKey(), result.getValue());
    }

    private static Pair<String, Integer> getMinNonRepeatableNumbersString(String[] numbers) {
        String resultString = null;
        Integer number = null;
        for (String strNumber : numbers) {
            int repeats = getNumberRepeats(strNumber);
            if (number == null || repeats < number) {
                resultString = strNumber;
                number = repeats;
            }
        }
        return new Pair<>(resultString, number);
    }

    private static int getNumberRepeats(final String strNumber) {
        String tempString = new String(strNumber);
        int count = 0;
        while (tempString.length() > 0) {
            char tempChar = tempString.charAt(0);
            tempString = tempString.replaceAll(String.valueOf(tempChar), "");
            count++;
        }
        return count;
    }
}
