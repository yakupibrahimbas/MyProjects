package A8;

import java.util.Scanner;

public class ArmstrongSayiBul {
    public static void main(String[] args) {

        int number=1234335;
        int digitCount=0;
        int tempNumber=number;
        do {
            tempNumber=tempNumber/10;

            System.out.println(tempNumber);

            digitCount++;

        }while (tempNumber!=0);

    }
}
