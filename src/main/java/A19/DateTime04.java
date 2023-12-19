package A19;

import java.time.LocalDate;

public class DateTime04 {
    public static void main(String[] args) {

        LocalDate myDate=LocalDate.now();
        System.out.println(myDate);

        System.out.println(myDate.getMonthValue());
        System.out.println(myDate.getMonth());
        System.out.println(myDate.getDayOfWeek());
        System.out.println(myDate.plusYears(1).plusMonths(1).plusDays(1));
        System.out.println(myDate.minusYears(1).minusMonths(1).minusDays(1));

        LocalDate date1=LocalDate.of(1995,2,20);
        LocalDate date2=LocalDate.of(2005,4,30);
        System.out.println("date1:"+date1+"    "+ "date2:"+date2);
        Boolean sonraMi=date1.isAfter(date2);
        System.out.println(sonraMi);
        Boolean oncemi=date1.isBefore(date2);
        System.out.println(oncemi);


    }
}
