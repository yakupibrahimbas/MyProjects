package O7;

import java.util.Scanner;

public class DoWhileLoop02 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sayi=0;
        do {
            System.out.println("lutfen sayi giriniz");
             sayi=scan.nextInt();
        }while (sayi>=10);
        System.out.println("Kazandiniz");




    }
}
