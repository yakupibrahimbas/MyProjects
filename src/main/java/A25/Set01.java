package A25;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set01 {
    public static void main(String[] args) {

        /*Setler  tekrarsiz eleman depolamak icin kullanilir
       3 tane classi vardir
        a)HashSet Class
        Hash benzersiz id olusturma teknigidir. Bu teknige Hashing technique denir
        Hashset elemanlari siralamadigindan cok hizli calisir
        Hashsetler null i eleman kabul eder

        b)LinkedHashSet Class
        LinkedHashSetler elemanlari sizin verdiginiz siraya gore dizdiklerinden Hashsetlere gore yavas
        3)treeSet cok yavas oldugu icin mumkun oldugu kadar TreeSet kullanmamaya calsiiriz


         */

        HashSet<String>hs=new HashSet<>();
        hs.add("Sinan");
        hs.add("Kerem");
        hs.add("Tuba");
        hs.add("Onur");
        System.out.println(hs);//elemanlari rastgele siralar
        hs.add("Tuba");
        System.out.println(hs);//tekrarli elemanlari eklerken hata vermez ancak bir kez ekler

        LinkedHashSet<Integer>lhs=new LinkedHashSet<>();
        lhs.add(313);
        lhs.add(22);
        lhs.add(33);
        lhs.add(44);
        lhs.add(null);
        System.out.println(lhs);
        LinkedHashSet<Integer>ls=new LinkedHashSet<>();
        ls.add(313);
        ls.add(10);
        ls.add(20);
        ls.add(30);
        ls.add(null);
        System.out.println(ls);

        lhs.retainAll(ls);
        System.out.println(lhs);
        System.out.println(ls);

        TreeSet<Character>ts=new TreeSet<>();
        ts.add('G');
        ts.add('a');
        ts.add('r');
        ts.add('a');
        ts.add('b');
        System.out.println(ts);
        System.out.println(ts.subSet('G', 'U'));
    }

}
