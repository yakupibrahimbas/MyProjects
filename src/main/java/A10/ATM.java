package A10;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        String islemSecenekleri="Bakiye gorunuleme-->1" +
                "+Para cekmek-->2" +
                "+Farklı hesaba girmek icin-->3" +
                "+Uygulamadan cikmak icin-->q tusuna basiniz";

        Scanner scanner=new Scanner(System.in);

        double bilalBakiye=2540;
        String bilalIBAN="TR1234 564 565 565 125 3366 66 99 ";
        String bilalKullanici="bilal12";
        String bilalSifre="123";

        double enesBakiye=1200;
        String enesIBAN="TR1224 323 434 565 866 8888 77 22 ";
        String enesKullanici="enes14";
        String enesSifre="456";

        //bilal kullanici adi bilal12-sifre 123 enes enes14---sifre 456

        System.out.println("Atm ye hos geldiniz");
        System.out.println("Lutfen bilgilerinizi giriniz");

        System.out.print("Kullanici adi:");
        String kullaniciAdi=scanner.nextLine();
        System.out.print("Sifre:");
        String sifre=scanner.nextLine();

        if (kullaniciAdi.equals("bilal12")&&sifre.equals("123")){
            System.out.println("Bilal hesabina giris yapildi");
            System.out.println(islemSecenekleri);
            System.out.println("Lutfen bir secim yapiniz");
            String secim=scanner.nextLine();

            switch (secim) {

                case "1":
                    System.out.println("Bakiyeniz:"+bilalBakiye);
                    break;
                case "2":
                    System.out.println("Cekmek istediginiz tutari giriniz: ");
                    int cekilecekTutar=scanner.nextInt();
                    if (bilalBakiye>=cekilecekTutar){
                        bilalBakiye-=cekilecekTutar;
                        System.out.println("Kalan tutar:"+bilalBakiye);

                    }else {
                        System.out.println("Bakiyenizden fazla para cekemezsiniz");
                    }
                    break;
                case"3":
                    System.out.println("Ne kadar yatirmak istiyorsunuz:");
                    int yatirilacakTutar=scanner.nextInt();
                    if (yatirilacakTutar<=bilalBakiye){

                        System.out.println("İban giriniz: ");
                        String yatirilacakIBAN=scanner.nextLine();
                        if (yatirilacakIBAN.equals(enesIBAN)){
                            System.out.println("Para enes'e yatiriliyor");
                            bilalBakiye-=yatirilacakTutar;
                            enesBakiye+=yatirilacakTutar;

                        }
                    }
                    break;


            }




        } else if (kullaniciAdi.equals("enes14")&&sifre.equals("456")) {
            System.out.println("Enes hesabina giris yapildi");
            System.out.println(islemSecenekleri);


        }else {
            System.out.println("Kullanici adiniz veya sifreniz yanlis!");
        }




    }
}
