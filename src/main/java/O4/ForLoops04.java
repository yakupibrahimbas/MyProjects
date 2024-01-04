package O4;

public class ForLoops04 {
    public static void main(String[] args) {
        int toplam = 0;

        for (int i = 5; i < 13; i++) {
            toplam=toplam+i;
        }
        System.out.println(toplam+" Toplam");

        int toplam2=0;
        for (int j = 18; j >1 ; j--) {
            toplam2=toplam2+j;
        }
        System.out.println(toplam2);
    }
}
