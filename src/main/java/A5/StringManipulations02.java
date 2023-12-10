package A5;

public class StringManipulations02 {
    public static void main(String[] args) {

        //Example: Type code to print just the unique characters in a String
        //"Hello"==> Heo

        String s="Hello";
        int indexOfH=s.indexOf("H");
        System.out.println(indexOfH);

        int lastIndexOfH=s.lastIndexOf("H");
        System.out.println(lastIndexOfH);
        int indexOfE=s.indexOf("e");
        System.out.println(indexOfE);
        int lastIndexOfE=s.lastIndexOf("e");
        System.out.println(lastIndexOfE);
        int indexOfL=s.indexOf("l");
        System.out.println(indexOfL);
        int lastIndexOfL=s.lastIndexOf("l");
        System.out.println(lastIndexOfL);
        if (indexOfL==lastIndexOfL){
            System.out.println("l");
        }
        int indexOfO=s.indexOf("o");
        System.out.println(indexOfO);
        int lastIndexOfO=s.lastIndexOf("0");
        System.out.println(lastIndexOfO);
        if (indexOfO==lastIndexOfO){
            System.out.println("o");
        }
    }
}
