package A3;

import java.util.Scanner;

public class IfStatement05 {
    public static void main(String[] args) {
        //Nested If Statement
        //Example

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a integer");
        int num= input.nextInt();
        if (num%2==0){
            if (num%3==0){
                System.out.println("Perfect Even Number");
            }else {
                System.out.println("Good Even Number");
            }
        }else {
            if (num%3==0){
                System.out.println("Perfect Odd Number");
            }else {
                System.out.println("Good Odd Number");
            }
        }
        //We do not prefer to use nested structeres in Java


    }
}
