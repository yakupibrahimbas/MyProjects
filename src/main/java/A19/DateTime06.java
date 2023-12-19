package A19;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTime06 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen tarih giriiz");
        int year= input.nextInt();
        int month= input.nextInt();
        int day= input.nextInt();

        LocalDate date=LocalDate.of(year,month,day);
        System.out.println(date.getDayOfWeek());

    }
}
