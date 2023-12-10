package A9;

import java.awt.*;
import java.util.Scanner;

public class For02 {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
        System.out.println("Faktoriyeli alinacak sayiyi giriniz");
        int sayi=input.nextInt();
        long faktoriyel=1;
        for (int i=1;i<=sayi;i++){
            faktoriyel*=i;
        }
        System.out.println(sayi+" sayisinin faktoriyeli "+faktoriyel+"dir");


    }
}
