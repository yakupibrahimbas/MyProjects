package A26;

public class E06 {
    public static void main(String[] args) {

        int a=12;
        int b=0;
        int c[]={1,2,3,4,};
        getNumberFromIntArray(c,a,b);
    }
    public static void getNumberFromIntArray(int[]c,int a,int b) {
        try {
            int idx = a / b;
            int element = c[idx];
            System.out.println(element);

        }catch (ArithmeticException e){
            System.err.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e.getMessage());
        }finally {
            System.out.println("Cut the connection with the element");
        }

    }
}
