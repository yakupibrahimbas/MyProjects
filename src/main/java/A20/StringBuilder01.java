package A20;

public class StringBuilder01 {
    public static void main(String[] args) {

        /*

        String builder classi da string ureten bir classtir

         */

        String s="Java";
        String t=s+"x";
        String w=t+"?";
        String s1="Java";
        String c=new String("Ali");
        String c2="Ali"; //ali degeri string pool havuza eklenir
        System.out.println(c);
        System.out.println(c2);
        String str3=new String("abc");

       // StringBuilder b="Ali"; --> Bu sekilde object uretilmez

        StringBuilder ca=new StringBuilder("Python");
        System.out.println(ca);
        ca.append("!");
        System.out.println(ca);
    }
}
