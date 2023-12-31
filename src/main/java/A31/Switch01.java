package A31;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {

        //switch statement if else ile ayni isi yapar
        //switch statement daha kolay yazilir daha kolay okunur
        //2 den fazla durum varsa genellikle if-else-if yerine switch kullanilir

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen haftanin gunun giriniz");
        int gun= input.nextInt();
        switch (gun){
            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("Sali");
                break;
            case 3:
                System.out.println("Carsamba");
                break;
            case 4:
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Gecerli bir gun sayisi giriniz");
        }



    }

}
