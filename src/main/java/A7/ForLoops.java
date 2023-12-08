package A7;

public class ForLoops {
    public static void main(String[] args) {

        //Example: Find the sum of the digits of decimal part in a double number

        //28.587 ==> 5+8+7=20

        double n=28.587;
        String s=String.valueOf(n);

        //Use split method to get the decimal part

       String ds= s.split("\\.")[1];
        System.out.println(ds);

        //Convert data type of ds to Integer
        int ids=Integer.valueOf(ds);
        System.out.println(ids);
        int sumOfDigits=0;

        for (int i=ids;i>0;i=i/10){
            sumOfDigits=sumOfDigits+i%10;

        }
        System.out.println(sumOfDigits);




    }
}
