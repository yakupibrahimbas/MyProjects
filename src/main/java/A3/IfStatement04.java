package A3;

import java.util.Scanner;

public class IfStatement04 {
    public static void main(String[] args) {
        //Example:Note system
        Scanner input=new Scanner(System.in);
        System.out.println("Enter mark...");
        int mark= input.nextInt();
        if (mark<0){
            System.out.println("Negative marks are not valid");
        }
        if (mark<50){
            System.out.println("D");
        } else if (mark<60) {
            System.out.println("C");
        } else if (mark<80) {
            System.out.println("B");
        } else if (mark<101) {
            System.out.println("A");
        }else {
            System.out.println("Invalid note");
        }

    }
}
