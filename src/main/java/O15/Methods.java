package O15;

public class Methods {
    public static void main(String[] args) {
  sayiBulmaca();
    }
    public static void sayiBulmaca(){
        int[]sayilar=new int[]{1,2,3,5,7,9};
        int aranacak=5;
        boolean varMi=false;
        for (int sayi:sayilar) {
            if (sayi==aranacak){
                varMi=true;
                break;
            }
        }
        if (varMi){
            System.out.println("Sayi mevcuttur");
        }else {
            System.out.println("Sayi mevcut degildir");
        }
    }
    public static void mesajVer(String mesaj){
        System.out.println("Sayi mevcuttur:"+mesaj);
    }
}
