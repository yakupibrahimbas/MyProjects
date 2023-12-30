package A30;

import java.util.Scanner;

public class Ternary03 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Urun miktarini giriniz");
        int miktar=scan.nextInt();
        System.out.println("Urun biri fiyatini giriniz");
        double fiyat=scan.nextDouble();
        double result= miktar>1000?fiyat*0.9*miktar:fiyat*miktar;
        System.out.println(result);
    }
}
