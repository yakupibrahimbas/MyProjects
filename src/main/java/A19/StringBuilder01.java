package A19;

public class StringBuilder01 {
    public static void main(String[] args) {

        /*
         1)String Builder classi da string üreten bir lasstar
         2)string classs immutable string uretir
         3)String builder mutable string uretir
         4)immutable olmak demek orjinal egerin korunmasi , degistirilemez olmasi demektir


        */

        String s="Java";
        String t=s+"X";
        System.out.println(t);
        String w= t+"?";

        String a="Money";
        System.out.println(w);
        //Stringi degistirdikten sonra ayni stringe assign edersenizz java yine yeni bir container olusturur
        //dolayisiyla eski container adressiz kalir ve garbage collector adressiz olan containerlari siler
        //String builder kullanarak String uretmenin 1 .yolu

        StringBuilder sb1=new StringBuilder("Python");
        sb1.append("!");
        System.out.println(sb1);
        StringBuilder sb2=new StringBuilder();
        System.out.println();

        System.out.println(sb1);

        //capacity ve length arasindaki fark: capacity javanin size verdiği data depolama yer sayisidir
        //Length ise size verilen data depolama yerinin kullanilan kismidir.

        StringBuilder sb3=new StringBuilder(3);
        System.out.println(sb3.append("ali"));

    }
}
