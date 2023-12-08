package A8;

public class Example02 {
    public static void main(String[] args) {

//Ornek 1: "s" String'indeki "money" kelimesini "dollar" olarak degistiriniz
        //replace() String'lerde degisiklik yapmak icin kullanilir.

        String s = "Learn Java earn 1234 money";
        String s1 = s.replace("money", "dollar");
        System.out.println(s1);//Learn Java earn dollar

    }
}
