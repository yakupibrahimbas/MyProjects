package A4;

public class StringManipulations02 {
    public static void main(String[] args) {

        //Count the alphabetical characters in a given String
        //Remove non alphabetical characters --count the remaining characters
        //non-alphabetical characters are a group of data
        //Regex-- regular expression

        /*
      Upper case letters:[A-Z]
      Lower case letters[a-z]
      All letters[A-Za-z]
      All digits[0-9]
      Letters from m to v:[m-v]
      Regex for a,b,e,d,g,z:[abedgz]
      All characters different from uppercase letters:[^A_Z]
      All characters different from lowercase letters:[^a-z]
      All characters different from all letters:[^A-Za-z]
      All characters different from digits:[^0-9]
      All symbols(Different from letters and digits)
      All punction marks:\p{Punct}


         */

        String s1="Tom12 Hanks!...";
        int numOfChar=s1.replaceAll("[^A-Za-z]","").length();
        System.out.println(numOfChar);

        //replaceAll()==> It changes a group of characters to another characters
        //length ==> Counts the number of characters in String

        //Example: Type code to change all digit to * in a given password
        // pwd:a12346faf!=a*****faf!

        String pwd="abc123aaa!";
        String hiddenPwd=pwd.replaceAll("[0-9]","*");
        System.out.println(hiddenPwd);

        //Example:
        String name="   tom hanks   ";

        String newName=name.trim().substring(0,1).toUpperCase();
        System.out.println(newName);
        String lastInitial=name.trim().split(" ")[1].substring(0,1).toUpperCase();
        System.out.println(newName+lastInitial);
        //trim():removes spaces from the beginning and from the end
        //substring(s,e)It gets a part of the String."s"

        //toUpperCase() : Changes all alphabetical characters to upper cases in a String
    }
}
