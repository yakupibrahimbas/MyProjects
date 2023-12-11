package A11;

public class ForLoop01 {
    public static void main(String[] args) {

        String kucukHarf="123PWDabcd";
        for (int i=0;i<kucukHarf.length();i++){

            char ch=kucukHarf.charAt(i);
            if (ch>='a'&&ch<='z'){
                continue;
            }else {};
            System.out.println(ch);
        }


    }
}
