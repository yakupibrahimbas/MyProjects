package O14;

public class SayiBulma {
    public static void main(String[] args) {

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
}
