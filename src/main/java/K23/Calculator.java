package K23;

public class Calculator {

    public int sayi1, sayi2;
    public int sayi3, sayi4;

    public void add(int sayi1, int sayi2) {
        int toplam = sayi1 + sayi2;
        System.out.println("Toplam:"+toplam);
    }
    public boolean add(int sayi1, int sayi2, int sayi3){
        int toplam1=sayi1+sayi2+sayi3;
        System.out.println("yeni toplam:"+toplam1);

        return false;
    }

}
