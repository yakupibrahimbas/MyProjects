package A13;

import java.util.Arrays;

public class Arrays13 {
    public static void main(String[] args) {

        int []arr={0,2,3,0,12,0};
        int[]yeniArr=new int[arr.length];
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(yeniArr));

        int ilkIndex=0;
        for (int w:arr){
            if (w!=0){
                yeniArr[ilkIndex]=w;
                ilkIndex++;
            }
        }
        System.out.println(Arrays.toString(yeniArr));
    }
}
