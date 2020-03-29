import java.util.Scanner;

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
            if (findEvenNumbers(num) == true) {
                countEven++;
                System.out.println(num);
            } else if(findEvenOddNumbers(num) == true) {
                countEqual++;
                System.out.println(num);
            }
        }
        System.out.printf(TEXT_COUNT_EVEN_NUMBERS, countEven);
        System.out.printf(TEXT_COUNT_EQUAL_NUMBERS, countEqual);
    }

    private static boolean findEvenNumbers(final String strNumber) {
        char[] tempString = strNumber.toCharArray();
        boolean condition = true;
        for (int i = 0; i < tempString.length; i++) {
            if (Character.getNumericValue(tempString[i]) % 2 != 0) {
                condition = false;
                break;
            }
        }
        return condition;
    }

    private static boolean findEvenOddNumbers(final String strNumber) {
        char[] tempString = strNumber.toCharArray();
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < tempString.length; i++) {
            if (Character.getNumericValue(tempString[i]) % 2 != 0) {
                countOdd++;
            } else {
                countEven++;
            }
        }
        return (countOdd == countEven) ? true : false;
    }
}
