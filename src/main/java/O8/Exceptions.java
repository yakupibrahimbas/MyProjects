package O8;

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) throws AgeException {

        Scanner scan=new Scanner(System.in);
        System.out.println("yas giriniz");
        int yas=scan.nextInt();
        if (yas<15){
            throw new AgeException();
        }

    }
}
