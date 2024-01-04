package O4;

import java.util.Scanner;

public class ForLoops05 {
    public static void main(String[] args) {

        //Baslangic ve bitisi kullanicidan al
        //bu sayilarin toplamini ekrana yaz

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 2 sayi giriniz");
        System.out.println("Sayi1");
        int sayi1=scan.nextInt();
        System.out.println("Sayi2");
        int sayi2=scan.nextInt();
        int toplam=0;
        for (int i = sayi1; i <= sayi2; i++) {
            toplam=toplam+i;
        }
        System.out.println(toplam);
    }
}
