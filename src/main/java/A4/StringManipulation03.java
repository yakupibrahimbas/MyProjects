package A4;

public class StringManipulation03 {
    public static void main(String[] args) {

     /*   String s1="Mustafa";
        String s2=new String("Mustafa");
        System.out.println(s2.length());
        System.out.println("0.index:"+s2.charAt(0));
        System.out.println("5.index:"+s2.charAt(5));
        System.out.println("5.index:"+s2.charAt(s2.length()-1)); */

        char[]str={'K','O','D','L','A','M','A'};
        String metin=new String(str);
        System.out.println(metin);
        String m="Kodlama";
        String m2="Vakti";
        System.out.println(metin.length());
        System.out.println(m+m2);
        System.out.println(m.concat(m2));
        System.out.println(metin.charAt(1));

        System.out.println(m.startsWith("K"));



    }
}
