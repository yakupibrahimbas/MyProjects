package A22;

import java.time.LocalDate;

public class StaticBlock {

    static double pi;
    static  int price;
    static {
        System.out.println("static block2");
        LocalDate currentDate=LocalDate.now();
        if (currentDate.getMonthValue()==2){
            price=1000;
            System.out.println(price);
        }else {
            price=2000;
            System.out.println(price);
        }
    }
    static {
        //static block
        pi=3.14;
        System.out.println("Static block");
    }
    public static void main(String[] args) {

        System.out.println(pi);
        System.out.println("main method ici");

    }
}
