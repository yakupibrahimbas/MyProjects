package A3;

import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Us alinacak sayi");
        int n=input.nextInt();
        System.out.println("Us oacak sayi");
        int k=input.nextInt();
        int result=1;
        int i=1;
        while (i<=k){
            result*=n;
            i++;
        }
        System.out.println(result);

    }
}
