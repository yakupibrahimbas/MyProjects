package A22;

public class Honda extends Car{
    public Honda() {
        System.out.println(super.km);
        System.out.println(super.km);
        System.out.println(this.km);
        System.out.println(this.model);
        System.out.println("Honda 1");
    }
    public Honda (String model,int year) {
        super();
        System.out.println("Honda 2");
    }
    public String model="Civic";
    public int km=1000;

    }

