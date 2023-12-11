package A11;

public class ExamplesFor02 {
    public static void main(String[] args) {
        String s="Pwd12?Ab";
        for (int i = 0; i < s.length(); i++) {

           char ch= s.charAt(i);
           if (ch>='a'&&ch<='z'){
               continue;
           }else {
               System.out.print(ch);
           }
        }


    }
}
