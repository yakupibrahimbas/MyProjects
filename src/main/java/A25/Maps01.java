package A25;

import java.util.*;

public class Maps01 {
    public static <K, V> void main(String[] args) {

        /*
        Maplerde sozluklerdeki gibi kelime ve manasi seklinde bir kullanim vardir
        Key kismi tekrarsiz value kismi tekrarli olabilir
        Maplerdeki her bir eleman entry denir, tmamina ise EntrySet denir
        Entryler tekrarsiz olduıgu icin entryset denilir
        Key ve valuelar ayri ayri data typlarinda olabilirler
        Mapler collection degildir. Farkli yapidir
        Hashmapler entryleri rastgele siralar, bu yuzden en hizli maptir

         */

        //Map nasil olusturulur?
        HashMap<String ,Integer>countryPopulation=new HashMap<>();


        //Mape entry nasil eklenir

        countryPopulation.put("Germany",83000000);
        countryPopulation.put("Italy",400000000);
        countryPopulation.put("Norwagy",12000000);
        countryPopulation.put("Turkey",500000000);
        countryPopulation.put("USA",900000000);
        countryPopulation.put("England",1000000);
        System.out.println(countryPopulation);

        Integer turkiyePopulation=countryPopulation.get("Turkey");
        System.out.println(turkiyePopulation);
        Set<String >keys=countryPopulation.keySet();
        System.out.println(keys);
        Collection<Integer>values=countryPopulation.values();
        System.out.println(values);

        //ulkelerin ortalamasi nedir

        int sum=0;
        for (Integer w:values){
            sum=sum+w;
        }
        System.out.println(sum/values.size());

        //entryset()methodu mapdeki entryleri kalip halinde alip set icine koyarak verir
        Set<Map.Entry<String,Integer>>entries=countryPopulation.entrySet();
        System.out.println(entries);
        //Example
        int toplam=0;
        for (Map.Entry<String,Integer> w:entries) {
          toplam=toplam+  w.getKey().length()+w.getValue();
        }

        System.out.println(toplam);




    }
}
