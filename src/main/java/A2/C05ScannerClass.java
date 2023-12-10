package A2;

import java.util.Scanner;

public class C05ScannerClass {
    public static void main(String[] args) {
        //Example: Type code gets mile from user then converts it to kilometers
        //1 mile is 1.6 km

        Scanner input=new Scanner(System.in);
        System.out.println("Enter mile value to convert to kilometer");
        double mile= input.nextDouble();
        System.out.println("mile is "+mile*1.6+"km");
    }
}
