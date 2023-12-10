package A5;

public class StringManipulations03 {
    public static void main(String[] args) {

        String pwd="A12?iKm";
        //it shouldnt be empty
        boolean first=pwd.isEmpty();
        System.out.println(first);
        boolean second=pwd.isBlank();
        System.out.println(second);
        boolean third=pwd.trim().equals(pwd);
        System.out.println(third);
        boolean fourth=pwd.indexOf("i")==4;
        System.out.println(fourth);
        boolean fifth=pwd.lastIndexOf("K")==5;
        System.out.println(fifth);

        if (!first&&second&&third&&fourth&&fifth){
            System.out.println("The password is valid");
        }else {
            System.out.println("The password is invalid");
        }

        if (!first){
            System.out.println("Empty password is not accepted");

        }else if (!second){
            System.out.println("Password needs visible characters");
        } else if (third) {
            System.out.println("Do not use space at the beginning and at the end");
        } else if (fourth) {
            System.out.println("Fifth character should be i");
        } else if (fifth) {
            System.out.println("sixth character should be K");
        }
    }
}
