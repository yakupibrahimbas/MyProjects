package A3;

import java.util.Scanner;

public class SwitchStatement02 {
    public static void main(String[] args) {
        //Example: Ask user to enter month name then print the month names from the given month name to the last month name

        //October==> October,November,December

        Scanner input=new Scanner(System.in);
        System.out.println("Enter month name");
        String monthName=input.next();


        switch (monthName){
            case "January":
                System.out.println("january");
            case "February":
                System.out.println("February");
            case "March":
                System.out.println("March");
            case "April":
                System.out.println("April");
            case "May":
                System.out.println("May");
            case "June":
                System.out.println("June");
            case "July":
                System.out.println("July");
            case "August":
                System.out.println("August");
            case "September":
                System.out.println("September");
            case "October":
                System.out.println("October");
            case "November":
                System.out.println("November");
            case "December":
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month name");


        }




    }
}
