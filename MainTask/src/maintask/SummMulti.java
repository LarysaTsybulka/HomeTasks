package maintask;

public class SummMulti {

    private static final String TEXT_SUMM = "Сумма чисел равна: %d%n";
    private static final String TEXT_MULTI = "Произведение чисел равно: %d%n";
    private static final String TEXT_EMPTY_ARRAY = "Массив пустой";

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println(TEXT_EMPTY_ARRAY);
        } else {
            long summ = 0;
            long multi = 1;
            for (String arg : args) {
                long parsedNumber = Long.parseLong(arg);
                summ += parsedNumber;
                multi *= parsedNumber;
            }
            System.out.printf(TEXT_SUMM, summ);
            System.out.printf(TEXT_MULTI, multi);
        }
    }
}
