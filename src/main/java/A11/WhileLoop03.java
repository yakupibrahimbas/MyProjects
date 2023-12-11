package A11;

public class WhileLoop03 {
    public static void main(String[] args) {

        //Palindrome 121---121 tersinden de  aynı olan sayılar

        int k=121;
        String s=String.valueOf(k);
        String reversed="";
        int n=s.length()-1;
        while (n>=0){
            reversed=reversed +s.charAt(n);
            n--;
        }
        System.out.println(reversed);
        if (s.equals(reversed)){
            System.out.println("Palindromdur");
        }else {
            System.out.println("Palindrom degildir.");
        }

    }
}
