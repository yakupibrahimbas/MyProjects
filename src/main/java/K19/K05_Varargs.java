package K19;

public class K05_Varargs {
    public static void main(String[] args) {

        int sonuc=toplama(3,7,10,10);
        System.out.println(sonuc);


    }

 /*   public static int toplama(int a,int b){
        return a+b;
    }
    public static int toplama(int a,int b,int c){
        return a+b+c;
    } */
    public static int toplama(int...a){
        int sum=0;
        for (int w:a){
            sum=sum+w;
        }
        return sum;
    }

}
