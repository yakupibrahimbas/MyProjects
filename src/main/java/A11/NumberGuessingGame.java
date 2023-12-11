package A11;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        //0-100 arasi sayi tahmin etme oyununu do while ile yazdiriniz

        Scanner scanner=new Scanner(System.in);
        Random random=new Random();//rastgele sayi uretimi icin bu classtan bir object olusturduk

        int rastgeleSayi=random.nextInt(101);
        int denemeSayisi=0;
        int tahminEdilen;
        boolean tahminDogrumu=false;
        System.out.println("0-100 arasinda bir sayi tahmin etmeye calisin.");

        do {
            System.out.println("Tahmininizi yazin");
            tahminEdilen=scanner.nextInt();
            denemeSayisi++;
            if (tahminEdilen<rastgeleSayi){
                System.out.println("Sayi daha buyuk");
            } else if (tahminEdilen>rastgeleSayi) {
                System.out.println("sayi daha kucuk");
            }else {
                tahminDogrumu=true;
                System.out.println("Tebrikler dogru tahmin");
                System.out.println("Deneme sayisi:"+ denemeSayisi);

            }



        }while (!tahminDogrumu);
        scanner.close();




    }
}
