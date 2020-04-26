import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Character.getNumericValue;

public class EvenOddNumbers {
    private static final String TEXT_INPUT = "Введите числа через пробел: ";
    private static final String TEXT_COUNT_EVEN_NUMBERS = "Количество чисел, которые содержат четных цифры: %d";
    private static final String TEXT_COUNT_EQUAL_NUMBERS = "Количество чисел, которые содержат равное " +
            "количество четных и нечентных цифр: %d";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(TEXT_INPUT);
        String stringNumbers = in.nextLine();
        String[] numbers = stringNumbers.split(" ");
        in.close();
        showResult(numbers);
    }

    private static void showResult(String[] numbers) {
        int countEven = 0;
        int countEqual = 0;
        for (String num : numbers) {
            if (findEvenNumbers(num)) {
                countEven++;
            } else if(findEvenOddNumbers(num)) {
                countEqual++;
            }
        }
        System.out.print(Arrays.toString(numbers)+"\n");
        System.out.printf(TEXT_COUNT_EVEN_NUMBERS+"\n", countEven);
        System.out.printf(TEXT_COUNT_EQUAL_NUMBERS, countEqual);
    }

    private static boolean findEvenNumbers(final String strNumber) {
        for (char number : strNumber.toCharArray()) {
            if (getNumericValue(number) % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean findEvenOddNumbers(final String strNumber) {
        int countEven = 0;
        int countOdd = 0;
        for (char number : strNumber.toCharArray()) {
            if (getNumericValue(number) % 2 != 0) {
                countOdd++;
            } else {
                countEven++;
            }
        }
        return countOdd == countEven;
    }
}
