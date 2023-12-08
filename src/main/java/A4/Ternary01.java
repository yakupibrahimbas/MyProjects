package A4;

public class Ternary01 {
    public static void main(String[] args) {

        //Type code to check if an integer is even or odd

        int a=-12;

      String result=  a%2==0?"Even":"Odd";
        System.out.println(result);

        //Example2= Type code to check if an integer has 3 digits or not
        int b=435;
        String result2=b>99&&b<1000?"The integer has 3 digits":"The integer doesnt have 3 digits";
        System.out.println(result2);

        //Type code to calculate absolute value of a number

        double c=-23;
        double result3=c<0 ? -1*c:c;
        System.out.println(result3);

        //Example:Type code to find the multiplication of two integers if the signs are same
        //Give a message like "I do not know how to multiply if the signs are different
        int d=-5;
        int e=-4;
       Object result4= (d<0 &&e<0)||(d>0&&e>0)?d*e:"I do not know how to multiply" ;
        System.out.println(result4);

       //Object data type is like Adam.
    }
}
