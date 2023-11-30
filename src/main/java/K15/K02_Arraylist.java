package K15;

import java.util.ArrayList;
import java.util.Collections;

public class K02_Arraylist {
    public static void main(String[] args) {
        ArrayList isim=new ArrayList<>();
        isim.add("esra");
        isim.add("hakan");
        isim.add("merve");
        isim.add("kezban");
        isim.add("sevim");

        System.out.println(isim);
        Collections.sort(isim);
        System.out.println(isim);
        Collections.reverse(isim);
        System.out.println(isim);
     /*   System.out.println(isim.get(0));
        System.out.println(isim.get(1));
        for (int i = 0; i < isim.size(); i++) {
            System.out.println(isim.get(i)+" ");
        }
        System.out.println("----------------------");

        for (Object a:isim) {
            System.out.println(a+" ");


        }*/
        isim.remove(2);


    }
}
