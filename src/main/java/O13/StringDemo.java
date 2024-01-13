package O13;

public class StringDemo {
    public static void main(String[] args) {

        String mesaj="Bugun hava cok guzel.";
        System.out.println(mesaj);


        System.out.println("Eleman sayisi:"+mesaj.length());
        System.out.println("5.eleman: "+mesaj.charAt(4));
        System.out.println(mesaj.concat("Yasasin!"));
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("n"));
        char[]karakterler=new char[5];
        mesaj.getChars(0,4,karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('a'));
        System.out.println(mesaj.lastIndexOf("e"));

        String yeniMesaj=mesaj.replace(' ','-');
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2,4));
        for (String kelime:mesaj.split(" ") ){
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());

    }
}
