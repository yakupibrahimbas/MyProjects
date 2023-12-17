package A17;

public class Method01 {
    public static void main(String[] args) {

   int r1= add(3,5);
        System.out.println(r1);
        double r2=multiplyThreeNumbers(1.2,4,5.31);
        System.out.println(r2);
       String r3= joinTwoStrings("Ja","va");
        System.out.println(r3);
    }
    public static int add(int a,int b){
        return a+b;
    }
    //Create a method to multiply 3 numbers
    public static double multiplyThreeNumbers(double a,double b,double c){
        return a*b*c;
    }
    //Create a method hoins two strings
    public static String joinTwoStrings(String s,String t){
        return s.concat(t);
    }

    //Variables used in method creation is called parameters
    //actuall Values used in a method call are called arguments
}
