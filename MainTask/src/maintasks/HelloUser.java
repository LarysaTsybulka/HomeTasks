package maintasks;

import java.util.Scanner;

public class HelloUser {

    private static final String TEXT_PUT_NAME = "Введите имя: ";
    private static final String TEXT_GREETING = "Приветствую Вас, %s";

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print(TEXT_PUT_NAME);
        String name = in.nextLine();
        System.out.printf(TEXT_GREETING, name);
        in.close();
    }
}
