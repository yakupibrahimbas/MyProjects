package K19;

public class Siniflar {
    public static void main(String[] args) {
     /*   HesapMakinesi makine1;
        makine1=new HesapMakinesi(1,3);
        makine1.sayi1=5;
        System.out.println(makine1.sayi1+"-"+makine1.sayi2); */

        HesapMakinesi m1=new HesapMakinesi(10,5);
        System.out.println("m1.toplama() = " + m1.toplama());
        m1.sayi1=8;
        System.out.println(m1.cikarma());
        HesapMakinesi m2=new HesapMakinesi(20,3);
    }
}
