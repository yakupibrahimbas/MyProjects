package A13;

import java.util.Arrays;

public class Arrays11 {
    public static void main(String[] args) {

        String names[]={"A","T","K","E","B"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        int result=Arrays.binarySearch(names,"K");
        System.out.println(result);

        int[] arr={2,1,3,8};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,2));
        System.out.println(Arrays.binarySearch(arr,7));
        System.out.println(Arrays.binarySearch(arr,3));
        System.out.println(Arrays.binarySearch(arr,9));
    }
}
