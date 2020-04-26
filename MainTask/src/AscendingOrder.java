import java.util.Scanner;

import static java.lang.Character.getNumericValue;

public class AscendingOrder {
    private static final String TEXT_INPUT = "Введите числа через пробел: ";
    private static final String TEXT_RESULT = "Первое число, цифры в котором расположены по возрастанию: %s";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(TEXT_INPUT);
        String stringNumbers = in.nextLine();
        String[] numbers = stringNumbers.split(" ");
        in.close();
        showAscendingNumber(numbers);
    }

    private static void showAscendingNumber(String[] numbers) {
        for (String num : numbers) {
            if (findAscendingNumber(num)) {
                System.out.printf(TEXT_RESULT, num);
                break;
            }
        }
    }

    private static boolean findAscendingNumber(String number) {
        char[] tempString = number.toCharArray();
        for (int i = 0; i < tempString.length - 1; i++) {
            int current = getNumericValue(tempString[i]);
            int next = getNumericValue(tempString[i + 1]);
            if (current >= next) {
                return false;
            }
        }
        return true;
    }
}
