package A6;

public class ForLoops04 {
    public static void main(String[] args) {

        /*
        XXXXX
        XXXXX
        XXXXX
        */
        int row=2;
        int column=5;
        for (int i=1;i<=row;i++){
            String s="";
            for (int k=1;k<=column;k++){
                s=s+"X";
            }
            System.out.println(s);
        }
    }
}
