package K19;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {

        LocalTime myCurrentTime=LocalTime.now();
        System.out.println(myCurrentTime);

        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("hh:mm a");
        String formattedTime=dtf1.format(myCurrentTime);
        System.out.println(formattedTime);
        LocalDate myCurrentDate=LocalDate.now();
        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("dd MMM yyyy");
        dtf2.format(myCurrentDate);

        String formattedDate=dtf2.format(myCurrentDate);
        System.out.println(formattedDate);




    }
}
