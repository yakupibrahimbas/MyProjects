package A8;

public class Example01 {
    public static void main(String[] args) {
//String (Class) data tipi cumleler,kelimeler,semboller,rakamlar icerebilir;
        //Ornek 1: "s" String'inde kullanilan karakter sayisini bulunuz
        //length() method'u String'in uzunlugunu dondurur

        String s="Java is easy";
        System.out.println(s.length());
        System.out.println("**********");

        //Ornek 2: "s" String'inde ilk ve son indexteki karakterleri aliniz
        //s.charAt() methodu belirtilen indexte yer alan karakteri dondurmek icin kullanilir
        //index 0 tabanli

        String  y="Yakup naber canım";
        System.out.println(y.charAt(0));
        System.out.println(y.charAt(y.length() - 1));

        //Ornek 3: "s" String'indeki ilk 4 karakteri aliniz
        //substring(int beginIndex, int endIndex) methodu belirtilen index araligini dondurur
        //substring(0,4) ==> 0 yani ilk index dahil, 4 yani ikinci index harictir.

        String sub1 = s.substring(0, 4);
        System.out.println(sub1);
        // Java
//Ornek 4: "s" String'indeki "is" kelimesini aliniz // Java is easy
        String sub2 = s.substring(4, 8);
        System.out.println(sub2);//is

        boolean isExist=y.contains("naber");
        System.out.println(isExist);



    }
}
