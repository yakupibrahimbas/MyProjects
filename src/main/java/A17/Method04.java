package A17;

public class Method04 {
    public static void main(String[] args) {
       int toplam= toplama(3,5);
        System.out.println(toplam);
        int carpma=carpma(3,5);
        System.out.println(carpma);
        int carpTopla=carpTopla(3,3,3);
        System.out.println(carpTopla);
        kelime("Ali can");

    }
    public static int toplama(int a,int b){
        return a+b;
    }
    public static int carpma(int a,int b){
        return a*b;
    }
    public static int carpTopla(int a,int b, int c){
        return a*b+c;
    }
    public static void kelime(String a){
        System.out.println(a);
        //Eger method yeni data uretmiyor ise return type'i void olur
        //body icine return yazilmaz
        //Not: Method parantezi icine yazilanlara parametre,
        //main icinde yapilan "method call" da kullanilan degerlere (carpma(3,5)) arguman denir
    }
}
