package A6;

public class ForLoops02 {
    public static void main(String[] args) {
        //Example: Type code to print even integers from 5 to 16 on the console

        for (int i=5 ;i<17 ;i++){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
//Example2:
        for (int i=16;i>5;i--){
            if (i%2==1){
                System.out.println(i);
            }
        }
//Example3: write except to 7
        for (int i=5;i<17;i++){
            if (i!=7){
                System.out.println(i);
            }
        }

        for (int i=5;i<17;i++){
            if (i==7){
                continue; //continue keyword is used to skip some values in a loop
                //continue keyword takes you to increment /decrement part in the loop directly
            }
            System.out.print(i+" ");
        }
        System.out.println("************");
        //Example 3:Print String characters oen by one on the console.If you see z stop printing
        //"I like extra effort"==>
        String s="I am extra person";
        for (int i=0; i<=s.length();i++){
            if (s.charAt(i)=='x'){
                break;
            }
            System.out.print(s.charAt(i));

        }

    }
}
