package A29;

import java.util.Scanner;

public class ExampleNestedIf {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char h=scan.next().charAt(0);

        if (h>='a'&&h<='z'){
            if (h=='a'){
                System.out.println("Ilk kucuk harf");
            }else {
                System.out.println("Ilk kucuk harf degil");
            }
        } else if (h>='A'&&h<='Z') {
            if (h=='Z'){
                System.out.println("Son buyuk harf");
            }else {
                System.out.println("Son buyuk harf degil");
            }
        }else {
            System.out.println("Lutfen harf giriniz");
        }
scan.close();
    }
}
