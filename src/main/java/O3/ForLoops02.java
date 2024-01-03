package O3;

import java.util.Scanner;

public class ForLoops02 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen sayi araligi icin iki sayi giriniz");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
        for (int i = sayi1; i <sayi2 ; i++) {
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
