import java.util.Scanner;

public class AverageLength {
    private static final String TEXT_ENTER_NUMBER = "Введите числа через пробел: ";
    private static final String TEXT_AVERAGE_LENGTH = "Средняя длина по всем числам  равна: %d %n";
    private static final String SHOW_NUMBER_LESS_LENGTH = "Числа, длина которых меньше средней:";
    private static final String SHOW_NUMBER_MORE_LENGTH = "Числа, длина которых больше средней:";
    private static final String SHOW_NUMBER = "Число: %s, его длина: %d %n";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(TEXT_ENTER_NUMBER);
        String stringNumbers = in.nextLine();
        String[] numbers = stringNumbers.split(" ");
        in.close();
        int average = findAverage(numbers);
        System.out.printf(TEXT_AVERAGE_LENGTH, average);
        System.out.println(SHOW_NUMBER_LESS_LENGTH);
        showLessAvg(numbers, average);
        System.out.println(SHOW_NUMBER_MORE_LENGTH);
        showMoreAvg(numbers, average);
    }

    private static int findAverage(String[] numbers) {
        int avg = 0;
        for (String num : numbers) avg += num.length();
        return avg = (int) (avg / numbers.length);
    }

    private static void showLessAvg(String[] numbers, int average) {
        int avg = average;
        for (String num : numbers) {
            if (num.length() < avg) {
                System.out.printf(SHOW_NUMBER, num, num.length());
            }
        }
    }

    private static void showMoreAvg(String[] numbers, int average) {
        int avg = average;
        for (String num : numbers) {
            if (num.length() > avg) {
                System.out.printf(SHOW_NUMBER, num, num.length());
            }
        }
    }
}
