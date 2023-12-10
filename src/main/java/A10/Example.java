package A10;

public class Example {
    public static void main(String[] args) {

        for (int i=1;i<5;i++){
            System.out.println("Hi");
        }
        System.out.println("*********");

        for (int i=20;i>2;i--){
            System.out.println(i);
        }
        System.out.println("***********");
        for (int i=3;i<21;i++){
            if (i%2==0){
                System.out.println(i);

            }
        }
        System.out.println("***********");

        for (int i=28;i>3;i--){
            if (i%2==1){
                System.out.println(i);
            }
        }
        System.out.println("**************");
        String s="Tramvay";
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (ch=='a'){
                break;

            }
            System.out.println(ch);
        }
        System.out.println("********");
       /* for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                continue;
            } else {
                System.out.print(ch);//P12?A
            }
        } */


        String s1= "Pwd12?Ab";
        for (int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
//
            if (){

            }
        }


    }
}
