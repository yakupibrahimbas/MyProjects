package K19;

public class CarRunner {
    public static void main(String[] args) {

        Car c1=new Car("BMW","3.20",2023,false);
        System.out.println(c1.brand);
        System.out.println(c1.model);
        System.out.println(c1.year);
        System.out.println(c1.hybrid);




        c1.hareket();
        c1.dur();

        System.out.println(c1);
        Car c2=new Car("Audi","A4",2018,false);
        System.out.println(c2);

        Car c3=new Car("Fiat","Sahin",2023,true);
        System.out.println(c3);

    }


}
