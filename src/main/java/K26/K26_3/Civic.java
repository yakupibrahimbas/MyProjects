package K26.K26_3;

public class Civic implements Ac,Security,Engine{
    @Override
    public void cool() {
        System.out.println("Civic cools perfect");
    }

    @Override
    public void run() {
        System.out.println("Ac runs super");

    }

    @Override
    public void stop() {

    }
}
