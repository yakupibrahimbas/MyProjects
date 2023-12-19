package A19;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime03 {
    public static void main(String[] args) {
        //Anlik zamani nasil aliriz?

        LocalTime myCurrentTime= LocalTime.now();
        System.out.println(myCurrentTime);
        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("HH:mm");
        String formatTime= dtf1.format(myCurrentTime);
        System.out.println("FormanttedTime="+formatTime);


        //Date formati
        LocalDate myCurrentDate=LocalDate.now();
       DateTimeFormatter dtf2= DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
       String formattedMyCurrentDate= dtf2.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate);

        LocalDate dateInTokyo=LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);

        LocalTime timeTokyo=LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeTokyo);

    }
}
