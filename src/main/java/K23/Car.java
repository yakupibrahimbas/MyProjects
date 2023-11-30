package K23;

public class Car {

    public String brand;
    public String color;
    public String model;
    public int speed;
    public int price;

    public void speedUp(int increment) {
        this.speed = this.speed + increment;
    }
    public void applyBrakes(int decrement){
        this.speed=this.speed-decrement;
    }

    public void printStates(){
        System.out.println(" Brand :"+this.brand+" Model :"+this.model+" Color :"+ this.color+" Price:"+this.price);
    }

}
