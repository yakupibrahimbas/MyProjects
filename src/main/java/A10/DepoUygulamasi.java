package A10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Urun {
    String ad;
    int stok;

    public Urun(String ad, int stok) {
        this.ad = ad;
        this.stok = stok;
    }
}

class Depo {
    List<Urun> urunler = new ArrayList<>();

    void urunEkle(Urun urun) {
        urunler.add(urun);
    }

    void urunListele() {
        System.out.println("Depodaki Ürünler:");
        for (Urun urun : urunler) {
            System.out.println("Ürün Adı: " + urun.ad + ", Stok: " + urun.stok);
        }
    }

    void urunStokKontrol(String urunAdi) {
        for (Urun urun : urunler) {
            if (urun.ad.equals(urunAdi)) {
                System.out.println("Stok: " + urun.stok);
                return;
            }
        }
        System.out.println("Ürün bulunamadı.");
    }
}

public class DepoUygulamasi {
    public static void main(String[] args) {
        Depo depo = new Depo();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Ürün Ekle");
            System.out.println("2. Ürünleri Listele");
            System.out.println("3. Stok Kontrolü Yap");
            System.out.println("4. Çıkış");
            System.out.print("Seçiminiz: ");

            int secim = scanner.nextInt();
            scanner.nextLine(); // Boş satırı oku

            switch (secim) {
                case 1:
                    System.out.print("Ürün Adı: ");
                    String urunAdi = scanner.nextLine();
                    System.out.print("Stok: ");
                    int stok = scanner.nextInt();
                    scanner.nextLine(); // Boş satırı oku
                    Urun yeniUrun = new Urun(urunAdi, stok);
                    depo.urunEkle(yeniUrun);
                    System.out.println("Ürün eklendi.\n");
                    break;
                case 2:
                    depo.urunListele();
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Ürün Adı: ");
                    String kontrolUrunAdi = scanner.nextLine();
                    depo.urunStokKontrol(kontrolUrunAdi);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Çıkış yapılıyor...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Geçersiz seçim. Tekrar deneyin");
            }}}}