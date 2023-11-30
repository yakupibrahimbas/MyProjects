package K18;

public class K04 {

    public static void main(String[] args) {

        int sonuc=toplama();
        System.out.println("sonuc:"+sonuc);

    }
    public static int toplama(int a,int b,int c){
        return a+b+c;



    }
    public static int toplama(int...a){
        int sum=100;
        for(int w:a){
            sum=sum+w;
        }
        return sum;
    }
}
