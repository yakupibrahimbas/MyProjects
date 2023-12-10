package A9;

import java.util.Scanner;

public class AsalSayi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int number= input.nextInt();
        boolean isPrime=true;
        for (int i=2;i<number;i++){
            if (number%i==0){
                isPrime=false;
                break;
            }
        }
        if (isPrime){
            System.out.println(number+" sayisi ASALDIR");
        }else {
            System.out.println(number+ " sayisi ASAL DEGILDIR ");
        }

    }
}
