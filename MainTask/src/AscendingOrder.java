import java.util.Scanner;

public class AscendingOrder {
    private static final String TEXT_INPUT = "Введите числа через пробел: ";
    private static final String TEXT_RESULT = "Первое число, цифры в котором расположены по возрастанию: %s";
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println(TEXT_INPUT);
        String stringNumbers = in.nextLine();
        String[] numbers = stringNumbers.split(" ");
        in.close();
        showAscendingNumber(numbers);
    }

    private static void showAscendingNumber(String[] numbers){
        for (String num:numbers){
            if (findAscendingNumber(num)==true){
                System.out.printf(TEXT_RESULT, num);
                break;
            }
        }
    }

    private static boolean findAscendingNumber (String number){
        int previous = 0;
        int next = 0;
        int up = 0;
        boolean condition = true;
        char[] tempString = number.toCharArray();
        for (int i = 0; i< tempString.length-1;i++){
                previous = Character.getNumericValue(tempString[i]);
                next = Character.getNumericValue(tempString[i+1]);
                if (next < previous){
                    condition = false;
                    break;
                } else if ((next-previous)!=1) {
                    condition = false;
                    break;
                }
        }
        return condition;
    }
}
