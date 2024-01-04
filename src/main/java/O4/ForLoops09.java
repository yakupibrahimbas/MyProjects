package O4;

import java.util.Scanner;

public class ForLoops09 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kac satir * sekli yapacaginizi giriniz");
        int sekil=scan.nextInt();
        for (int i = 1; i < sekil; i++) {
            for (int j = 1; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
