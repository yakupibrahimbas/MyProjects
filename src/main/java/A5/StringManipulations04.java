package A5;

public class StringManipulations04 {
    public static void main(String[] args) {

        //shirtPrice=$12.99; bookPrice=$35.99


        String shirtPrice="$12.99";
        String bookPrice="$35.99";


        //firs step: remove currency symbols or characters different from digits and .
       String newShirtPrice= shirtPrice.replaceAll("[^0-9.]","");
        System.out.println(newShirtPrice);
       String newBookPrice= bookPrice.replaceAll("[^0-9.]","");
        System.out.println(newBookPrice);



        double doubleShirtPrice=Double.valueOf(newShirtPrice);
        System.out.println(doubleShirtPrice);
        double doubleBookPrice=Double.valueOf(newBookPrice);
        System.out.println(doubleBookPrice);
        System.out.println("Total price:"+doubleBookPrice+doubleShirtPrice);


    }
}
