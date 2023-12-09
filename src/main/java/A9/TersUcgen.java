package A9;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("kac satir ucgen olsun");
        int number= input.nextInt();

        for (int i=1;i<=number;i++){
            for (int j=1;j<=(i-1);j++){
                System.out.println(" ");
            }
            int starCount=(number+1)-i;
            System.out.println(number-(i+1));
        }





    }
}
