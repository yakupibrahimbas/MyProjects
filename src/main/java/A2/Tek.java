package A2;

import java.util.Scanner;

public class Tek {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Sayilari giriniz");
        System.out.println("Sayi 1");
        int sayi1= input.nextInt();
        System.out.println("Sayi 2");
        int sayi2= input.nextInt();
        System.out.println("Sayi 3");
        int sayi3= input.nextInt();
        System.out.println("Sayi 4");
        int sayi4= input.nextInt();

        if (sayi1<0){
            sayi1=0;
        }
            if (sayi2<0){
                sayi2=0;
            }
            if (sayi3<0){
                sayi3=0;
            }
        if (sayi4<0){
            sayi4=0;
        }

        System.out.println(sayi1+sayi2+sayi3+sayi4);

    }
}
