package A18;

public class PassByValue {
    public static void main(String[] args) {
        int n=5;
        int m=7;
       int sum= add(5,7);

    }
    public static int add(int...a){
        int sum=0;
        for (int w:a){
            sum=sum+w;
        }
        return sum;
    }
}
