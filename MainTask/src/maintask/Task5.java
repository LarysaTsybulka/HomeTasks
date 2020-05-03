package maintask;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task5 {
    private static final String TEXT_PUT_MONTH = "Введите номер месяца: ";
    private static final String TEXT_WRONG_MONTH = "Такого месяца не сущесвует!";
    private static final String TEXT_WRONG_NUMBER = "Введен неверный формат числа!";
    private static final String TEXT_RIGHT_MONTH = "%d месяц - %s";
    private static final String[] MONTHS = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август",
            "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(TEXT_PUT_MONTH);
        try {
            printMonth(in.nextInt());
        } catch (InputMismatchException e) {
            System.out.println(TEXT_WRONG_NUMBER);
        }
        in.close();
    }

    private static void printMonth(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println(TEXT_WRONG_MONTH);
        } else {
            System.out.printf(TEXT_RIGHT_MONTH, monthNumber, MONTHS[monthNumber - 1]);
        }
    }
}
