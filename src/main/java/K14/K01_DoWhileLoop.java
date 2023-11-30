package K14;

public class K01_DoWhileLoop {
    public static void main(String[] args) {
     int i=10;
        System.out.println("Dongu basladi");
     /*
      while (i<=5){
            System.out.println(i);
            i++;
        }
        System.out.println(" \n Dongu bitti");
        */
        do {
            System.out.println(i+",");
        }while (i<=5);
        System.out.println("\nDongu bitti");

    }

}
