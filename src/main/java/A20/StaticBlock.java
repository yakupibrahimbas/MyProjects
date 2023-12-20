package A20;

import java.time.LocalDate;
import java.time.LocalTime;

public class StaticBlock {

    //Bir variable olusturdugunuzda deger atamazsaniz o variablei initialize etmediniz demektir
    //Gerekesinimlere gore bazen main method calistirtilmadan 0once variablelarinb hazir hale getirilmesi gerekir

   public static int price=1000;
   static {
       LocalDate currentDate=LocalDate.now();
       if (currentDate.getMonthValue()==8){
           price=1000;
       }else {
           price=2000;
       }
   }
    static {

    }
    public static void main(String [] args){

        System.out.println("main method");

    }
    static {

        System.out.println("static block 1");
    }
}
