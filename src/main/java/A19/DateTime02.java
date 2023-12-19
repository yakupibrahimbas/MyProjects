package A19;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTime02 {
    public static void main(String[] args) {

        //icinde bulundugumuz zaman dilimindejki tarih
        LocalDate myCurrentTime= LocalDate.now();
        System.out.println(myCurrentTime);//2023-12-19
        System.out.println(myCurrentTime.getMonthValue());//12
        System.out.println(myCurrentTime.getDayOfYear());//353
        System.out.println(myCurrentTime.getDayOfMonth());//19
        System.out.println(myCurrentTime.getMonth());//december

        //Enum=depo
        System.out.println(myCurrentTime.getDayOfWeek());//tuesday
        //ileriki tarihe nasil gidilir
        System.out.println(myCurrentTime.plusYears(1).plusMonths(1).plusDays(1));
        //Gecçmiş tarihe gitme
        System.out.println(myCurrentTime.minusMonths(2).minusDays(2).minusYears(3));
        //spesific bir tarih objesi nasil olusturulır
        LocalDate date1= LocalDate.of(1980,5,5);
        LocalDate date2= LocalDate.of(2000,10,10);
        boolean r1=date1.isBefore(date2);
        System.out.println(r1);

        Scanner input=new Scanner(System.in);
        System.out.println("tarih gir");
        int year=input.nextInt();
        int month=input.nextInt();
        int day=input.nextInt();


        LocalDate givenDate= LocalDate.of(year,month,day);
        if (givenDate.isBefore(LocalDate.now())){
            System.out.println("invalid date");
        }else {
            System.out.println("enter time for ticket");
        }

        //Different example

        System.out.println("Please enter date");
        int y= input.nextInt();
        int m= input.nextInt();
        int d= input.nextInt();
        LocalDate date= LocalDate.of(y,m,d);
        System.out.println(date.getDayOfWeek());

    }
}
