package O5;

public class WhileLoops01 {
    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {
            System.out.println(i);
        }
        System.out.println("*************");
        int i=1;
        while (i<=5){
            System.out.println(i);
            i++;

        }
        System.out.println("*************");

        int k=10;
        while (k>0){
            System.out.println(k);
            k--;
        }
        System.out.println("*************");

        int m=50;
        while (m>0){
            m--;
            if (m%2==0){
                System.out.println(m);

            }
        }
        System.out.println("*************");

        String s="Java kolaydir";
        int n=s.length()-1;
        while (n>-1){
            System.out.print(s.charAt(n));
           n--;
        }
    }
}
