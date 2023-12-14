package A14;

import java.util.Arrays;

public class Arrays17 {
    public static void main(String[] args) {


        int []nums={8,12,34,10,78,19};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int min=nums[0];
        int max=nums[nums.length-1];
        System.out.println(max-min);



    }
}
