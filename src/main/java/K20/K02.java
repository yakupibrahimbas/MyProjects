package K20;

public class K02 {
    public static void main(String[] args) {
        String a="Money";
        a=a+"More";

        StringBuilder sb1=new StringBuilder();
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());
        sb1.append("Java");
        sb1.append("xxxxxxxxxxxxx");
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());

        StringBuilder sb2=new StringBuilder();
        System.out.println(sb2.append("Ali"));
        System.out.println(sb2.capacity());



    }
}
