package A11;

public class ForLoop08 {
    public static void main(String[] args) {

        //28.587 ----> ondalık kısımdaki rakamlarin toplamini bulun.


        double num=28.527;

        String sNum=String.valueOf(num);
        String decimalPart=sNum.split("[.]")[1];
        int intDecimalPart=Integer.valueOf(decimalPart);
        int sum=0;
        for (int i=intDecimalPart;i>0;i=i/10){
            sum=sum+i%10;
        }
        System.out.println(sum);
    }
}
