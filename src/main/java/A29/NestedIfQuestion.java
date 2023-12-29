package A29;

import java.util.Scanner;

public class NestedIfQuestion {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir password giriniz");
        int pwd=scan.nextInt();

        if (pwd%5==0){
            if (pwd%10==0){
                System.out.println("5'e bolunen cift sayi");
            }else {
                System.out.println("5'e bolunen tek sayi");
            }
        }else {
            System.out.println("Tekrar deneyin!");
        }
        scan.close();
    }
}
