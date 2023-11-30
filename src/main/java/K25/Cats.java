package K25;

public class Cats extends Animals{
    public void meow(){
        System.out.println("Cats meow");

    }

    @Override
    public void drink() {
        System.out.println("Cats drink");
    }

    @Override
    public void eat() {
        System.out.println("Cats eat");

    }
}
