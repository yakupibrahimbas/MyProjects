package K22;

public class InstanceBlock3 {

    public String color;
    public String fuelType;
    {
        color="Siyah";
        fuelType="Benzin";
    }
    //constructor

    public InstanceBlock3(){
        System.out.println("Araba rengi:"+color);
        System.out.println("Araba yakit turu:"+fuelType);
    }

    public InstanceBlock3(String color, String fuelType) {
        this.color = color; //
        this.fuelType = fuelType;
    }
}
