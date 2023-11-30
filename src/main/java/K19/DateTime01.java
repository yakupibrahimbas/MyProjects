package K19;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {

        LocalDate myDate=LocalDate.now(); //now static bir methoddur.
        System.out.println(myDate);
        System.out.println("myDate.getMonthValue() = " + myDate.getMonthValue());
       Month ay= myDate.getMonth();
        System.out.println(ay);
        System.out.println(myDate.getYear());
        System.out.println(myDate.getDayOfYear());
        int gun=myDate.getDayOfMonth();
        System.out.println(gun);
        DayOfWeek gun2=myDate.getDayOfWeek();
        System.out.println(gun2);
       LocalDate newDate= myDate.plusYears(1).plusMonths(1).plusDays(1);
        System.out.println("NewDate:"+newDate);
        System.out.println(myDate.minusYears(1).minusMonths(1).minusDays(1));
        LocalDate date1=LocalDate.of(1980,8,3);
        LocalDate date2=LocalDate.of(2010,12,6);
        System.out.println("date1:"+date1+",date2="+date2);
        Boolean sonrami=date1.isAfter(date2);;
        System.out.println(sonrami);
        Boolean oncemi=date1.isBefore(date2);
        System.out.println(oncemi);
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen verilen sirada tarih bilgisini giriniz. yil-ay-gun");

        int year=input.nextInt();
        int month= input.nextInt();
        int day= input.nextInt();

        LocalDate girilenTarih=LocalDate.of(year,month,day);
        if (girilenTarih.isBefore(LocalDate.now())){
            System.out.println("Gecersiz tariih girdiniz");
        }else {
            System.out.println("zamani girebilirsiniz");
        }

        System.out.println("Lutfen verilen sirada tarih bilgisini giriniz");
        int y=input.nextInt();
        int m=input.nextInt();
        int d=input.nextInt();

        LocalDate date=LocalDate.of(y,m,d);
        System.out.println(date.getDayOfWeek());

        }
    }

