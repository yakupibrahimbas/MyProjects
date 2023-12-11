package A11;

public class ExamplesFor01 {
    public static void main(String[] args) {

        String s="I love Java";
        for (int i=0;i<s.length()-1;i++) {
            if (s.charAt(i)=='a'){
                break;
            }
            System.out.print(s.charAt(i));

        }


    }
}
