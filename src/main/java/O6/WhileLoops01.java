package O6;

import java.util.Scanner;

public class WhileLoops01 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("ilk isminizi giriniz");
        char ilk=scan.nextLine().toUpperCase().charAt(0);
        System.out.println("Lutfen soy isminizi giriniz");
        String soy=scan.nextLine().toUpperCase();
        char sonHarf=soy.charAt(soy.length()-1);

        while (ilk<=sonHarf){
            System.out.println(ilk);
            ilk++;
        }
    }
}
