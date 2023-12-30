package A30;

import java.util.Scanner;

public class Ternary02 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Ucgenin 3 kenar uzunlugunu giriniz");
        int k1= scan.nextInt();
        int k2= scan.nextInt();
        int k3= scan.nextInt();
        String result=k1==k2||k1==k3||k2==k3?"Ikizkenar ucgen":"Ikızkenar ucgen degil";
        System.out.println(result);

    }
}
