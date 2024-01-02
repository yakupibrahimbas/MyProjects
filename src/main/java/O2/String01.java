package O2;

public class String01 {
    public static void main(String[] args) {

        String s1="Kod1 yazarak2 ogrenilir3";
        //Regular Expression(regex):Belli turdeki karakterleri secebilmemize yarar
        //1-\\d==> regular expression-- tum rakamlari kasteder
        //2-\\D Tum rakam disi karakterler
        //3-\\w A->Z a->z 0->9
        //4-\\W A->Z a->z 0->9 --> disindaki hersey
        //5-==> space
        System.out.println(s1.replaceAll("\\d", "*"));
        System.out.println(s1.startsWith("ko"));
        System.out.println(s1.endsWith("3"));
    }
}
