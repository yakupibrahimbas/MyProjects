package O10;

public class Car {
    int price;
    int year;
    String make;
    String model;
    String color;
    boolean isDiesel;
    double km;
    public Car(int price,int year,String make,boolean isDiesel){
        this.price=price;
        this.year=year;
        this.make=make;
        this.isDiesel=isDiesel;
        this.model=model;
        this.color=color;
        this.km=km;



    }
    public static void main(String[] args) {
        Car car1=new Car(5000,2018,"Toyota",true);
        System.out.println("car1.price = " + car1.price);
        System.out.println("car1.year = " + car1.year);
        System.out.println("car1.make = " + car1.make);
        System.out.println("car1.isDiesel = " + car1.isDiesel);
        System.out.println("==============================================");

        Car car2=new Car(80000,2023,"Audi",false);
        System.out.println("car2.price = " + car2.price);
        System.out.println("car2.year = " + car2.year);
        System.out.println("car2.make = " + car2.make);
        System.out.println("car2.isDiesel = " + car2.isDiesel);

        Car car3=new Car(3000,2017,"BMW",false);




    }

}
