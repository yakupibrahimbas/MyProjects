package O14;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {

        int number=10;
        int total=0;
        for (int i = 1; i <number ; i++) {
            if (number%i==0){
                total=total+i;
            }

        }

        if (total==number){
            System.out.println("Mukemmel sayidir");
        }else {
            System.out.println("Mukemmel sayi degildir");
        }
    }
}
