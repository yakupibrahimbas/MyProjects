package A11;

import java.util.Scanner;

public class ForLoop06 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen kac hafta ve kac gun gireceginizi seciniz");
        System.out.println("Hafta");
        int hafta=input.nextInt();
        System.out.println("Gun");
        int gun=input.nextInt();

        for (int i=1;i<=hafta;i++){
            System.out.println("week:"+i);
            for (int j=1;j<=gun;j++){
                System.out.println("   gun"+j);
            }

        }


    }
}
