package A9;

import java.util.Scanner;

public class MinMaxBul {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Kac adet sayi gireceksiniz");
        int n=input.nextInt();
        int min=0;
        int max=0;


        for (int i=1;i<=n;i++){
            System.out.print(i+".sayiyi giriniz:");
            int number=input.nextInt();
            if (number<min||min==0){
                min=number;
            }
            if (number>max){
                max=number;
            }
        }
        System.out.println("girilen sayilar arasinda en kucuk sayi"+min);
        System.out.println("girilen sayilar arasinda en buyuk sayi"+max);
    }
}
