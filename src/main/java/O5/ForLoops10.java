package O5;

import java.util.Scanner;

public class ForLoops10 {
    public static void main(String[] args) {
        //*******
        // *****
        //  ***
        //   *

        Scanner scanner = new Scanner(System.in);

        System.out.print("Satır sayısını giriniz: ");
        int satirSayisi = scanner.nextInt();

        for (int i = satirSayisi; i >= 1; i--) {
            for (int j = 1; j <= satirSayisi - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        scanner.close();

    }
}
