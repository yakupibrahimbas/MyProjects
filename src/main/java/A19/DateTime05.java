package A19;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTime05 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen tarih giriiz");
        int year= input.nextInt();
        int month= input.nextInt();
        int day= input.nextInt();

        LocalDate girilenTarih=LocalDate.of(year,month,day);
        if (girilenTarih.isAfter(LocalDate.now())){
            System.out.println("Gecersiz tarih girdiniz");
        }else {
            System.out.println("Zamani girebilirsiniz");
        }

    }
}
