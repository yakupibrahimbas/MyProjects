package A19;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {
    public static void main(String[] args) {
        Date now = new Date();

        // Tarih ve saat formatını belirle
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        // Tarih ve saat bilgisini istediğimiz formatta yazdır
        String formattedDate = dateFormat.format(now);
        System.out.println("Şu anki tarih ve saat: " + formattedDate);
    }
}
