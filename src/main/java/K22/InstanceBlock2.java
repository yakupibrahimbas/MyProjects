package K22;

public class InstanceBlock2 {

    public int year;
    {
        System.out.println("Herkese Selam");
    }

    public InstanceBlock2(int year) {
        this.year = year;
    }

    public InstanceBlock2(){
        System.out.println("Herkese selam");
        this.year=year;
    }
}
