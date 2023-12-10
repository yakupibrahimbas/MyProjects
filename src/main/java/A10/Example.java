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
//12
            if (ch>='a'&&ch<='z'){
                continue;
            }else {
                System.out.println(ch);
            }
        }
        System.out.println("***********");
      /*  //ornek 3: Verilen bir String'i tersden yazan kodu yaziniz. Meshur bit interwiew sorusu
        //      String t = "Java"; ==> 'avaJ'
        //son index her zaman length() - 1
        String t = "Java";
        String ters = ""; //ters cevrilmis yeni datayi burada saklayacagiz

        for (int i = t.length()-1; i >= 0; i--) {
            ters = ters + t.charAt(i);  //ters = ters + t.substring(i,i+1); de calisir
        }
        System.out.println(ters);//avaJ */
        System.out.println("*********");

        String t="Java";
        String ters="";


        for (int i=t.length()-1;i>=0;i--){
            ters=ters+t.charAt(i);
        }
        System.out.println(ters);
        System.out.println("----------");

        int sum = 0;
        for (int i = 578; i > 0; i = i / 10) {
            sum = sum + i % 10;
        }
        System.out.println("sum = " + sum); //sum = 20



    }
}
