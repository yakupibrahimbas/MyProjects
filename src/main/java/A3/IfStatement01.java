package A3;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {

        //If it rains I will cancel the picnic.
        int a=5;
        int b=2;


        if (a%b==1){
            System.out.println("Activated...");
        }


        //Example: Type code to print "Event for even integers and "Odd" for integers
        //Get the numbers from the user

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number to check if it is even or odd...");
        int x=input.nextInt();

        if (x%2==0){
            System.out.println("Even");
        }

        if (x%2!=0){
            System.out.println("Odd");
        }
        //2.way
        if(x%2==0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }

        //one task faster than multiple check
        //mandatory means zorunlu

        //type code to check if a number is positive , negative or neutral
        System.out.println("Enter a number to checl if it is positive , negative or neutral");
        double y=input.nextDouble();

        //1.way
        if (y>0){
            System.out.println("Positive");

        }

        if (y==0){
            System.out.println("Neutral");
        }
        if (y<0){
            System.out.println("negative");
        }

        //2 .way
        if (y>0){
            System.out.println("Positive");
        } else if (y==0) {
            System.out.println("Neutral");
        }else {
            System.out.println("negative");
        }


    }
}
