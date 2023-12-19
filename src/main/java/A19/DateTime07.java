package A19;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime07 {
    public static void main(String[] args) {

        //Anlik zamani nasil aliriz?

        LocalTime myCurrentTime=LocalTime.now();
        System.out.println(myCurrentTime);

        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("HH:mm a");
        String formattedTime=dtf1.format(myCurrentTime);
        System.out.println(formattedTime);
        System.out.println("------");

        LocalDate dateInTokyo=LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);
        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("MMMM-dd-yyyy");
        System.out.println(dtf2);





    }
}
