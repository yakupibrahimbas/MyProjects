package K29;

import java.text.CollationElementIterator;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps01 {
    public static void main(String[] args) {

        //mapler sozluk gibidir. aciklamalidir
        //sol tarafi yani keyler tekrarsizdir.avalue tarafi tekrarli olabilir.
        //key tarafi icin set kullanilir.Value tarafi icinse List data sayisindan eminsekte Array kullanabiliriz
        //map in elemanlarina komple entry set giris elemani denir

        //Map nasil olusturulur?
        //1)HashMap keyvalue ciftlerini rastgele bir sirayla depolayan bir map turudur.En hizlisidir.
        //maplerde add calismaz cunku add eleman ekler, ben ise entry set ekleyecegim
        //onun icin put put kullanilir.

        HashMap<String,Integer > myMap=new HashMap<>();
        myMap.put("Ali Can",59);
        myMap.put("Mehmet Can",28);
        myMap.put("Berke Can",13);
        myMap.put("Fatma Can",15);
        myMap.put("X Can",46);
        myMap.put("X Can",15);
        System.out.println(myMap);

        Set<String >keyTarafi=myMap.keySet();
        System.out.println(keyTarafi);


        System.out.println("--------");
        Collection<Integer>valueTarafi=myMap.values();
        System.out.println(valueTarafi);

        System.out.println("----------");
        Integer yas=myMap.get("Ali Can");
        System.out.println(yas);

    System.out.println("-------");

        int toplam=0;
        Collection <Integer>yaslar=myMap.values();
        System.out.println(yaslar);
        for (Integer w:yaslar){
            toplam=toplam+w;
        }
        System.out.println(toplam/yaslar.size());

        System.out.println("--------");

        //entryset() methodu hashMapin tüm degerlerini iceren bir set dondurur.
        System.out.println(myMap);
        Set<Map.Entry<String,Integer>> myEntrySet=myMap.entrySet();
        System.out.println(myEntrySet);
        for (Map.Entry<String,Integer>w:myEntrySet){
            System.out.println(w);
        }
        System.out.println("-----");
        HashMap<String,Integer>kisiler=new HashMap<>();
        kisiler.put("Ali Can",2);
        kisiler.put("Berke Can",5);
        kisiler.put("Nazli Can",2);

        int sum=0;
        Set<Map.Entry<String,Integer>>mySet=kisiler.entrySet();


    }

}
