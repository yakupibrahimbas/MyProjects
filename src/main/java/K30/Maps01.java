package K30;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

public class Maps01 {
    public static void main(String[] args) {

        //verilen cumledeki kelimelerin gorunum sayisini veren kodu yaziniz.
        //"I like you, like like!" ==> I=1 like=3, you=1

        String s="I like you ,like like!";
        s=s.replaceAll("\\p{Punct}","");
        System.out.println(s);

        String  words []=s.split(" ");
        System.out.println(Arrays.toString(words));

        HashMap<String,Integer>occ=new HashMap<>();

        //words arrayindeki kelimeler birer birer mapde varmi kontrol edilecek
        //words arrayindeki kelimeler mapde yoksa mape valuesi 1 olarak yerlestirilecek

        for (String w:words) {
            Integer numOfOccurance=occ.get(w);
            if (numOfOccurance==null){
                occ.put(w,1);
            }else {
                occ.replace(w,numOfOccurance+1);
            }


        }

        System.out.println(occ);


        //HashMap threadSafe ve synchronized degildir. HashTable threadSafe ve synchronizedir.
        //HashMap hizlidir. Hashtable Hashmape gore yavastir

       // Note=HashMap ve HashTable ikiside entryleri rastgele siralar//HashTable-- threadSafe ve synchronized

        //TreeMap entryleri keylerine gore natural ordera gore siraya koyar. Bu yuzden cok yavastir.


        Hashtable<String ,Integer>ogrenciNotlari=new Hashtable<>();
        ogrenciNotlari.put("Ali",77);
        ogrenciNotlari.put("Veli",33);
        ogrenciNotlari.put("Mert",18);
        ogrenciNotlari.put("Alex",30);
        System.out.println(ogrenciNotlari);

        //Hashtablelarda null olmaz

    }
}
