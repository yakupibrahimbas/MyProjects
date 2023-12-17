package A17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Arraylist02 {
    public static void main(String[] args) {

        List<Integer>nums=new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(10);
        nums.add(19);
        System.out.println(nums);

       Collections.sort(nums);
        System.out.println(nums);
       int minFark= nums.get(1)- nums.get(0);
        System.out.println(minFark);



     //   System.out.println(minFark);

        for (int i=1;i<nums.size();i++){
            minFark=Math.min(minFark,nums.get(i-1));
        }
        System.out.println(minFark);

        for (int i=1;i<nums.size();i++){
            if (nums.get(i)-nums.get(i-1)==minFark){
                System.out.println(nums.get(i)+"ve"+nums.get(i-1));
            }
        }


    }
}
