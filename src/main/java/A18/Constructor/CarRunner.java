package A18.Constructor;

public class CarRunner {
    public static void main(String[] args) {
        Car c1=new Car("Mercedes","Benz",2024,true);
        System.out.println(c1.marka);
        System.out.println(c1.model);
        System.out.println(c1.year);
        System.out.println(c1.hybrid);
        c1.dur();
        c1.hareket();
        System.out.println(c1);
        Car c2=new Car("Tofas","A4",1990,false);
        System.out.println(c2);
    }
}
