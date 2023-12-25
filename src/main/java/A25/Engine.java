package A25;

public interface Engine {
    void run();
    static void stop(){
        System.out.println("stop securly");
    }
    int price=3000;
}
