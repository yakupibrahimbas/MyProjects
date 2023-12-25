package A26;

public class Exceptions01 {
    public static void main(String[] args) {

        String s="Java";
        getCharFromString(s,2);
        getCharFromString(s,4);


    }
    public static void getCharFromString(String s,int idx){
        try {
            char ch=s.charAt(idx);
            System.out.println(ch);
        } catch (Exception e) {
            System.err.println("Olmayan index girdiniz "+e.getMessage());;
            System.out.println(e.getCause());
          //  e.printStackTrace();
            System.out.println("catch block ici ");
        }
    }
}
