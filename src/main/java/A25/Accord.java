package A25;

public class Accord implements Ac,Security,Engine {
    @Override
    public void cool() {
        System.out.println("Accord");

    }

    @Override
    public void run() {
        System.out.println("Engine runs super");
    }
}
