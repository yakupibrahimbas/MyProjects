package K25.K25_2;

public class Cat extends Animal {
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

    @Override
    public Animal create() {
        return new Cat();
    }

    @Override
    public int add(int a, int b) {
        return super.add(a, b);
    }
}
