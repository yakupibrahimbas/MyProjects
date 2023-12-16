package A15;

import java.util.Arrays;

public class Mda02 {
    public static void main(String[] args) {

        //Type code to convert a mda to a one dimensional aray
        int[][]p={{5,2},{14,9},{7}}; //{5,2,14,9,7}
        // make the length same with the number of elemenets in 2 dimensional array

        int ln=0;

        for (int[]w:p){
            ln=ln+w.length;
        }
        int []r=new int[ln];
        int idx=0;
        for (int[]w:p){
            for (int u:w){
                r[idx]=u;
                idx++;
            }
        }
        System.out.println(Arrays.toString(r));


    }
}
