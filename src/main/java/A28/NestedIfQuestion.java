package A28;

import java.util.Scanner;

public class NestedIfQuestion {
    public static void main(String[] args) {
        //kullanici cinsiyet
        //yas

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz:Erkek/Kadin");
        String c=scan.next();
        System.out.println("Yasinizi giriniz");
        int y=scan.nextInt();

        if (c.equalsIgnoreCase("Erkek")){
            if (y<18){
                System.out.println("Erkek Cocuk");
            }else {
                System.out.println("Adam");
            }

        } else if (c.equalsIgnoreCase("Kadin")) {
            if (y<18){
                System.out.println("Kiz Cocuk");
            }else {
                System.out.println("Kadin");
            }
        }else {
            System.out.println("Bu cinsiyet tanimli degil");
        }


    }
}
