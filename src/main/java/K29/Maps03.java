package K29;

import java.util.Arrays;
import java.util.HashMap;

public class Maps03 {
    public static void main(String[] args) {

        String s="Ali nasilsin Ali.";
       s= s.replaceAll("\\p{Punct}","").toLowerCase();
        System.out.println(s);
        String [] kelimeler=s.split("");
        System.out.println(Arrays.toString(kelimeler));

        HashMap<String,Integer>myMap=new HashMap<>();
        System.out.println(myMap);
        for (String w:kelimeler){
           Integer gorunum= myMap.get(w); //w==> key bana Integer value'yu verecek
            //ilk dongude Mapte ali olmadigindan null getirecek

            if (gorunum==null){
                myMap.put(w,1);
            }else {
                myMap.put(w,gorunum+1);
            }

        }
    }
}
