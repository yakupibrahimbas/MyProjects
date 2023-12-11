package A11;

import java.util.Scanner;

public class WhileLoop02 {
    public static void main(String[] args) {
        //Carpim tablosu verilen sayiya gore

        Scanner input=new Scanner(System.in);
        System.out.println("Carpim tablosu icin bir sayi giriniz");
        int num=input.nextInt();

        int i=1;
        while (i<10){
            System.out.println(num+"X"+i+"="+(num*i));
            i++;
        }
    }
}
