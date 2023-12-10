package A9;

import java.util.function.Function;

public class Lambda {
    public static void main(String[] args) {

        Function<Integer,Integer> kareAl=(sayi)->sayi*sayi;
        int ornekSayi=20;
        int kare=kareAl.apply(ornekSayi);
        System.out.println("sayinin karesi:"+kare);
    }
}
