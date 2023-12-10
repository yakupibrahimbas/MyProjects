package A1;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir yil giriniz");
        int year = input.nextInt();

        if (year%4==0||year%400==0){
            System.out.println("Artik yil");
        }else {
            System.out.println("Artik yil degil");
        }

    }

}