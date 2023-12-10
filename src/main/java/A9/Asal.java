package A9;

public class Asal {
    public static void main(String[] args) {

                System.out.println("1'den 100'e kadar olan asal sayılar:");

                for (int i = 2; i <= 100; i++) {
                    if (isAsal(i)) {
                        System.out.print(i + " ");
                    }
                }
            }

            // Bir sayının asal olup olmadığını kontrol eden metot
            private static boolean isAsal(int sayi) {
                if (sayi < 2) {
                    return false;
                }

                for (int i = 2; i <= Math.sqrt(sayi); i++) {
                    if (sayi % i == 0) {
                        return false;
                    }
                }
                return true;
            }
        }
