package K26.K26_4;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set01 {
    public static void main(String[] args) {

        /*

       1)setler tekrarsiz eleman depolamak icin kullanilirlar
       2)3 tane Set Class vardir
       a)HashSet Class

        Hash benzersiz id olusturma teknigidir. Bu teknige Hashing technique denir.
        HAshSet elemanlari rastgele siralar
        HashSet elemanlari siralamadiginda cok hizkli calisir.
        Hashsetler null i eleman kabul eder

        b)LinkedHashSet Class

        LinkedHashset ler elemanlari sizin verdiginiz siraya gore dizdiklerinden Hashsetlere göre yavaştır

        c)TreeSet Class
        TreeSet elemanlari natural order a gore dizerler. Bu nedenle cok yavastirlar.
        En yavas settir.

        3)TreeSet cok yavas oldugundan mumkun oldukca kullanilmamayaa calisiilmalidir.


         */

        HashSet<String > hs=new HashSet<>();
        hs.add("Sinan");
        hs.add("Kerem");
        hs.add("Onur");
        hs.add("Tuba");
        System.out.println(hs);

        hs.add("Tuba");
        System.out.println(hs);
        //Tekrarli elemanlari eklerken hata vermez ama sadece bir kere ekler
        //Hashsetler elemanlari rastgele siralar
        hs.add(null);
        hs.add(null);
        System.out.println(hs);

        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        lhs.add(313);
        lhs.add(21);
        lhs.add(3333);
        lhs.add(5555);
        lhs.add(66666);
        lhs.add(null);
        System.out.println(lhs);


        LinkedHashSet<Integer> ls=new LinkedHashSet<>();
        ls.add(313);
        ls.add(111);
        ls.add(1111);
        ls.add(11111);

        lhs.retainAll(ls);
        System.out.println(ls);


        //LinkedHashSet bizim verdigimiz siraya gore elemanlari dizeler. Bu yüzdennde Hashsete gore yavastir


        TreeSet<Character >ts=new TreeSet<>();
        ts.add('G');
        ts.add('A');
        ts.add('B');
        ts.add('N');
        ts.add('M');
        System.out.println(ts);
        //TreeSetler ekledigimiz elemanlari siraya gore koyarlar.
        //TreeSetlere null konulamaz.

        System.out.println(ts.subSet('G', 'U'));


    }
}
