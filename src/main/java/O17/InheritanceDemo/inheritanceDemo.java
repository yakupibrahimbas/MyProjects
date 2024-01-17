package O17.InheritanceDemo;

public class inheritanceDemo {
    public static void main(String[] args) {
        OgretmenKrediMAnager ogretmenKrediMAnager=new OgretmenKrediMAnager();
        ogretmenKrediMAnager.Hesapla();
        KrediUI krediUI=new KrediUI();
        krediUI.KrediHesapla(new OgretmenKrediMAnager());
        krediUI.KrediHesapla(new AskerKrediManager());

    }
}
