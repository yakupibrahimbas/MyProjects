package K26.K26_3;

public interface Ac {
    public abstract void cool();
    void run();
    int price=2000;
    public default void eco(){
        System.out.println("Uses gas less");
    }
}
