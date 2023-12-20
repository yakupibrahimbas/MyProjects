package A20;

public class Student1 {
    /*
    1. Static variable veya static methodlar class member tum objectler icin ortak elemandir
    2. static calss memberlar zuerinde yapilan degisiklikler tum objectleri etkiler
    3.static class memberlar class'a non-stativ class memberlar objectlere monte edilir
    bir classtan 100 tane object olusturdugumuzda non static olarak 100 kere olusturulur.
    ama static olanlar object sayisindan bagimsiz olarak bir kere olusturulur
    4.static class memberlara ulasmak icin object olusturmaya gerek duyulmaz ama non static class memberlara ulasmak icin object olusturmak sarttir.
    5.Static variable larin diger adi class variabledir, non static variable larin diger adi instance variabledir


     */


    public static String stdName="Ali Can";
    public int age=18;
    public static void staticMethod(){
        System.out.println("Ben static methodum");
    }
    public static void nonStaticMethod(){
        System.out.println("Ben static olmayan methodum");
    }



}
