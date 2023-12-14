package A13;

public class Arrays16 {
    public static void main(String[] args) {

        String[] cities={"Miami","Alabama","Ohamo","Tampa","Orlando"};
        int sum=0;
        for (String w:cities){
            sum=sum+w.length();
        }
        System.out.println(sum);
    }
}
