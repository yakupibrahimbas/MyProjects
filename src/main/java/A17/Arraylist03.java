package A17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylist03 {
    public static void main(String[] args) {

        List<Integer>myList= Arrays.asList(1,3,4,9,7);
        System.out.println(myList);
        myList.set(0,5);
        System.out.println(myList);
        System.out.println(myList.size());



    }
}
