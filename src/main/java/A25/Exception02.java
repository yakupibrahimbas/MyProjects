package A25;

public class Exception02 {
    public static void main(String[] args) {

        String s="1234a";
        convertStringToInt(s);
        convertStringToInt(s);
    }
    public static void convertStringToInt(String s){
        try {
            int intS=Integer.valueOf(s);
            System.out.println(intS+1);
        }catch (NumberFormatException e){
            System.out.println("Bir Stringin sayiya cevrilebilbesi icin rakam disi character icermemesi gerekir");
        }

    }
}
