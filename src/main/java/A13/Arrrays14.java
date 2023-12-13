package A13;

import java.util.Arrays;

public class Arrrays14 {
    public static void main(String[] args) {

        //When you create an Array you have to declare the number of elemenets(lengh) in the array

        //How to create an Array?

        String []stdNames=new String[5];

        //How to print an Array to the console
        System.out.println(stdNames); //Reference of the Array

        stdNames[0]="Tom";
        stdNames[3]="Mary";
        stdNames[1]="Mark";
        stdNames[4]="Jım";
        stdNames[2]="Alice";


        System.out.println(Arrays.toString(stdNames)); //Array elements

        //How to get a specific element from an array by using index

        String fourth=stdNames[3];

        System.out.println(fourth);

        //Example: Create an integer array, then find the multiplication of all elements

        int []ages=new int[4];
        ages[0]=12;
        ages[1]=24;
        ages[2]=6;
        ages[3]=9;

        //how to find multiplication of elements

        int result=1;

        for (int i=0;i<ages.length;i++){
            result=result*ages[i];

        }
        System.out.println(result);

        //2.way----- for-each loop(enhanced loop)
        int m=1;
        for (int w:ages){
            m=m*w;

        }
        System.out.println(m);






    }
}
