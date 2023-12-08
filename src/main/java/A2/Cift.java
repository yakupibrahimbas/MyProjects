package A2;

import java.util.Scanner;

public class Cift {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi= input.nextInt();
        for (int i = 0; i < sayi; i++) {
            if (i%4==0&&i%5==0)
                System.out.println(i);
        }
    }
}
