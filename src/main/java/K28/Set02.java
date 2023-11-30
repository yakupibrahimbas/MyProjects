package K28;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.concurrent.TransferQueue;

public class Set02 {
    public static void main(String[] args) {

        //ogrenci email adreslerini natural orderda siralanmis olarak depolayiniz.

        //Mailler unique(benzersiz) o yüzden set kullanacagiz, natural order dedigi icin de TreeSet kullanacagiz.

        //1.yol
        long t1=System.nanoTime();


        TreeSet<String >emails=new TreeSet<>();
        emails.add("a@hotmail.com");
        emails.add("b@hotmail.com");
        emails.add("c@hotmail.com");
        emails.add("d@hotmail.com");
        emails.add("e@hotmail.com");
        emails.add("f@hotmail.com");
        emails.add("g@hotmail.com");
        emails.add("h@hotmail.com");
        emails.add("m@hotmail.com");
        emails.add("n@hotmail.com");
        emails.add("y@hotmail.com");
        emails.add("z@hotmail.com");
        System.out.println(emails);

        long t2=System.nanoTime();

        HashSet<String>emailsHs=new HashSet<>();
        emailsHs.add("a@hotmail.com");
        emailsHs.add("b@hotmail.com");
        emailsHs.add("c@hotmail.com");
        emailsHs.add("d@hotmail.com");
        emailsHs.add("e@hotmail.com");
        emailsHs.add("f@hotmail.com");
        emailsHs.add("g@hotmail.com");
        emailsHs.add("h@hotmail.com");
        emailsHs.add("m@hotmail.com");
        emailsHs.add("n@hotmail.com");
        emailsHs.add("y@hotmail.com");
        emailsHs.add("z@hotmail.com");

        System.out.println(emailsHs);

        TreeSet<String>emailHsTs=new TreeSet<>(emailsHs);
        System.out.println(emailHsTs);


        long t3=System.nanoTime();

        System.out.println(t2-t1);
        System.out.println(t3-t2);


    }
}
