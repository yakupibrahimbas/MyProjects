package A13;

import java.util.Arrays;

public class Arrays09 {
    public static void main(String[] args) {

        int[]ages=new int[6];
        ages[0]=10;
        ages[1]=20;
        ages[2]=8;
        ages[3]=40;
        ages[4]=75;
        ages[5]=60;

        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));
        System.out.println(ages[0]+ages[ages.length-1]);


        //Math.min ve Math.max kullanilacak

        int minimum=ages[0];
        int maksimum=ages[0];
        for (int w:ages) {
           minimum= Math.min(minimum,w);
           maksimum=Math.max(maksimum,w);
        }
        System.out.println(minimum);
        System.out.println(maksimum);
        System.out.println(minimum+maksimum);

    }
}
