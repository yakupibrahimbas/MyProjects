package K29;

import java.util.HashMap;

public class Maps02 {
    public static void main(String[] args) {

        HashMap<String,Integer>stdAges=new HashMap<>();
        stdAges.put("Ali",20);
        stdAges.put("Burcu",30);
        stdAges.put("Murat",40);
        stdAges.put("Abdullah",50);
        stdAges.put("Hamza(r.anh)",100);

        //keyi tekrarli kullandiginizda hata vermiyordu ama bu sekilde yapmak best practice degildir.
        stdAges.put("Tom",22);
        System.out.println(stdAges);
        stdAges.replace("Tom",70);
        System.out.println(stdAges);

        //replace() methodu valueleri keyleri kullanarak update etmeye yarar
        //

        stdAges.replace("Tom",39);
        System.out.println(stdAges);

        //replace methodu eski deger kontrolu yaparakta calisir
        stdAges.replace("Tom",39,45);
        System.out.println(stdAges);
        System.out.println("--------");
        stdAges.putIfAbsent("Tom",77);
        System.out.println(stdAges);
        stdAges.putIfAbsent("Ayse",33);
        System.out.println(stdAges);
        System.out.println(stdAges.get("Tom"));
        System.out.println(stdAges.getOrDefault("Tom",-1));
        System.out.println(stdAges.get("Jery"));
        System.out.println(stdAges.getOrDefault("Jery",-1));

        //containsKey() metodu Mapte bir key olup olmadigini kontrol eder
        //containsValue()metodu ise map te value olup olmadigini kontrol eder.
        Boolean b=stdAges.containsValue(19);
        System.out.println(b);


    }
}
