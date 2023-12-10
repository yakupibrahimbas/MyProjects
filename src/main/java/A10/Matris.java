package A10;

public class Matris {
    public static void main(String[] args) {

        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Matrisin elemanlarını toplama
        int toplam = 0;
        for (int satir = 0; satir < matris.length; satir++) {
            for (int sutun = 0; sutun < matris[satir].length; sutun++) {
                toplam += matris[satir][sutun];
            }
        }

        // Toplamı ekrana yazdırma
        System.out.println("Matrisin Elemanlarının Toplamı: " + toplam);
    }
}
