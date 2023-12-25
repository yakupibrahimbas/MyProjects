package A25;

public class Civic implements Ac,Security,Engine {
    @Override
    public void cool() {
        System.out.println("Civic");

    }

    @Override
    public void run() {
        System.out.println("Ac runs super");
    }
}
