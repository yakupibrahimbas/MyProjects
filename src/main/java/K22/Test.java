package K22;

public class Test {
    int nonStaticVariable=10;

    public static void main(String[] args) {



        Deneme instance=new Deneme(10);
        Deneme referans=new Deneme(4);
        System.out.println(instance.a);
        System.out.println(referans.a);
        instance.statikOlmayanMethod();

        System.out.println(Deneme.b);
        Deneme.ornekMethod();


    }
}
