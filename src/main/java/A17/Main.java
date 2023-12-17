package A17;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class RandevuSistemi {
    private Map<String, Boolean> randevular;

    public RandevuSistemi() {
        randevular = new HashMap<>();
    }

    public void randevuAl(String hastaAdi) {
        if (randevular.containsKey(hastaAdi)) {
            System.out.println("Bu hasta zaten bir randevu almış.");
        } else {
            randevular.put(hastaAdi, true);
            System.out.println(hastaAdi + " adlı hasta için randevu oluşturuldu.");
        }
    }

    public void randevuIptal(String hastaAdi) {
        if (randevular.containsKey(hastaAdi)) {
            randevular.remove(hastaAdi);
            System.out.println(hastaAdi + " adlı hasta için randevu iptal edildi.");
        } else {
            System.out.println("Bu hasta için randevu bulunamadı.");
        }
    }

    public void randevuListele() {
        System.out.println("Randevu Listesi:");
        for (String hasta : randevular.keySet()) {
            System.out.println(hasta);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        RandevuSistemi randevuSistemi = new RandevuSistemi();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Randevu Al");
            System.out.println("2. Randevu İptal");
            System.out.println("3. Randevu Listele");
            System.out.println("4. Çıkış");
            System.out.print("Seçiminiz: ");

            int secim = scanner.nextInt();
            scanner.nextLine(); // Dummy line to consume the newline character

            switch (secim) {
                case 1:
                    System.out.print("Hasta Adı: ");
                    String hastaAdi = scanner.nextLine();
                    randevuSistemi.randevuAl(hastaAdi);
                    break;
                case 2:
                    System.out.print("Hasta Adı: ");
                    String iptalAdi = scanner.nextLine();
                    randevuSistemi.randevuIptal(iptalAdi);
                    break;
                case 3:
                    randevuSistemi.randevuListele();
                    break;
                case 4:
                    System.out.println("Programdan çıkılıyor...");
                    System.exit(0);
                default:
                    System.out.println("Geçersiz bir seçim yaptınız. Tekrar deneyin.");
            }
        }
    }
}
