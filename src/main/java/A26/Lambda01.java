package A26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {
        /*
        Lambda functional method programmingdir, digeri structured programmingdir

         */

        List<Integer>nums=new ArrayList<>(Arrays.asList(12,9,131,14,9,10,4,12,15));


    }
    public static void  printElements1(List<Integer>nums){
        for (Integer w:nums){
            System.out.println(w+" ");
        }
    }
    public static void printElements2(List<Integer>nums){
        nums.stream().forEach(t-> System.out.println(t+" "));
    }
}
