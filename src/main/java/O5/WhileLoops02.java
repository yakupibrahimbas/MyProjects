package O5;

import java.util.Scanner;

public class WhileLoops02 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("sayi giriniz---carpim tablosu icin");
        int s=scan.nextInt();

        int i=1;
        while (i<=10){
            System.out.println(s+"X"+i+"="+(s*i));
            i++;
        }
    }
}
