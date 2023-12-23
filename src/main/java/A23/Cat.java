package A23;

public class Cat extends Animal {
    public void meow(){
        System.out.println("Cats meow...");
    }

    @Override //override kurallarini java tarafindan kontrol edilemsini saglar
    public void eat() {
        System.out.println("Cats eat");    }

    @Override
    public void drink() {
        System.out.println("Cats drink");
    }
}
