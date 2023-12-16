package A15;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        //note:split() method in string class return array
        String s="Learn earn money";
      String []t=  s.split("a");
        System.out.println(Arrays.toString(t));

        //note2= equals() method is used to check if two arrrays are same elements and the order are the same or not
        int[]a={2,5,1};
        int[]b={2,5,1};
        boolean u= Arrays.equals(a, b);
        System.out.println(u);

    }
}
