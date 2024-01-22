package O22;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Arraylist<S> {
    public static void main(String[] args) {
        ArrayList<String >sehirler=new ArrayList<String >();
        sehirler.add("Ankara");
        sehirler.add("Istanbul");
        sehirler.add("Izmir");
        sehirler.add("Aydin");
        sehirler.add("Malatya");

        sehirler.remove("Istanbul");
        Collections.sort(sehirler);
        for (String sehir:sehirler){
            System.out.println(sehir);
        }
    }
}
