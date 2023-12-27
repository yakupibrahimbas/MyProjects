package A27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>(Arrays.asList(12,9,131,14,9,10,4,12,15));


    }

    public static void printEvenElements1(List<Integer>nums){
        for (Integer w:nums){
            if (w%2==0){
                System.out.println(w+" ");
            }
        }
    }

    public static void printEvenElements2(List<Integer>nums){
        nums.stream().filter(t->t%2==0).forEach(t-> System.out.println(t+" "));
    }

    public static void printSquareOfOddelements(List<Integer>nums){
        nums.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.println(t+" "));
    }

    public static void printSumOfSquare (List<Integer>nums){
        nums.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u);
    }

}
