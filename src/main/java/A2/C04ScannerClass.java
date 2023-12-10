package A2;

import java.util.Scanner;

public class C04ScannerClass {
    public static void main(String[] args) {

        //Example4: ask user to enter 5 digit integer like 45689
        //tyoe code to print the sum of the first the alst two numbers//45+89

        Scanner input=new Scanner(System.in);
        System.out.println("enter an integer 5 digits...");
        int num=input.nextInt();
        int firstTwo=num/1000;
        int lastTwo=num%100;
        System.out.println(firstTwo+lastTwo);

        // % is modulus operrator it returns the remainder in a division operation
        //if you need last digit in a integer ,use %10
    }
}
