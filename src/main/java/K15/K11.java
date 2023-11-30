package K15;

public class K11 {

    public static void puanYazdir(String kullaniciAdi,int puan){
        System.out.println(kullaniciAdi+" İsimli kullanicinin puani:"+puan);
    }
    public static void puanYazdir(String kullaniciAdi){
        System.out.println(kullaniciAdi+"isimli kullanicinin puani:0");
    }

    public static void main(String[] args) {
        puanYazdir("fosforat",20);
    }
}
