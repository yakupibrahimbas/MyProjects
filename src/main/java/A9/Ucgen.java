package A9;

public class Ucgen {
    public static void main(String[] args) {
       int n=6;
       for (int i=1;i<=n;i++){
           for (int j=1;j<=(n-1);j++){
               System.out.print(" ");
           }
           for (int k=1;k<=(2*i)-1;k++){
               System.out.print("*");

           }
           System.out.println();
       }
    }
}
