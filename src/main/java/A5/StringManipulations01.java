package A5;

public class StringManipulations01 {
    public static void main(String[] args) {

        String krediKart="1234 5678 9012 3456";
        String first=krediKart.substring(0,15).replaceAll("[0-9]","*");
        System.out.println(first);
        String last=krediKart.substring(15);
        System.out.println(last);
        System.out.println(first+last);

        // Example1: Credit card last 4 number except ****

      /*  String ccNum="1234 1234 1234 1234";
        String first= ccNum.substring(0,15).replaceAll("[0-9]","*");
        System.out.println(first);
        String last=ccNum.substring(15);
        System.out.println(last);
        String result=first+last;
        System.out.println(result);

        System.out.println("first.concat(last) = " + first.concat(last)); */

        //Example 2
        String sentence="Tom Hanks was born in 1975.";
        System.out.println(sentence.replaceAll(" ", "").length());

        /*
        1)concat()method is for joining two Strings like "+ sign
        2)replace(char,char) or replace(String,String): It is used to replace single character or multiple character

        */

    }
}
