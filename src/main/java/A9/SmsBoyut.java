package A9;

import java.util.Scanner;

public class SmsBoyut {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen mesajinizi giriniz");
        String  mesaj=input.nextLine();
        if (mesaj.length()<160){
            System.out.println("Mesajiniz 1 kredidir ve boyutu :"+mesaj.length());
        }else if (mesaj.length()<320){
            System.out.println("Mesajiniz 2 kredidir ve boyutu :"+mesaj.length());
        }

    }
}
