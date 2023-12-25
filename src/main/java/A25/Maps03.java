package A25;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class Maps03 {
    public static void main(String[] args) {

        //Example:verilen cumledeki kelimelerin gorunum sayisini veren kodu yaziniz

        String s="I like you, like like!";
        s.replaceAll("\\p{Punct}","");
        System.out.println(s);

        String words[]=s.split(" ");
        System.out.println(Arrays.toString(words));

        HashMap<String,Integer>occ=new HashMap<>();
        for (String w:words){
          Integer numOfOccurance=  occ.get(w);
          if (numOfOccurance==null){
              occ.put(w,1);
          }else {
              occ.replace(w,numOfOccurance+1);
          }

        }
        System.out.println(occ);

        //Hashmap ile HashTable arasindaki fark nedir?
        //Hashmap threadSafe ve synchronized degildir, Hashtable threadSafe  ve sync dir
        //hashmap hizlidir  Hashtable , hashMape gore yavastir

        Hashtable<String ,Integer>ogrenciNotlari=new Hashtable<>();
        ogrenciNotlari.put("Ali",22);
        ogrenciNotlari.put("Veli",33);
        ogrenciNotlari.put("Mert",44);
        ogrenciNotlari.put("Yildiz",55);
        ogrenciNotlari.put("Riza",88);
        ogrenciNotlari.put("Riza",88);
        System.out.println(ogrenciNotlari); //HashTablelerde null olmaz
        //ne zaman HashTable kullanmaliyiz--threadSafe ve synchronized kullanmamiz gerekirse

        //TreeMap entryleri keylerine gore natural ordera gore siraya koyar. bu yuzden cok yavastir
        //TreeMap threadSafe ve synchronized degildir.

        TreeMap<String ,Integer>countryPopulation=new TreeMap<>();
    }
}
