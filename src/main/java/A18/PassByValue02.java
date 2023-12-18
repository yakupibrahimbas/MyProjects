package A18;

public class PassByValue02 {
    public static void main(String[] args) {
        int x=3;
        int y=5;
        add(x,y);

    }
    public static int add(int a,int b){
        return a+b;
    }
}
