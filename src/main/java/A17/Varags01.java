package A17;

public class Varags01 {
    public static void main(String[] args) {
int sum=toplamaYap(1,2,3,4,5,666,1);
        System.out.println(sum);

    }
//java farklı sayidaki parametrelerin hepsini kabul eden bir yapi olusturdu.
    public static int toplamaYap(int...a){
        int sum=0;
        for (int w:a) {
            sum=sum+w;
        }
        return sum;
    }

}
