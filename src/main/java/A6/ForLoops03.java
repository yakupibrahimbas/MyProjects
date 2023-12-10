package A6;

public class ForLoops03 {
    public static void main(String[] args) {

        //Example: Type code to reverse a String (Interview question)
        //Alexa==axelA
    String a="Yakup";
    String reverse="";
    for (int i=a.length()-1;i>=0;i--){
        reverse=reverse+a.charAt(i);

    }
        System.out.println(reverse);

    //Example: Type code to find the sum of the digits in an integer
        // 587==>5+8+7=20
        int numara=123;
        int toplam=0;
        for (int i=numara;i>0;i=i/10){
            toplam=toplam+i%10;
        }
        System.out.println(toplam);



        //Example
        String t="Hello";
        String unique="";
        for (int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if (t.indexOf(ch)==t.lastIndexOf(ch)){
                unique=unique+ch;
            }
        }
        System.out.println(unique);

    }
}
