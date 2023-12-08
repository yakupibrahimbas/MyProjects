package A2;

import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("sayi giriniz: ");
        int n= input.nextInt();
        System.out.println("us giriniz");
        int k= input.nextInt();
        int result=1;
        int i=1;
        while (i<=k){
            result*=n;
            i++;
        }
        System.out.println("Sonuc"+result);


    }
}
