package K20;

import java.util.Arrays;
import java.util.HashSet;

public class K04 {
    public static void main(String[] args) {

        HashSet<String>hs=new HashSet<>();
        System.out.println(hs);
        hs.add("Yakup");
        hs.add("Ali");
        hs.add("Veli");
        hs.add("Musti");
        System.out.println(hs);
        hs.add("Ali");
        System.out.println(hs);

        HashSet<String>hs2=new HashSet<>(Arrays.asList("Yakup","Mami","Onur","Tuba"));
        System.out.println(hs2 );
    }
}
