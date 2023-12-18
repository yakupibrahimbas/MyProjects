package A18;

public class Varags02 {
    public static void main(String[] args) {
        System.out.println(toplam(3, 3));

    }
    public static int toplam(int ...b){
        int sum=0;
        for (int w:b){
            sum=sum+w;
        }
        return sum;
    }
}
