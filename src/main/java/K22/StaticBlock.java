package K22;

import java.time.LocalDate;

public class StaticBlock {

    static double pi;
    static int price;
    static {
        System.out.println("Statik blok2");

        LocalDate currentDate=LocalDate.now();
        if (currentDate.getMonthValue()==11){
            price=1000;
            System.out.println(price);
        }else {
            price=2000;
            System.out.println(price);
        }
        //statik blok
        //scope-yasam alani
        //statik bloklar içinde değişken tanimlanmaz ama deger atanir.

        pi=3.14;
        System.out.println("Static block 1");

    }

    public static void main(String[] args) {

        System.out.println(pi);
        System.out.println("main method ici");

    }
}
