package O21.Matematik;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner data=new Scanner(System.in);
        System.out.println("Adinizi giriniz");
        String isim=data.nextLine();
        System.out.println("Merhaba "+ isim);
        DortIslem dortIslem=new DortIslem();
        dortIslem.topla(2,3);
        Logaritma logaritma=new Logaritma();

    }

}
