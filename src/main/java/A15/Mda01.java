package A15;

import java.util.Arrays;

public class Mda01 {
    public static void main(String[] args) {

        //How to create multidimensional array

        int[][] a=new int[3][2];// first bracket outer second insinde

        //how to print multidimensional arrays
        System.out.println(Arrays.deepToString(a));

        //How to add elements
        a[0][1]=3;
        a[0][0]=2;
        a[1][0]=5;
        a[1][1]=2;
        System.out.println(Arrays.deepToString(a));

        //Example: Type code to find the total number of elemeents in a multidimensiomal array

        String [][]b={{"X","U"},{"a","d","m"},{"T"}};

        int sum=0;

        for (String []w:b){

        sum=sum+w.length;
        }
        System.out.println(sum);

        //Example:Print the elements which has a in it from a multidimensional array

        String [][]c={{"Java","is"},{"easy"},{"to","learn"}};


        for (String []w:c){
            for (String u:w){
                if (u.contains("a")){
                    System.out.println(u);
                }

            }
        }

        //Example:Type code to dind the maximum and minimum elements in  a 2 dimensional integer array


        int[][]n={{5,2},{14,9},{7}};

        int maximum=n[0][0];        int minimum=n[0][0];

        for (int []w:n){
            for (int u:w){
                maximum=Math.max(u,maximum);
                minimum=Math.min(u,minimum);
            }
        }
        System.out.println(maximum);
        System.out.println(minimum);
        System.out.println(maximum+minimum);



    }
}
