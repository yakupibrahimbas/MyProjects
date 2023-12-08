package A1;

import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen dogum tarihinizi giriniz");
        int dTarih= input.nextInt();
        int result=dTarih%12;

        switch (result){
            case 1:
                result=0;
                System.out.println("keci");
                break;
            case 2:
                result=1;
                System.out.println("at");
                break;
            case 3:
                result=2;
                System.out.println("inek");
                break;
            case 4:
                result=3;
                System.out.println("dinozor");
                break;
            case 5:
                result=4;
                System.out.println("manda");
                break;
            case 6:
                result=5;
                System.out.println("kopek");
                break;
            case 7:
                result=6;
                System.out.println("koyun");
                break;
            case 8:
                result=7;
                System.out.println("sinek");
                break;
            case 9:
                result=8;
                System.out.println("sivrisinek");
                break;
            case 10:
                result=9;
                System.out.println("yilan");
                break;
            case 11:
                result=10;
                System.out.println("kurbaga");
                break;
            case 12:
                result=11;
                System.out.println("tavsan");


        }

    }
}
