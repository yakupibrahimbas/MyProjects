package K19;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime03 {
    public static void main(String[] args) {
       LocalDate dateInTokyo= LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);

        LocalDate dateInAmsterdam=LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(dateInAmsterdam);

        LocalTime timeInTokyo=LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);

        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);

        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("dd*MMMM*yyyy-hh:mm a");
        String formattedLdt=dtf3.format(ldt);
        System.out.println(formattedLdt);

    }
}
