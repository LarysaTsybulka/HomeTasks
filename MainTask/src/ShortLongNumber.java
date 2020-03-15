public class ShortLongNumber {
    private static final String TEXT_ARRAY = "Массив чисел: ";
    private static final String TEXT_RESULT = "%nСамое короткое число: %s, его длина: %d%nСамое длинное число: %s, его длина: %d";
    public static void main(String args[]){
        int shrt = 10;
        int lng = 0;
        String shrtNum=null;
        String lngNum=null;
        System.out.println(TEXT_ARRAY);
        for (String num: args){
            System.out.printf("%s ",num);
            if (num.length() < shrt) {
                shrt = num.length();
                shrtNum = num;
            }
            if (num.length() > lng){
                lng = num.length();
                lngNum = num;
            }
        }
        System.out.printf(TEXT_RESULT, shrtNum, shrt, lngNum,  lng);
    }
}
