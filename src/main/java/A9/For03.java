package A9;

public class For03 {
    public static void main(String[] args) {
        int sayi = 1;
        int toplam = 0;

        while (sayi <= 50) {
            toplam += sayi;
            sayi++;
        }

        System.out.println("1'den 50'ye kadar olan sayıların toplamı: " + toplam);
    }
}