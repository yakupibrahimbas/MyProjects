package A31;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        //kullanici ay ismini girdiginde o ayin kac gun cektigini yazan bir program yaziniz

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bir ay giriniz");
        String  ay= input.next().toLowerCase();
        switch (ay){
            case "ocak":
            case "mart":
            case "mayis":
            case "temmuz":
            case "agustos":
            case "ekim":
            case "aralik":
                System.out.println("Bu ay 31 gun ceker");
            case "nisan":
            case "haziran":
            case "eylul":
            case "kasim":
                System.out.println("Bu ay 30 gun ceker");
            case "subat":
                System.out.println("Bu ay 28 gun veya 29 gun ceker");
            default:
                System.out.println("Lutfen gecerli bir gun giriniz");



        }

    }
}
