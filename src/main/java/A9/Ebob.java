package A9;

import java.util.Scanner;

public class Ebob {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen birinci sayiyi giriniz");
        int number1=input.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        int number2=input.nextInt();

       int n=Math.min(number1,number2);
       int ebob=1;
       for (int i=1;i<=n;i++){
           if ((number1%i==0)&&(number2%i==0)){
               ebob=i;
           }
       }
        System.out.println(ebob);
    }
}
