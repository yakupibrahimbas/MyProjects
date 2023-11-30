package K19;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class AnaClass {
    public static void main(String[] args) {

        Date bugun=new Date();
        System.out.println("bugun = " + bugun);
        DateFormat f=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("f.format(bugun) = " + f.format(bugun));
        Date tarih=null;
        try {
            tarih=f.parse("10/10/2012 10:25:20");
        }catch (ParseException e){
            e.printStackTrace();
        }
        System.out.println("f.format(tarih) = " + f.format(tarih));
        Calendar c=new GregorianCalendar();
        c.set(2012,0,10);


    }

    
}
