package A3;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {

        //Example

        Scanner input=new Scanner(System.in);
        System.out.println("Enter day number to see day name...");
        byte dayNum= input.nextByte();

     /*   if (dayNum==1){
            System.out.println("Sunday");
        } else if (dayNum==2) {
            System.out.println("Monday");
        }else if (dayNum==3) {
            System.out.println("Tuesday");
        }else if (dayNum==4) {
            System.out.println("Wednesday");
        }else if (dayNum==5) {
            System.out.println("Thursday");
        }else if (dayNum==6) {
            System.out.println("Friday");
        }else if (dayNum==7) {
            System.out.println("Saturday");
        }else {
            System.out.println("Invalid day number");
        } */

        //2.way

        switch (dayNum){
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default: //default is the last part in switch statement, that is why using break ...
                System.out.println("Invalid day number");

                //Else and default same mission
        }

        //You can use switch char,byte,short,int,character,string
        //float,double,long,boolean cannot be used in switch statement
    }
}
