package A3;

import java.util.Scanner;

public class Ternary02 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Bir tam sayi giriniz");
        int a=input.nextInt();

        //Kullanicinin girdihi sayi tekmi ciftmi


        if (a%2==0){
            System.out.println("a cift sayidir");
        }else {
            System.out.println("a tek sayidir");
        }

       String result= a%2==0?"Cift sayidir":"Tek sayidir ";
        System.out.println(result);
    }
}
