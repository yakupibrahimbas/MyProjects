package A11;

import java.util.Scanner;

public class DoWhileLoop02 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int counter=0;

        do {
            if (counter==4){
                System.out.println("Hesabiniz bloke olmustur");
                break;
            }
            System.out.println("Lutfen usernameyi giriniz");
            String userName=input.next();
            System.out.println("Lutfen pasaportu giriniz");
            String password=input.next();
            if (userName.equals("admin")&&password.equals("pwd123")){
                System.out.println("Hesabiniza hos geldiniz");
                break;
            }
            counter++;

        }while (true);
    }
}
