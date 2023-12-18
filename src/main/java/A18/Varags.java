package A18;

public class Varags {
    public static void main(String[] args) {

        System.out.println(add());
        System.out.println(add(5));
        System.out.println(add(5,3));
        System.out.println(add(5,3,3,33,313));



    }
    public static int add(int a,int b){
        return a+b;
    }
    public static int add (int a,int b,int c){
        return a+b+c;
    }
    public static int add(int a,int b,int c,int d){
        return a+b+c+d;
    }
    //Create a method able to addition with any number of parameters
    public static int add(int...a){
        int sum=0;
        for (int w:a){
            sum=sum+w;
        }
        return sum;
    }
}
