package A4;

public class Ternary02 {
    public static void main(String[] args) {

        int a=12;
        String result1=a%2!=0?"Odd":(a%3==0?"Even and divisible by 3":"Even but not divisible by 3");
        System.out.println(result1);

        //----------

        int year=1996;
        String result2=(year%100==0)?(year%400==0?"Leap":"not leap"):(year%4==0?"Leap":"Not leap");
        System.out.println(result2);
    }
}
