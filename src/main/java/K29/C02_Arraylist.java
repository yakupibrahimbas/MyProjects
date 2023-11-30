package K29;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class C02_Arraylist {
    public static void main(String[] args) {

        ArrayList<String>sehirler=new ArrayList<>();
        sehirler.add("Isparta");
        sehirler.add("Trabzon");
        sehirler.add("Erzincan");
        sehirler.add("Angara");
        sehirler.add("Eskisehir");
        Collections.sort(sehirler);
        System.out.println(sehirler);
    }
}
