package A26;

public class Exceptions03 {
    public static void main(String[] args) {

        int a=12;
        int b=4;
        String s="Ali Can";
    }
    public static void getCharFromString(String s,int a,int b){

        try {
            int idx=a/b;
            char ch=s.charAt(idx);
            System.out.println(ch);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
