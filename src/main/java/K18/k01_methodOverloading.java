package K18;

public class k01_methodOverloading {
   /* public static void toplama(int a,int b,int c){
        System.out.println("Toplamlari:"+(a+b+c));
            }
    public static void toplama(int a,int b){
        System.out.println("Topllamlari:"+(a+b));
    }
    public static void toplama(int a,int b,int c,int d){
        System.out.println("Topllamlari:"+(a+b+c+d));
    }

    public static void main(String[] args) {
        toplama(3,5);
        toplama(3,4,5); */

    public static void skorHesapla(String name, int score){

        System.out.println(name+ "isimli oyuncunun puani"+score);
    }
    public static void skorHesapla(int score){

        System.out.println("isimsiz oyuncunun puani"+score);
    }
    public static void skorHesapla(String name){

        System.out.println(name+"isimli oyuncunun puani:0");
    }

    public static void main(String[] args) {
        skorHesapla("Murat",100);
        skorHesapla(1000);
        skorHesapla("Mustafa");

    }




}
