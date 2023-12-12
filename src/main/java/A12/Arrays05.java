package A12;

import java.util.Arrays;

public class Arrays05 {
    public static void main(String[] args) {

        //Ornek 3: Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.

        String s = "Java is easy. Learn Java earn money";
        String []words=s.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println(words.length);

    }
}
