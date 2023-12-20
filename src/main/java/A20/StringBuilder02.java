package A20;

public class StringBuilder02 {
    public static void main(String[] args) {

        String a="Money";
        a=a+"More";
        StringBuilder sb1=new StringBuilder();
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());

        sb1.append("Java");
        sb1.append("xxxxxxxxxxxx");
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());


    }
}
