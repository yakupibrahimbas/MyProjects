package O1;

public class String02 {
    public static void main(String[] args) {

        String s1="Testi al kendini gor";
        System.out.println(s1.endsWith("r"));
        System.out.println(s1.endsWith(""));
        System.out.println("Ali".equals("Ali"));

        //Buyuk olan heap memory -- kucuk olan stack memory

        System.out.println("Ali".equalsIgnoreCase("ALI"));//true
        System.out.println(s1.indexOf('i'));
        System.out.println(s1.indexOf('T'));
        System.out.println(s1.indexOf("ti"));
        //indexOf methodu olmayan karakterler icin -1 return eder
        System.out.println(s1.indexOf(""));//0
        System.out.println(s1.indexOf("q"));//-1
        String s2="Cabuk ogrenilen cabuk unutulur";
        System.out.println(s2.indexOf('a', 6));
        String s3="Tekrar et tekrar unutma";
        System.out.println(s3.isEmpty());
        System.out.println("".isEmpty());
        System.out.println(s3.lastIndexOf('e'));
        System.out.println(s3.lastIndexOf("rar"));
        System.out.println(s3.replace('e', 'E'));
        System.out.println(s3.replace('X', 'M'));
    }
}
