package A20;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Dt02 {
    public static void main(String[] args) {

        LocalDateTime myDateTime=LocalDateTime.now();
        System.out.println(myDateTime);

        Scanner input=new Scanner(System.in);
        System.out.println("Enter year");
        int year=input.nextInt();
        int month=input.nextInt();
        int day=input.nextInt();

        System.out.println("Enter hours and minutes");
        

    }
}
