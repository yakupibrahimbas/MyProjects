package A18.Constructor;

public class Car {
    
    String marka="Honda";
    String model="Civic";
    int year=2023;
    boolean hybrid=true;



    public void hareket(){
        System.out.println("Honda hizli gider");
    }
    public void dur(){
        System.out.println("Honda araçlar ABS sistemi sayesinde duruşu guzeldir.");
    }

    public Car(String marka,String model,int year,boolean hybrid){
        this.marka=marka;
        this.model=model;
        this.year=year;
        this.hybrid=hybrid;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}
