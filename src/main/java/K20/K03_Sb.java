package K20;

public class K03_Sb {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Java is easy");
        System.out.println(sb1);

        sb1.reverse();
        System.out.println(sb1);

        sb1.deleteCharAt(1);
        System.out.println(sb1);

        sb1.delete(0,2);
        System.out.println(sb1);

        sb1.replace(0,2,"Hasan");
        System.out.println(sb1);

        sb1.insert(2,34);
        System.out.println(sb1);

        StringBuilder sb2=new StringBuilder("Java");
        StringBuilder sb3=new StringBuilder("Kava");
        int result=sb2.compareTo(sb3);
        System.out.println(result);

        String str=sb1.toString().toUpperCase();
        System.out.println(str);

        StringBuilder newSb1=new StringBuilder(str);
        System.out.println(newSb1);




    }
}
