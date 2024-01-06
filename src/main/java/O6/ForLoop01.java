package O6;

import java.util.Scanner;

public class ForLoop01 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("satir sayisini giriniz");
        int s=scan.nextInt();
        for (int i=0;i<=s;i++){
            for (int k=1;k<=s-i;k++){
                System.out.print("* ");
            }
            for (int m=0;m<i;m++){
                System.out.println(" ");

            }
            System.out.println();
        }

    }
}
