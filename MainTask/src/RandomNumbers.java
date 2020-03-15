import java.util.Scanner;

public class RandomNumbers {

    private static final String TEXT_PUT_COUNT = "Введите количество случайных чисел для генерации: ";
    private static final String TEXT_WITHOUT_NEW_LINE = "Вывод чисел без перехода на новую строку:";
    private static final String TEXT_WITH_NEW_LINE = "Вывод чисел с переходом на новую строку: ";

    public static void main(String args[]){
        int countNumbers;
        Scanner in = new Scanner(System.in);
        System.out.print(TEXT_PUT_COUNT);
        countNumbers = in.nextInt();
        System.out.println(TEXT_WITHOUT_NEW_LINE);
        for (int i=0; i < countNumbers; i++){
            System.out.printf("%5.2f ",(Math.random()*(90)+10));
        }
        System.out.println();
        System.out.println(TEXT_WITH_NEW_LINE);
        for (int i=0; i < countNumbers; i++){
            System.out.printf("%5.2f%n",(Math.random()*(90)+10));
        }
        in.close();
    }
}
