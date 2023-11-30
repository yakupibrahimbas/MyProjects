package K24.a;

public class Car {
   private int enginePower,model ;
   public int speed;
   protected String color;
   Car(){
       this.model=2023;
       this.enginePower=300;
       this.speed=120;
       this.color="red";

   }
   public void print(){
       System.out.println(model);
   }

}
