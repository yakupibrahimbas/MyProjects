package A18;

import java.util.Scanner;

public class CarRunner {
    public static void main(String[] args) {

        Car c1=new Car("bmw","m4",2023,false);
        System.out.println(c1.make);
        System.out.println(c1.model);
        System.out.println(c1.year);
        System.out.println(c1.hybrid);

        c1.hareket();
        c1.dur();

        Car c2=new Car("audi","a5",2022,true);
        Car c3=new Car("honda","civic",2015,false);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }

}
