package A2.A2_LESSON;

public class MethodOverloading {
    public static void main(String[] args) {

     toplama(2.5,6.7);
     toplama(2.5,7);
     toplama(2.5,6);
     toplama(2, 6.0);



    }
    private static void toplama(double a,double b){
        System.out.println(a+b);

    }
    private static void toplama(int a,double b){
        System.out.println(a+b);
    }
    private static void toplama(double a,int b){
        System.out.println(a+b);
    }


}
