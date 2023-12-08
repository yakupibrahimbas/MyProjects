package A5;

public class StringManipulations05 {
    public static void main(String[] args) {

        //Example: Type code to find the number of punctuation marks used in a String
        //"Woow!... Tom is 13, and he is in university..."
        String s="Woow!... Tom is 13, and he is in university...";
        int numOfPuncts=s.replaceAll("[^\\p{Punct}]","").length();
        System.out.println(numOfPuncts);

        //Example: "Learn Java,earn huge amount of money."
        String t="Learn Java,earn huge amount of money.";
       int numOfSpaceChars= t.replaceAll("[^ ]","").length();
        System.out.println(numOfSpaceChars+1);
        int numOfWords= t.split(" ").length;
        System.out.println(numOfWords);

        System.out.println("*************");
        int numOfLetters =t.replaceAll("[^A-Za-z]","").length();
        System.out.println(numOfLetters);


    }
}
