package O4;

import java.util.Scanner;

public class ForLoops10 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz");
        int satir=scan.nextInt();
        for (int i = 1; i < satir; i++) {
            //spaceler icin loop
            for (int k = satir-1; k >=0 ; k--) {
                System.out.println(" ");
            }
            for (int m = 1; m <=i ; m++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
