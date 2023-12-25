package A25;

import java.util.HashSet;
import java.util.TreeSet;

public class Set02 {
    public static void main(String[] args) {

        //ogrenci emani adreslerini natural orderda siralamis oalrak depolayiniz

        HashSet<String >emailsHs=new HashSet<>();
        emailsHs.add("k@gmail.com");
        emailsHs.add("a@gmail.com");
        emailsHs.add("b@gmail.com");
        emailsHs.add("c@gmail.com");
        emailsHs.add("d@gmail.com");
        emailsHs.add("f@gmail.com");
        emailsHs.add("h@gmail.com");
        emailsHs.add("s@gmail.com");
        emailsHs.add("y@gmail.com");

        TreeSet<String >emalHsts=new TreeSet<>(emailsHs);
        System.out.println(emailsHs);





    }
}
