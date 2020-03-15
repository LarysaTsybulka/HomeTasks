public class SummMulti {

    private static final String TEXT_SUMM = "Сумма чисел равна: %d%n";
    private static final String TEXT_MULTI = "Произведение чисел равно: %d%n";
    public static void main(String args[]){
        int summ = 0;
        int multi = 1;
        for (int i = 0; i< args.length; i++){
            summ += Integer.parseInt(args[i]);
            multi *= Integer.parseInt(args[i]);
        }
        System.out.printf(TEXT_SUMM,summ);
        System.out.printf(TEXT_MULTI,multi);
    }
}
