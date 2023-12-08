package A5;

public class StringManipulations06 {
    public static void main(String[] args) {

        String s="Java is Java";
        //Other Methods
        boolean r1= s.contains("v");
        System.out.println(r1);
        boolean r2=s.startsWith("J");
        System.out.println(r2);
        boolean r3=s.endsWith("a");
        System.out.println(r3);
        char r6=s.charAt(2);
        System.out.println(r6);
        String r7=s.repeat(2);
        System.out.println(r7);

    }
}
