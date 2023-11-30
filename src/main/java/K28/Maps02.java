package K28;

import java.util.HashMap;

public class Maps02 {
    public static void main(String[] args) {

        HashMap<Integer,String > hmap=new HashMap<Integer,String>();

        hmap.put(36,"Kars");
        hmap.put(25,"Erzurum");
        hmap.put(06,"Ankara");
        hmap.put(15,"Burdur");
        for (Integer i:hmap.keySet()){
            System.out.println("Plaka(k):"+i+"-->"+"Sehir(v):"+hmap.get(i));
        }

    }
}
