package A25;

public class HondaRunner {
    public static void main(String[] args) {
        Civic civic=new Civic();
        Accord accord=new Accord();
        accord.cool();

        System.out.println(Ac.price);
        System.out.println(Engine.price);
        System.out.println(Security.price);
        civic.eco();
        Engine.stop();

    }
}
