package A22;

public class Car extends Vehicle{

    public Car(){
       this("model");
        System.out.println("Car1");
    }
    public Car (String make){
        super();
        System.out.println("Car 2");
    }
    public String model="Accord";
    public int km=2000;
}
