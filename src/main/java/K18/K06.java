package K18;

public class K06 {
    public static void main(String[] args) {
        String str1="Ahmet";
        String str2="Mehmet";
        String str3="Mert";
        String str4="Muharrem";
        String str5="Adolh";
        enUzun(str1,str2,str3,str4,str5);
    }
    private static void enUzun(String ...str){
        String enUzun="";
;
    for (String each:str){
        if (each.length()>=enUzun.length()){
            enUzun=each;
        }
    }
        System.out.println(enUzun);
    }
}
