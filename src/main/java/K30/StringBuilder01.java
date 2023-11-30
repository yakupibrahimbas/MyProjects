package K30;

public class StringBuilder01 {
    public static void main(String[] args) {

        //append ( string buildera ekleme yapar)
        //length() StringBuilder 'in uzunlugunu verir.
        //capacity() String Builderin kapasitesini verir.
        //equals() iki StringBuilder'in degerlerini karsilastirir
        //equals () methodu == gibi calisir.


        String str1="Java";
        String str12="Java";

        StringBuilder sb=new StringBuilder("Java9");
        StringBuilder sb1=new StringBuilder("Java1");

        System.out.println(sb.equals(sb1));
        System.out.println(sb==sb1);
        System.out.println(str1.equals(sb.toString()));
        System.out.println(sb.compareTo(sb1));

        //indexOf string builderda istenen karakterin indexini verir.

        sb.replace(1,2,"ali");
        System.out.println(sb);

        //reverse() String builderi tersine cevirir
        


    }
}
