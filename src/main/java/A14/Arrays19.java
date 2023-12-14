package A14;

import java.util.Arrays;

public class Arrays19 {
    public static void main(String[] args) {
        int []m={0,2,0,12,0};
        int []n=new int[m.length];
        int idx=0;
        for (int w:m){
            if (w!=0){
                n[idx]=w;
                idx++;
            }
        }
        System.out.println(Arrays.toString(n));

    }
}
