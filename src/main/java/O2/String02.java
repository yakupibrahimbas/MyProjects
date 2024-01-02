package O2;

public class String02 {
    public static void main(String[] args) {

        String s1="Java OOP languagedir";
        System.out.println(s1.substring(3));
        System.out.println(s1.substring(0));
        System.out.println(s1.substring(s1.length() - 1));//yazilan kod dinamik olmalidir-- Java OOP Language oldugu icin populerdir.
        System.out.println(s1.substring(9, 17));
        System.out.println(s1.substring(0, 1));
       // System.out.println(s1.substring(5, 2));
        String s2="          Java ogrenen diger dilleri cabucak ogrenir";
        System.out.println(s2.trim());//trim methodu bastaki ve sonraki bosluklari giderir. aradakilere dokunmaz.


    }

}
