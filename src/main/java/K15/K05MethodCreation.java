package K15;

public class K05MethodCreation {
    public static void main(String[] args) {

        boolean uyeMi=true;
        int uyelikYili=3;
        double satisFiyati=250;
        indirimliFiyatHesapla(uyeMi,uyelikYili,satisFiyati);


    }

    public static void indirimliFiyatHesapla(boolean uyeMi,int uyelikYili,double satisFiyati){
        if (uyeMi){
            if (uyelikYili<5){
                System.out.println("Urun Fiyati:"+satisFiyati);
                System.out.println("Indirim miktari:"+satisFiyati*0.05);
                System.out.println("Indirimli fiyat:"+(satisFiyati-satisFiyati*0.1));
            }else {
                System.out.println("Urun Fiyati:"+satisFiyati);
                System.out.println("Indirim miktari:"+satisFiyati*0.15);
                System.out.println("Indirimli fiyat:"+(satisFiyati-satisFiyati*0.15));
            }
        }else {
            System.out.println("Urun Fiyati:"+satisFiyati);
            System.out.println("Indirim miktari:"+satisFiyati*0.05);
            System.out.println("Indirimli fiyat:"+(satisFiyati-satisFiyati*0.05));
        }
    }
}
