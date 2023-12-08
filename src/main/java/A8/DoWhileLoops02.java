package A8;

import java.util.Scanner;

public class DoWhileLoops02 {
    public static void main(String[] args) {

        // username is admin password is p12
        Scanner input=new Scanner(System.in);


        int counter=0;

        do {
            if (counter==3){
                System.out.println("Your account is blocked");
                break;
            }
            System.out.println("Enter your username");
            String u=input.next();
            System.out.println("Enter your password");
            String p=input.next();
            counter++;

            if (u.equals("admin")&&p.equals("p12")){
                System.out.println("you are in your account...");
                break;
            }
        }while (true);
    }
}
