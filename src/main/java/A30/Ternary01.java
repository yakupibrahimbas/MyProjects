package A30;

import java.util.Scanner;
import java.util.Stack;

public class Ternary01 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Sayi giriniz?");
        int s=scan.nextInt();
        if (s>9){
            System.out.println("Rakam degil");
        }else {
            System.out.println("Rakam");
        }

       String result= s>9?"Rakam Degil":"Rakam";
        System.out.println(result);
        System.out.println(s > 99 && s < 1000 ? "3 basamakli" : s);
    }
}
