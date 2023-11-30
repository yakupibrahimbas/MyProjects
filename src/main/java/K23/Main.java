package K23;

public class Main {
    public static void main(String[] args) {

        Car car=new Car();
        Car car2=new Car();


        car.brand="Ford";
        car2.brand="Renault";

        car.model="Focus";
        car2.model="Megane";

        car.color="Black";
        car2.color="Gray";

        car.price=100000;
        car2.price=120000;

        car.printStates();
        car2.printStates();

        car.speed=100;
        car2.speed=130;
        car.speedUp(50);
        car2.speedUp(70);

        System.out.println(car.speed);
        System.out.println(car2.speed);

        car.applyBrakes(20);
        car2.applyBrakes(70);
        System.out.println(car.speed);
        System.out.println(car2.speed);


    }
}
