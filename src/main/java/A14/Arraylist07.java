package A14;

public class Arraylist07 {
    public static void main(String[] args) {

        String []cities={"Miami","Alabama","Jackson","Tampa","Orlando"};
        int sum=0;
        for (String w:cities){
            sum=sum+w.length();
        }
        System.out.println(sum);

        //arrays can contain just primitive data types and references

    }
}
