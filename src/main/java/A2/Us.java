package A2;

import java.util.Scanner;

public class Us {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("N degeri giriniz: ");
        int n= input.nextInt();
        System.out.println("K degerini giriniz");
        int k=input.nextInt();
        for (int i = 1; i <=k ; i*=n) {
            System.out.println(i);
        }

    }
}
