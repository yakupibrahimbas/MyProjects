package K18;

public class K05 {
    public static void main(String[] args) {

        String str1="Ali";
        String str2="Veli";
        String str3="Ridvan";
        String str4="Husnu";
        String str5="Alaattin";
        String str6="Murat";
        String str7="Aleksander";
        enUzunKelimeYazdir(str1,str2,str3,str4, str5,str6,str7);

    }
    private static void enUzunKelimeYazdir(String...str){
        String enUzunKelime="";
        for(String each:str){
            if (each.length()>=enUzunKelime.length()){
                enUzunKelime=each;
            }
        }
        System.out.println(enUzunKelime);
    }
}
