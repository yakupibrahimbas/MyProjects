package A2;

import java.util.Scanner;

public class Topla {
    public static void main(String[] args) {

      Scanner scanner=new Scanner(System.in);
      int toplam=0;
        System.out.println("negatif girene kadar devam");
        while (true){
            System.out.println("bir sayi giriniz");
            int sayi=scanner.nextInt();
            if (sayi<0){
                break;
            }
            if (sayi%2==1){
                toplam+=sayi;
            }
        }

        System.out.println("tek sayilarin toplami:"+toplam);

    }

}
