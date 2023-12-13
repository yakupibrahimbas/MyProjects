package A13;

import java.util.Arrays;

public class Arrays10 {
    public static void main(String[] args) {

        int[]numbers={12,3,30,-2,4};
        System.out.println(Arrays.toString(numbers));
        for (int w:numbers){
            if (w<5){
                System.out.println(w+" ");
            }
        }
    }
}
