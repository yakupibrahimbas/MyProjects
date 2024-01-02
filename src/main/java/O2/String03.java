package O2;

import java.util.Scanner;

public class String03 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Sifrenizi giriniz");
        String pwd=scan.nextLine();

        if ((pwd.charAt(0)>='A' && pwd.charAt(0)<='Z') && (pwd.charAt(pwd.length()-1)>='0' && pwd.charAt(pwd.length()-1)<='9') && pwd.length()>5){
            System.out.println("Passwprd basariyla olusturldu");

        }else {
            System.out.println("tekrar deneyiniz");

        }

    }
}
