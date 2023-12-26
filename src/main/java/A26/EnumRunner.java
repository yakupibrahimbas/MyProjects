package A26;

import java.util.Scanner;

public class EnumRunner {
    public static void main(String[] args) {

       Cities adana= Cities.ADANA;
        System.out.println(adana);
        String adanaCityName= Cities.TRABZON.getCityName();
        System.out.println(adanaCityName);
        String adiyamanPostalCode= Cities.ADIYAMAN.getPostalCode();
        System.out.println(adiyamanPostalCode);


        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen plaka kodu giriniz");
        int plaka=input.nextInt();

        //Values methodu enum icindeki tum datalari
       Cities cities[]= Cities.values();
       for (Cities w:cities){
          if (plaka==w.getPlataCode()){
              System.out.println("Girmis oldugunuz "+w.getCityName()+" iline aittir.");
              break;
          }
       }


    }
}
