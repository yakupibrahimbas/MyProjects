package K25.K25_2;

public class Animal {
    public void eat(){

        System.out.println("Animals eats");
    }
    public void drink(){

        System.out.println("Animals drink");
    }

    public Animal create(){

        return new Animal();
    }
    public int add(int a,int b){
        return a+b;
    }
}
