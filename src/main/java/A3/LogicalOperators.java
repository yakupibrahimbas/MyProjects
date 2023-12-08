package A3;

public class LogicalOperators {
    public static void main(String[] args) {

        //"AND" Logical operators:&&
        //Just a single false is enough to make the result false (Perfectionist)
        //To get true from && operation all must be true

        int i=10;
        int k=5;
        System.out.println((i < k) && (i == 2 * k) && (i / k == 2) && (i % k == 2));

        //first is false no need to check others
        //because just a single false is enogh to make the result false

        //note: If you use&& in && operation Java does not check the others after finding first false


        //Or Logical Operator :||

        //note: just a single true is enogh to make the result true in -- operation (Polyanna)
        //note: To get false from || operation all must be false

        int a=6;
        int b=2;
        System.out.println((a>=b)||(a%b!=0||(a<=3*b)));

        System.out.println((a==b)||(a%b!=0)||(a>3*b));


        //note:there is single usage of | in Or operation we must use ||











    }
}
