package A11;

public class ForLoop02 {
    public static void main(String[] args) {

            String t="Ali Can";
            String ters="";
            for (int i=t.length()-1;i>=0;i--){
                ters=ters+t.charAt(i);
            }

        System.out.println(ters);


    }

}
