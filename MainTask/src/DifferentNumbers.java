import java.util.Scanner;

public class DifferentNumbers {
    private static final String TEXT_INPUT = "Введите числа через пробел: ";
    private static final String TEXT_RESULT = "Первое число, состоящее только из различных цифр: %s";
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println(TEXT_INPUT);
        String stringNumbers = in.nextLine();
        String[] numbers = stringNumbers.split(" ");
        in.close();
        showDifferentNumber (numbers);
    }

    private static void showDifferentNumber(String[] numbers){
        for (String num:numbers){
            if (findDifferentNumber(num)==true){
                System.out.printf(TEXT_RESULT, num);
                break;
            }
        }
    }

    private static boolean findDifferentNumber (String number){
        boolean condition = true;
        int previous = 0;
        int next = 0;
        char[] tempString = number.toCharArray();
        for (int i = 0; i< tempString.length-1;i++){
            for (int j = i+1; j< tempString.length;j++){
                previous = Character.getNumericValue(tempString[i]);
                next = Character.getNumericValue(tempString[j]);
                if (previous==next){
                    condition = false;
                    break;
                }
            }

        }
        return condition;
    }
}
