package O4;

import java.util.Scanner;

public class ForLoops07 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Baslangic ve bitis harflerini giriniz");
        char bas=scan.next().toUpperCase().charAt(0);
        char bit=scan.next().toUpperCase().charAt(0);

        if (bas>bit){
            System.out.println("Yanlis ifade kullandiniz");
        }else {
            for (char i=bas;i<=bit;i++){
                System.out.println(i);
            }
        }


    }
}
