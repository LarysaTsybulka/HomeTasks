import java.util.Scanner;

public class DifferentNumbers {
    private static final String TEXT_ENTER_NUMBER = "Введите числа через пробел: ";
    private static final String TEXT_RESULT = "Число в котором количество различных цифр минимально: %s," +
            " количество различных цифр равно: %d";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(TEXT_ENTER_NUMBER);
        String stringNumbers = in.nextLine();
        String[] numbers = stringNumbers.split(" ");
        in.close();
        String[] chgNum = findDifNum(numbers);
        for (String s : chgNum) System.out.println(s);
        showMinValue(chgNum);
    }

    private static String[] findDifNum(String[] numbers) {
        String[] num = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) { //cycle for array
            char[] chArray = numbers[i].toCharArray(); //convert to char array
            System.out.println(chArray);
            if (chArray.length > 1) {                   // do cheking if array length more than 1
                for (int n = 0; n < chArray.length - 1; n++) {
                    for (int m = n + 1; m < chArray.length; m++) {
                        if (chArray[n] == chArray[m]) {
                            chArray[m] = ' ';
                        }
                    }
                }
            }
            numbers[i] = new String(chArray);
            num [i] = numbers[i].replaceAll("\\ ","");
        }
        return num;
    }
    private static void showMinValue (String[] numbers){
        String Value = numbers[0];
        int minCount = numbers[0].length();
        for (int i=1;i<numbers.length;i++){
            if (minCount>numbers[i].length()){
                minCount = numbers[i].length();
                Value = numbers[i];
            }
        }
        System.out.printf(TEXT_RESULT,Value,minCount);
    }
}
