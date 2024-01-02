package O2;

import java.util.Scanner;

public class String04 {
    public static void main(String[] args) {
        //kullanicidan ad ve soyadini ve 11 haneli kimlik nosunu aliniz.
        //kullanici ad ve soyadini yazarken bas ve sona space koyarsa siliniz
        //ad ve soyadin ilk harfleri buyuk diger harfleri kucuk olmali
        //kimlik numarasinin son 4 rakami haric hepsi **** olmali

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz");
        String ad=scan.nextLine();
        System.out.println("Lutfen soyadinizi giriniz");
        String soyad=scan.nextLine();
        System.out.println("Lutfen kimlik numaranizi giriniz");
        String kimlik= scan.nextLine();

       ad= ad.trim();
       soyad= soyad.trim();
       ad= ad.substring(0,1).toUpperCase()+ad.substring(1).toLowerCase();
        System.out.println(ad);
        soyad= soyad.substring(0,1).toUpperCase()+soyad.substring(1).toLowerCase();
        System.out.println(soyad);

      kimlik= "*******"+kimlik.substring(kimlik.length()-4);
        System.out.println(ad);
        System.out.println(soyad);
        System.out.println(kimlik);



    }
}
