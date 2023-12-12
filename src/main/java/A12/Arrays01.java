package A12;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

            String []stdNames1=new String[3];
         //   String stdNames[]=new String[4];
        System.out.println(stdNames1);
        System.out.println(Arrays.toString(stdNames1));

        int [] notlar=new int[5];
        System.out.println(Arrays.toString(notlar));

        Integer[] integers=new Integer[10];
        System.out.println(Arrays.toString(integers));
        String []isimler=new String[3];
        System.out.println(Arrays.toString(isimler));
        isimler[0]="Ali Can";
        isimler[1]="Veli Han";
        isimler[2]="Berke Can";
        //isimler[3]="Hasan Yilmaz";
        System.out.println(Arrays.toString(isimler));

        System.out.println(isimler[1]);
        String []cities=new String[5];
        cities[0]="Bayburt";
        cities[1]="Trabzon";
        cities[2]="Rize";
        cities[3]="Sivas";
        cities[4]="Manisa";

    }
}
