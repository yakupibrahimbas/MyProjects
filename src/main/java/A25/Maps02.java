package A25;

import java.util.HashMap;

public class Maps02 {
    public static void main(String[] args) {

        HashMap<String ,Integer>stdAges=new HashMap<>();
        stdAges.put("Ali",77);
        stdAges.put("Veli",66);
        stdAges.put("Dogan",55);
        stdAges.put("Berk",44);
        stdAges.put("Mert",33);

        //key tekrarli kullandigimizda hata vermez, en son verilen entryninn degerini kabul eder.
        System.out.println(stdAges);

        stdAges.replace("Dogan",19);
        System.out.println(stdAges);
        stdAges.put("Alez",20);
        System.out.println(stdAges);

        stdAges.replace("Can",33,41);
        System.out.println(stdAges);
        stdAges.putIfAbsent("Can",63);
        System.out.println(stdAges);//put if absent methodu mapte key olarak can yoksa ekler yoksa eklemez

        System.out.println(stdAges.get("Can"));
        System.out.println(stdAges.get("can")); //getOrDefault methodu araann key eger mapte varsa value verir yoksa istediginiz degeri verir

        System.out.println(stdAges.containsValue(63));
        System.out.println(stdAges.containsValue(64)); //containsKey methodu aranan degerin olup olmadigini kontrol eder
        //remove methodu key kullanarak entry silmeye yarar
        stdAges.remove("Can");
        System.out.println(stdAges);



    }
}
