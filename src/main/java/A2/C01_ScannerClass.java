package A2;

import java.util.Scanner;

public class C01_ScannerClass {
    public static void main(String[] args) {

        //example1: ask user to enter 2 numbers , then print the sum and the multiplication of the numbers on the console

        Scanner input=new Scanner(System.in);
        System.out.println("Enter first number..");
        double num1= input.nextDouble();
        System.out.println("Enter second number..");
        double num2=input.nextDouble();
        System.out.println(num2+"+"+num1+"="+num1+num2);
        System.out.println(num2+"*"+num1+"="+num1*num2);

        //


    }
}
