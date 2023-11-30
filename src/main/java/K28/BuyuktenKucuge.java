package K28;

import java.util.Scanner;

public class BuyuktenKucuge {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("Sayi a giriniz");
        int a=input.nextInt();
        System.out.print("Sayi b giriniz");
        int b=input.nextInt();
        System.out.print("Sayi c giriniz");
        int c=input.nextInt();

        switch (a){
            case 1:
                if (a<b&&b<c){
                    System.out.println("a<b<c");
                }
            break;
        }if (a>b&&b>c){
            System.out.println("a>b>c");
        }if (b>a&&a>c){
            System.out.println("b>a>c");
        }else
            System.out.println("b<a<c");


    }


}
