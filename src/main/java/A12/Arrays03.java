package A12;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

      /*  int[] sayi=new int[5];
        sayi[0]=5;
        sayi[1]=2;
        sayi[2]=3;
        sayi[3]=8;
        sayi[4]=0;

        for (int w:sayi) {
            if (w<5){
                System.out.println(w);
            }
        }
*/

    int[] numbers = {12, 3, -3, 5, 23};//[12, 3, -3, 5, 23]
        System.out.println(Arrays.toString(numbers));

        for (int w : numbers) {
            if (w < 5) {
                System.out.print(w + " ");//3 -3
            }
        }

    }
}
