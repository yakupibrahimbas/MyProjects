package O3;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle=scan.nextLine();

       cumle= cumle.replaceAll("\\d","*");
        cumle=cumle.trim();
        cumle=cumle.replace(" ","!");
        cumle.replace('a','A');
        cumle.replace('z','Z');
        cumle="("+cumle+")";
        System.out.println(cumle);

    }
}
