package A26;

import java.util.ArrayList;
import java.util.List;

public class Iterator {
    public static void main(String[] args) {
        /*
        Iteratorlar looplarin yaptigi ayni isi yapar
        Iteratorlarda sonsuz loop olusma ihtimali yoktur
        Iteratorler ile looplar arasinda performans farki yoktur
        Iki tip iterator vardir.. a)Iterator: Bu sadece eleman silmede kullanilir, eleman eklemek veya elmnai degistirmek mumkun degildir
        Listiterator iki yonlu calisabilir.


         */

        List<String >myList=new ArrayList<>();
        myList.add("Tom");
        myList.add("Lara");
        myList.add("Clara");
        myList.add("Fatma");
        myList.add("Mustafa");
        System.out.println(myList);

      /* Iterator<String >myItr= myList.iterator();
       while (myItr){

       }
       */


    }
}
