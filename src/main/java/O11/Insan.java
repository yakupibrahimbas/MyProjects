package O11;

public class Insan {
    int age;
    String name;
    int height;
    boolean isHonest;
    String job;
    String gender;

    public Insan(){
        System.out.println("Parametresiz");

    }
    public Insan (String name){
        System.out.println("Name parametreli");
    }
    public Insan (String job,String gender){
        this("Veli");
        System.out.println("Job ve gender parametreli");
    }
    public static void main(String[] args) {
        Insan i1=new Insan("Doctor","Bayan");


    }
}
