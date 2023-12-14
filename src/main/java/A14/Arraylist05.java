package A14;

import java.util.*;

public class Arraylist05 {
    public static void main(String[] args) {

        //bir tane integer liste olusturunuz
        //Bu listte birbirine en yakin iki tamsayiyi yaziniz
        List<Integer> nums=new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(36);
        nums.add(51);

    Collections.sort(nums);
   System.out.println(nums);
   int minFark=nums.get(1)-nums.get(0);
   for (int i=1;i<nums.size();i++){
       if (nums.get(i)-nums.get(i-1)==minFark){
           System.out.println(nums.get(i)+" ve "+ nums.get(i-1));
       }
   }

    }
}
