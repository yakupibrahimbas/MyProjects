package K15;

import java.util.ArrayList;
import java.util.Arrays;

public class K03Arraylist {
    public static void main(String[] args) {

        ArrayList <String>arr=new ArrayList<>(Arrays.asList("Haziran","Ocak"));
        arr.add(0,"Mart");
        arr.add("Aralik");
        arr.set(3,"Kasim");
        System.out.println(arr.get(3));
        arr.remove("Haziran");
        arr.remove("2");


        System.out.println("arr="+arr);


    }
}
