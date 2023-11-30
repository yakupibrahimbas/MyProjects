package K19;

public class K04_MethodOverloading {
    public static void main(String[] args) {

        //Polymorphism-Cok bicimlilik


     // String s="Java";
       // s.substring(int beginIndex); //substring non-static bir metottur.
       // s.substring(int beginIndex,int endIndex); //


add(3,5);


    }
    public static void add(int a,int b ){
        System.out.println(a+b);
    }
    public static void add(int a, double b){
        System.out.println(a+b);
    }
    public static void add(int a, int b,int c){
        System.out.println(a+b);
    }

}
