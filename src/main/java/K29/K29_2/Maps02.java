package K29.K29_2;

import java.util.HashMap;

public class Maps02 {
    public static void main(String[] args) {

        HashMap<String,Integer>stdAges=new HashMap<>();
        stdAges.put("Ali",77);
        stdAges.put("Veli",66);
        stdAges.put("Mert",55);
        stdAges.put("Alex",44);
        stdAges.put("Diego",33);
        stdAges.put("Vara",22);

        stdAges.put("Ali",18);
        System.out.println(stdAges);

        stdAges.replace("Veli",20);
        System.out.println(stdAges);

        //replace ()ethodu value ları keyleri kullanarak update etmeye yarar.

        stdAges.replace("Mert",55,41);
        System.out.println(stdAges);

        stdAges.putIfAbsent("Can",20);
        System.out.println(stdAges);

        //get methodu aranan key eger mapte varsa value verir. yok ise null verir.
        System.out.println(stdAges.get("Ali Can"));
        System.out.println(stdAges.getOrDefault("Vara",30));
        System.out.println(stdAges.containsValue(44));
        System.out.println(stdAges.containsKey("Vara"));

        //containskey methodu keylerin ivcinde aranan bir degerin olup olmadigini kontrol eder.


        stdAges.remove("Vara");
        System.out.println(stdAges);


    }
}
