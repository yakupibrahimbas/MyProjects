package O8;

public class MethodCreation01 {
    public static void main(String[] args) {
//static methodun icinde kullanilan hersey static olmalidir
        //parametreleri farkli yapmanin 3 yontemi var
        //parametrelerin data typelarini degistirebilirsiniz
        //

        toplama(3, 2);
        toplama(3.5, 2.8);
        carpma(3,8);
        carpma2(10,5,5);


    }

    public static void toplama(double a, double b) {
        System.out.println(a + b);


    }

    public static void carpma(double a, double b) {
        System.out.println(a * b);
    }
    public static void carpma2(double a, int b,double c) {
        System.out.println(a * b*c);
    }
}