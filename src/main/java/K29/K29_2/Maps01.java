package K29.K29_2;

import java.util.*;

public class Maps01 {
    public static void main(String[] args) {


        //maplerde sozluklerdeki gibi kelime ve manasi seklinde bir kullanim vardir
        //key kismi tekrarsiz valu kismi tekrarli olabilir
        //Entryler tekrarsiz oldugu icin entry set denilir.
        //key ve valueler ayri ayri data typlerinde olabilirler


        HashMap<String ,Integer>countryPopulation=new HashMap();
        countryPopulation.put("Germany",830000);
        countryPopulation.put("USA",1830000);
        countryPopulation.put("Turkey",2000000);
        System.out.println(countryPopulation);

        //HAshmap ler collection degidlir farkli bir yapidir.

       Integer turkiyePopulation= countryPopulation.get("Turkey");
        System.out.println(turkiyePopulation);

        Set<String>keys=countryPopulation.keySet();
        System.out.println(keys);

        Collection<Integer> values=countryPopulation.values();
        System.out.println(values);
        System.out.println("-----------");

        int sum=0;
        for (Integer w:values) {
            sum=sum+w;
        }
        System.out.println(sum/values.size());

        System.out.println("************");

       Set<Map.Entry<String,Integer>>entries= countryPopulation.entrySet();
        System.out.println(entries);

        int toplam=0;
        for (Map.Entry<String,Integer> w : entries ){
         toplam=   w.getKey().length()+w.getValue();
        }

    }
}
