package O3;

import java.util.Scanner;

public class ForLoops03 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi=scan.nextInt();
        for (int i = sayi; i>0 ; i--) {
            if (i%2==1){
                System.out.print(i+" ");
            }
        }
    }
}
