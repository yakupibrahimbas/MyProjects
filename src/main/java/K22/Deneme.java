package K22;

public class Deneme {
    public int a=10;
    public static int b=100;
    public static int c=4*b;
    public Deneme(int deger){
        a=deger;
    }
    static {

    }

    public void statikOlmayanMethod(){
        System.out.println("ben statik olamayan bir methodum");
    }
    public static void ornekMethod(){
        System.out.println("ben ornek bir static methodum");
    }

}
