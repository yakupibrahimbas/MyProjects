package A3;

public class PostPreIncrement {
    public static void main(String[] args) {

        //post increment
        int a=12; //primitive int valuable

        int b=a++;
        System.out.println(a);
        System.out.println(b);

        double x=11.5;
        double y=x++;
        System.out.println(x);
        System.out.println(y);

    //pre increment

        int t=10;
        int u=++t;
        System.out.println(t);
        System.out.println(u);

        //post decrement

        int c=15;
        int d=c--;
        System.out.println(c);
        System.out.println(d);

        //Pre Decrement

        int e=20;
        int f=--e;
        System.out.println(e);
        System.out.println(f);


    }
}
