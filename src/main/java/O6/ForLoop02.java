package O6;

import java.util.Scanner;

public class ForLoop02 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("satir gir");
        int s=scan.nextInt();
        for (int i = 0; i < s; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print(" ");
            }
            for (int m = 1; m <2*(s-i) ; m++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
