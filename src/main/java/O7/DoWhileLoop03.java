package O7;

import java.util.Scanner;

public class DoWhileLoop03 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("String giriniz");
        String s=scan.nextLine();
        int harfCounter=0;
        int rakamCounter=0;
        int digerCounter=0;

        int k=0;
        do {
            if (s.charAt(k)>='a'&&s.charAt(k)<='z'){
                harfCounter++;
            } else if (s.charAt(k)>='0'&&s.charAt(k)<='9') {
                rakamCounter++;
            }else {
                digerCounter++;
            }
            k++;
        }while (k<s.length());
        System.out.println("harf sayisi:"+harfCounter);
        System.out.println("rakam sayisi:"+rakamCounter);
        System.out.println("diger karakter sayisi:"+digerCounter);
    }
}
