package A11;

public class ForLoop03 {
    public static void main(String[] args) {


       int sum=0;
       for (int i=578;i>0;i=i/10){
           sum=sum+i%10;
       }
        System.out.println("sum="+ sum);


    }
}
