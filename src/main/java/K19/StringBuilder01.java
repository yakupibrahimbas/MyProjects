package K19;

public class StringBuilder01 {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder();
        sb1.append("Java");
        sb1.append("xxxxxxxxxxxxxxx");
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());

        StringBuilder sb2=new StringBuilder(3);
        System.out.println(sb2.append("Alis"));
        System.out.println(sb2.capacity());
        StringBuilder sb4=new StringBuilder("Java is easy");
        System.out.println(sb4);
        sb4.reverse();
        System.out.println(sb4);
        sb4.deleteCharAt(1);
        System.out.println(sb4);
        sb4.delete(0,2);
        System.out.println(sb4);
        sb4.replace(0,2,"Hasan");
        System.out.println(sb4);
        sb1.insert(2,"34");
        System.out.println(sb1);

        StringBuilder sb5=new StringBuilder("Java");
        StringBuilder sb6=new StringBuilder("Java");
        int result=sb5.compareTo(sb6);
        System.out.println(result);

        String str=sb1.toString().toUpperCase();
        System.out.println(str);
        String str2=sb1.toString().toUpperCase();
        System.out.println(str2);

        StringBuilder newSb1=new StringBuilder(str);
        System.out.println(newSb1);



    }


}
