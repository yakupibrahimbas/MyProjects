package A9;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int n= input.nextInt();
        int total=0;

        for (int i=1;i<n;i++){
            if (n%i==0){
                total+=i;
            }
        }

        if (total==n){
            System.out.println(n+" sayisi mukemmel bir sayidir");
        }else {
            System.out.println(n+" sayisi mukemmel bir sayi degildir");
        }



    }
}
