package K26.K26_3;

public interface Engine {
    void run();
    default void stop(){
        System.out.println("Stops security");
    }
}
