package K18;

import java.util.Scanner;

public class K03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Fahreneit cinsinden sicaklik degerini giriniz");
        double fahrenheit = input.nextDouble();
        double celcius = fahrToCels(fahrenheit);
        System.out.println("celcius:" + celcius);
    }

    private static double fahrToCels(double fahrenheit) {
        double celsius = (fahrenheit - 32) / 1.8;
        return celsius;


    }


}





