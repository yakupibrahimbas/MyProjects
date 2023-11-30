package K28;

import java.util.*;

public class Sets01 {
    public static void main(String[] args) {

        //HashSet nasil olusturulur?

        HashSet<String> hs = new HashSet<>();
        System.out.println(hs);

        //Hashsete eleman nasil eklenir

        hs.add("Ali");
        hs.add("Veli");
        hs.add("Osman");
        hs.add("Kerem");
        System.out.println(hs);
        hs.add("Ali");
        System.out.println(hs);
        hs.add(null);
        System.out.println(hs);
        System.out.println("---------------");
        HashSet<String> hs2 = new HashSet<>(Arrays.asList("Rukiye", "Muhammed", "Onur", "Tuba"));
        System.out.println(hs2);
        System.out.println("-------------");
        Set<String> hs3 = Set.of("Alex", "Diego", "Rodrigez");
        System.out.println(hs3);
        System.out.println("-------");
        //LinkedHashSet nasil olusturulur?

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(14);
        lhs.add(18);
        lhs.add(5);
        lhs.add(1424234);
        lhs.add(null);
        System.out.println(lhs);
        System.out.println("---------------");

        //retainAll() methodu bir koleksiyondaki ogelerin baska bir koleksiyonla kesisimini gosterir.

        lhs.retainAll(hs);
        System.out.println(lhs);

        System.out.println("---------");

        //TreeSet nasil olusturulur?
        TreeSet<Character>ts=new TreeSet<>();
        ts.add('A');
        ts.add('B');
        ts.add('C');
        ts.add('D');
        ts.add('Z');

        System.out.println(ts);

        System.out.println("----------");
        SortedSet<Character>ss=ts.subSet('A','U');
        System.out.println(ss);



    }
}
