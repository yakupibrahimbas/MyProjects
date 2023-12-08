package A3;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {

        //Example: Type code to decide a day name is week day name or weekend day name
        //Monday==> week day   saturday=> weekend day


        Scanner input=new Scanner(System.in);
        System.out.println("Enter a day name...");
        String dayName=input.next();

        if (dayName.equalsIgnoreCase("Saturday")||dayName.equalsIgnoreCase("Sunday")) {
            System.out.println("Weekend Day");

        } else if (dayName.equalsIgnoreCase("Monday")||dayName.equalsIgnoreCase("Tuesday")||dayName.equalsIgnoreCase("Wednesday")||dayName.equalsIgnoreCase("Thursday")||dayName.equalsIgnoreCase("Friday")) {
            System.out.println("Week Day");

        }else {
            System.out.println("Invalid day name");
        }


    }
}
