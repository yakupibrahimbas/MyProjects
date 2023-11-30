package K26.K26_4;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Set02 {
    public static void main(String[] args) {

        //Ogrenci email adreslerini natural orderda siralanmis olarak depolayiniz.

        TreeSet<String >emails=new TreeSet<>();
        emails.add("k@gmail.com");
        emails.add("l@gmail.com");
        emails.add("m@gmail.com");
        emails.add("n@gmail.com");
        emails.add("o@gmail.com");
        emails.add("y@gmail.com");
        emails.add("a@gmail.com");
        System.out.println(emails);

        //TreeSetler çok yavas ama hizlandirma teknikleride vardir.


        //2.yol
        //En hizli olan HashSettem yardim alcagiz.

        HashSet<String>emailsHs=new HashSet<>();
        emailsHs.add("k@gmail.com");
        emailsHs.add("l@gmail.com");
        emailsHs.add("m@gmail.com");
        emailsHs.add("n@gmail.com");
        emailsHs.add("o@gmail.com");
        emailsHs.add("y@gmail.com");
        emailsHs.add("a@gmail.com");

       TreeSet<String>a=new TreeSet<>(emailsHs);
        System.out.println(emailsHs);

    }
}
