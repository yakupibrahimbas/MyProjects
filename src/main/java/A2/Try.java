package A2;

public class Try {
    //handling exceptions
    //Compile time error
    //javada exceptions cok tehlikelidir.Calisma durursa...
    //exceptions olusmasi muhtemel durumlari iyi analiz etmeliyiz ve javaya bu durumu belirtmeliyiz.
    //Javada Exceptionu kontrol altina almak icin try -catch bloklari ile cevrelemek gerekir...
    //catch blogu hataa ciktiginda yapilmasi gerekeni yazilan yer
    //birden fazla exceptions olusma ihtimali varsa tumunu handle etmemiz gerekir.
    //finally blogu varsa her durumda calsiir (exceptions varsa da yuoksada)


    public static void main(String[] args) {
     /*   System.out.println("Program basladi");
        int a=0;
        try {
            a=2/0;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println(a);
        System.out.println("Program bitti"); */

        int[]arr=new int[3];
        try {
            arr[4]=10;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
        }

        System.out.println("Program bitti");




    }



}
