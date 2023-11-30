package K28;

import java.util.Scanner;

public class OtobusBiletiHesaplama {
    public static void main(String[] args) {

        int km = 0;
        int age = 0;
        int tripType = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi giriniz: ");
        km = input.nextInt();
        System.out.println("Yasinizi giriniz: ");
        age = input.nextInt();
        System.out.println("Yolculuk tipini giriniz :");
        tripType = input.nextInt();

        boolean isError = false;

        if (km > 0 && age > 0 && (tripType == 1 || tripType == 2)) {

            double ticketPrice=km*0.10;
            double ageDiscountPrice=0;

            if (age<12){
                ageDiscountPrice=ticketPrice*0.50;
            }else if (age>=12&&age<=24){
        ageDiscountPrice=ticketPrice*0.10;
            } else if (age>65) {
                ageDiscountPrice=ticketPrice*0.30;
            }

        }else {
            System.out.println("Hatali veri girdiniz");
        }
    }
}
