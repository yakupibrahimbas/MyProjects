package O9;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int i=1;
        int num=0;

        do {
            System.out.println("Bir sayi giriniz");
            i=scan.nextInt();
            num+=i;

        }while (!(i==0));
        System.out.println("Girilen sayilarin toplkami:"+num);
        scan.close();
    }
}
