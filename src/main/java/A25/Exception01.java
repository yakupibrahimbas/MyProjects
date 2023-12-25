package A25;

public class Exception01 {
    public static void main(String[] args) {
        /*
        Exception beklenmedik problem demektir. Java cozemedigi bir sorunla karsilastiginda exception classi devreye girer
        java exception firlattiginda kodun calismasini durdurur. bizden bir karar vermemizi bekler
        yazdiginiz kod calismadiginda problemi bulmak icin loglara bakariz
        exceptionu handle edebilmek icin 2 yontem vardir



         */
divide(12,3);
divide(11,0);
divide2(3,0);

    }
    public static void divide2(int a,int b){
        try {
            System.out.println(a/b);
        }catch (ArithmeticException e){ //matematiksel islemde alinabilecek bir exceptiondur
            System.out.println("Dont divide by zero");
        }
    }


    //tavsiye edilmeyen yontem
    public static void divide(int a,int b){
        if (b==0){
            System.out.println("Dont divide by zero");
        }else {
            System.out.println(a/b);
        }


    }

}
