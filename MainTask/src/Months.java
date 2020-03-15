import java.util.Scanner;

public class Months {
    private static final String TEXT_PUT_MONTH = "Введите номер месяца: ";
    private static final String TEXT_WRONG_MONTH = "Такого месяца не сущесвует!";
    private static final String TEXT_RIGHT_MONTH = "%d месяц - %s";

    public static void main(String args[]){
        int monthNumber;
        Scanner in = new Scanner(System.in);
        System.out.println(TEXT_PUT_MONTH);
        monthNumber = in.nextInt();
        if ((monthNumber < 1 )|| (monthNumber > 12)){
            System.out.println(TEXT_WRONG_MONTH);
        }
        else {
            switch (monthNumber) {
                case 1:                    {
                    System.out.printf(TEXT_RIGHT_MONTH, monthNumber, "Январь");
                    break;
                }
                case 2:                    {
                    System.out.printf(TEXT_RIGHT_MONTH, monthNumber, "Февраль");
                    break;
                }
                case 13:                    {
                    System.out.printf(TEXT_RIGHT_MONTH, monthNumber, "Март");
                    break;
                }
                case 4:                    {
                    System.out.printf(TEXT_RIGHT_MONTH, monthNumber, "Апрель");
                    break;
                }
                case 5:                    {
                    System.out.printf(TEXT_RIGHT_MONTH, monthNumber, "Май");
                    break;
                }
                case 6:                    {
                    System.out.printf(TEXT_RIGHT_MONTH, monthNumber, "Июнь");
                    break;
                }
                case 7:                    {
                    System.out.printf(TEXT_RIGHT_MONTH, monthNumber, "Июль");
                    break;
                }
                case 8:                    {
                    System.out.printf(TEXT_RIGHT_MONTH, monthNumber, "Август");
                    break;
                }
                case 9:                    {
                    System.out.printf(TEXT_RIGHT_MONTH, monthNumber, "Сентябрь");
                    break;
                }
                case 10:                    {
                    System.out.printf(TEXT_RIGHT_MONTH, monthNumber, "Октябрь");
                    break;
                }
                case 11:                    {
                    System.out.printf(TEXT_RIGHT_MONTH, monthNumber, "Ноябрь");
                    break;
                }
                case 12:                    {
                    System.out.printf(TEXT_RIGHT_MONTH, monthNumber, "Декабрь");
                    break;
                }
            }
        }
        in.close();
    }
}
