package A8;

import java.util.Scanner;

public class DoWhileLoops01 {
    public static void main(String[] args) {

        //Ask user to enter an integer
        //If the integer is less than 100, tell user Won
        //Otherwise ,tell user "lost"

       Scanner input=new Scanner(System.in);
        int i=0;
      /*   do {

            System.out.println("Enter an integer");
            i=input.nextInt();
            if (i<100){
                System.out.println("Won");

            }
        }while (i<100);
        System.out.println("Lost");   */

        //2.way
        int k=0;
        do {
            System.out.println("Enter an integer...");
            k=input.nextInt();
            if (k>99){
                System.out.println("Lost");
                break;
            }else {
                System.out.println("Won");
            }
        }while (true);


    }
}
