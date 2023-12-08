package A3;

import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {

      Scanner input=new Scanner(System.in);
        System.out.println("Faktoriyel girilecek sayiyi belirleyiniz");
        int sayi=input.nextInt();
            int result=1;
            for (int i = 1; i <= sayi; i++) {
            result*=i;
        }
        System.out.println(result);
    }
}
