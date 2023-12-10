package A6.Depo;


import java.util.Scanner;

public class urunTanimlama extends Urun {



    static {

        Scanner scan = new Scanner(System.in);


        System.out.println("Urun İd Giriniz:");
        urunId = scan.nextLine();
        Integer.valueOf(urunId);

        System.out.println("Urun İsmi Giriniz:");
        urunIsmi = scan.nextLine();



        System.out.println("Urun miktarı giriniz:");
        miktar = scan.nextLine();
        if (miktar.equals("")) {
            miktar = "0";
        }
        Integer.valueOf(miktar);



        System.out.println("Uretici Giriniz:");
        uretici = scan.nextLine();


        System.out.println("birim Giriniz:");
        birim = scan.nextLine();



    }


    public urunTanimlama() {
        System.out.print("Urunismi: " + urunIsmi + ", ");
        System.out.print("Urunid: " + urunId + ", ");
        System.out.print("Uretici: " + uretici + ", ");
        System.out.print("birim: " + birim + ", ");
        System.out.print("raf: " + raf);
    }


    static String[] raflar = {"raf1", "raf2", "raf3", "raf4", "raf5", "raf6"};//null


}