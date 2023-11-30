package K13;

public class K02_Ternary {
    public static void main(String[] args) {
        String isim="";
        int sayi=10;
        isim=sayi>20?"Ayse":"Aysegul";
        System.out.println(isim);

        //----------------------

        isim=sayi>50?(sayi>80?"Ayse":"Busra"):("Kubra");
        System.out.println(isim);


    }
}
