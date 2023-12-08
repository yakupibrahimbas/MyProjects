package A7;

public class StringManipulation01 {
    public static void main(String[] args) {


        //Soru 1: Bir string'in uzunluğunu nasıl bulabiliriz?
        //Cevap 1: Java'da, length() metodunu kullanarak bir string'in uzunluğunu bulabiliriz. Örneğin:


        String y="Yakup";
        System.out.println(y.length());

        String y2="Mustafa";
        char karakter=y2.charAt(2);
        System.out.println(karakter);

        String ss=y2.substring(3);
        System.out.println(ss);

        StringBuilder reverse=new StringBuilder(y2).reverse();
        System.out.println(reverse);




    }
}
