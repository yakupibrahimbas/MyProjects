package O5;

import java.util.Scanner;

public class ForLoops11 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir yazi giriniz");
        String yazi=scan.nextLine();

        for (int i=yazi.length()-1;i>=0;i--){
            System.out.print(yazi.charAt(i));
        }
        scan.close();
    }
}
