package A2;

import java.util.Scanner;

public class Exceptions02 {
    public static void main(String[] args) {
        int x=1;

        do {



        try {
            Scanner input=new Scanner(System.in);
            System.out.println("Enter firs num:");
            int n1=input.nextInt();
            System.out.println("Enter second num:");
            int n2=input.nextInt();
            int sum=n1/n2;
            System.out.println(sum);
            x=2;
        }
catch (Exception e){
    System.out.println("You cant do that");
}

        }while (x==1);


    }
}
