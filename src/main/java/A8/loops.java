package A8;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("N degerini giriniz");
        int n=input.nextInt();
        double result=0;

        for (double i=1;i<=n;i++){
            result=result+(1.0/i);
        }
        System.out.println(result);

    }
}
