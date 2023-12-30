package A30;

public class ReviewTernary {
    public static void main(String[] args) {

        String pwd="222";
        String isvalid=(pwd.length()>8)?(pwd.charAt(0)=='i'?"valid password":"invalid password"):(pwd.charAt(0)=='K'?"Valid password":"invalid password");//length method returns the number of characters in a String
        System.out.println(isvalid);
    }
}
