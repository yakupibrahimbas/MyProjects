package A19;

public class Sb02 {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Java is easy");
        System.out.println(sb1);
        sb1.reverse();
        System.out.println(sb1);
        //verilen indexteki karakteri siler
        System.out.println(sb1.deleteCharAt(0));
        sb1.delete(0,3);
        System.out.println(sb1);
        System.out.println(sb1.replace(0, 2, "XXXX"));
        System.out.println(sb1.insert(2, "777"));

        StringBuilder sb2=new StringBuilder("Kava");
        StringBuilder sb3=new StringBuilder("Jva");
        int result= sb2.compareTo(sb3);
        System.out.println(result);

        //CompareTo() iki stringbuilder i bastan baslayarak harf harf karsilastirir
        //ilk harf ayni ise ikincilere gecer, ikinciler ayni ise ucunculere gecer

        //StringBuilder nasil stringe cevrilir?

       String str= sb2.toString().toUpperCase();
       StringBuilder newSb1=new StringBuilder(str);
        System.out.println(newSb1);


        //StringBuffer javada string ureten bir diger classdir
        //StringBuffer javanin string uretmek icin olusturdugu ilk classtir
        //StringBuffer stringbuildera cok benzer yani ikiside mutable string uretir
        //STringBuffer multithread dir ama StringBuilder multi-thread degildir.
        //Stringbuilder multithread olmadigi icin string bufferdan daha hizli calisir
        //multi-thread yapilirken siralama onem arzeder
        //ypilan islemleri mantikli bir siraya koymak synchronization olarak adlandirilir


        //STringBuffer nasil olusturulur?
        StringBuffer sbf=new StringBuffer("Javam");
        System.out.println(sbf);




    }
}
