package A1;

import java.util.Scanner;

public class Burc {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Hangi ayda dogdugunuzu yaziniz (Ocak-Aralik)");
        int ay = input.nextInt();
        System.out.println("Hangi gun dogdugunuzu yaziniz");
        int gun = input.nextInt();

        if (ay > 0 && ay < 13) {
            if (ay == 1) {
                if (gun < 22) {
                    System.out.println("Burcunuz :Kova");
                } else {
                    System.out.println("Burcunuz :Yengec");
                }
            }
            if (ay == 2) {
                if (gun < 21) {
                    System.out.println("Yengec");
                } else {
                    System.out.println("Basak");
                }
            }

            if (ay == 3) {
                if (gun < 21) {
                    System.out.println("Basak");
                } else {
                    System.out.println("Keci");
                }
            }
            if (ay == 4) {
                if (gun < 21) {
                    System.out.println("Keci");
                } else {
                    System.out.println("Boga");
                }
            }
            if (ay == 5) {
                if (gun < 21) {
                    System.out.println("Boga");
                } else {
                    System.out.println("Solucan");
                }
            }
            if (ay == 6) {
                if (gun < 21) {
                    System.out.println("Solucan");
                } else {
                    System.out.println("Dinozor");
                }
            }
            if (ay == 7) {
                if (gun < 21) {
                    System.out.println("Dinozor");
                } else {
                    System.out.println("Sinek");
                }
            }

        /*
        Koç Burcu
21 Mart- 20 Nisan
Boğa Burcu
21 Nisan – 20 Mayıs
İkizler Burcu
21 Mayıs – 21 Haziran
Yengeç Burcu
22 Haziran – 22 Temmuz
Aslan Burcu
23 Temmuz – 23 Ağustos
Başak Burcu
24 Ağustos – 23 Eylül
Terazi Burcu
24 Eylül – 23 Ekim
Akrep Burcu
24 Ekim – 22 Kasım
Yay Burcu
23 Kasım – 21 Aralık
Oğlak Burcu
22 Aralık – 20 Ocak
Kova Burcu
21 Ocak – 19 Şubat
Balık Burcu

20 Şubat – 20 Mart
*/


        }
    }
}

