package A21;

public class StringBuilder01 {
    public static void main(String[] args) {

        StringBuilder sb2=new StringBuilder(3);//constuctor kismina int bir deger yazilirsa capacity degisir
        System.out.println(sb2.append("Alis"));
        System.out.println(sb2.capacity()); // default(3)*2+2=8 oldu
        StringBuilder sb1=new StringBuilder("Java is easy");
        System.out.println(sb1.reverse());
        System.out.println(sb1.deleteCharAt(1));
        sb1.delete(0,2);
        System.out.println(sb1);
       String str= sb1.toString().toUpperCase();
        System.out.println(str);



    }
}
