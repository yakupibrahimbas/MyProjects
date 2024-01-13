package O13;

public class Arrays {
    public static void main(String[] args) {

        String ogrenci1="Engin";
        String ogrenci2="Veli";
        String ogrenci3="Nur";
        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println("=========================");

        String[] ogrenciler=new String[5];
        ogrenciler[0]="Engin";
        ogrenciler[1]="Derin";
        ogrenciler[2]="Salih";
        ogrenciler[3]="Alex";
        ogrenciler[4]="Diego";

        for (int i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }

        System.out.println("==========");
        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }


    }
}
