package A7;

public class whileLoops02 {
    public static void main(String[] args) {

        //Example:type code to print even integers from 13 to 8 on the console.
        int i=13;

        while (i>7){
            if (i%2==0){
                System.out.println(i+" ");
            }
            i--;
        }
        //Infinite loop is a risk in using loops
        // If you forget to type inrement or decrement part in loops you will have infinite loop and java will stuck over there


        //Example: Type code to check if a given integer is palindrome or not

        int k=121;
        String m=String.valueOf(k);
        String reversed="";
        int n=m.length()-1;
        while (n>=0){
            reversed=reversed+m.charAt(n);
            n--;
        }
        System.out.println(reversed);
        if (m.equals(reversed)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }

    }
}
