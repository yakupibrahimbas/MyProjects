package A7;

public class WhileLoops03 {
    public static void main(String[] args) {
        //Example:Type code to find the sum of the digits of an integer
        //587==>5+8+7

        int i=587;
        int sumOfDigits=0;
        while (i>0){
            sumOfDigits=sumOfDigits+i%10;
            i/=10;
        }
        System.out.println(sumOfDigits);

        //Example:Type code to create multiplication for the given integer

        //3==>3X1=3 3x2=6 3x3=9....3X10=30
       int l=1;
       int numara=5;

       while (l<11){
           System.out.println(numara+"X"+l+"="+(numara*l));
           l++;
       }
    }
}
