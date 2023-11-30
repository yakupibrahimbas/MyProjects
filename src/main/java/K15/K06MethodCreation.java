package K15;

public class K06MethodCreation {
    public static void main(String[] args) {

        String isim="BULENT";
        String soyisim="YILMAZ";

        String isimSoyisim=isimDuzenle(isim,soyisim);
        System.out.println("ilk girilen:"+isim+" "+soyisim);
        System.out.println("Degistirilmis hali:"+isimSoyisim);
    }

    private static String isimDuzenle(String isim, String soyisim) {
        String isimDuzenlenmis=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
        String soyisimDuzenlenmis=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase();

        return isimDuzenlenmis + " "+ soyisimDuzenlenmis;
    }
}
