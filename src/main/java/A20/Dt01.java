package A20;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Dt01 {
    public static void main(String[] args) {

        LocalDate myDate= LocalDate.now(); //obtains the current data from the system clock in the default time-zone
        System.out.println(myDate);
        //How to go future and past
        System.out.println(myDate.plusMonths(3));
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedMyDate=dtf.format(myDate);
        System.out.println(formattedMyDate);

        DateTimeFormatter dt=DateTimeFormatter.ofPattern("MMM/dd/yyyy");
       String myDateFormatted= dt.format(myDate);
        System.out.println(myDateFormatted);

        //How to see date in another zone
       LocalDate dateInTurkey= LocalDate.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(dateInTurkey);



    }
}
