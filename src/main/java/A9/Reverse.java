package A9;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bir ifade giriniz");
        String deger=input.nextLine();
        StringBuilder reverse=new StringBuilder(deger).reverse();
        System.out.println(reverse);

    }
}
