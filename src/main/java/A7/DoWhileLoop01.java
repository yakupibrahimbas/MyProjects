package A7;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        //while loop
        //do while loop

        int i=1;
        while(i<1){
            System.out.println("While loop");
            i++;
        }

        int k=1;
        do {
            System.out.println("Do While Loop");
            k++;

        }while (k<1);

        //Not:Zero Execution is possible for while-loop ,but it is not pssible for do while loop
        //Not2:do while loop body is executed at leaast once

        //Example:Do-While---   Reverse a String by using do while loop
        String s="Alex";
        String reversed="";
        int t=s.length()-1;
        do {
            reversed=reversed+s.charAt(t);
            t--;
        }while (t>=0);
        System.out.println(reversed);

        //Example: Type code to find the sum of the integers from 7 to 10
        // 7 and 10 ==>7+8+9+10=34

        //1.way- for-loop
      int sum=0;
      for (int y=7;y<11;y++){
          sum=sum+y;
      }
        System.out.println(sum);

      //while loop
        int sum2=0;
        int n=7;
        while (n<11){
            sum2=sum2+n;
            n++;
        }
        System.out.println(sum2);

        //3.way do while loop

        int sum3=0;
        int r=7;
        do {
            sum3=sum3+r;
            r++;
        }while (r<11);
        System.out.println(sum3);
    }
}
