package A22;

public class StaticRunner {
    public static void main(String[] args) {

        System.out.println(Static.stdName);
        Static ali=new Static();
        System.out.println(ali.age);
        Static.staticMethod();
        ali.nonStaticMethod();
    }
}
