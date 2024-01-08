package O8;

public class VariableTypes01 {
    int i=10;
    String s;
    boolean b;
    double d;
    char c;
    /*
    Main methodun ve urettigimiz diger nethodlarin dışında (alt veya ust) classin icinde olusturulan variablelara instance variable denir.
    Instance variablelar object olusturulurken olusturulur ve her objeye bu variablelear monte edilir
    Instance variableleara deger atamasi yapsanizda olur yapmasanizda olur
    Yularida goruldugu gibi bazisina deger atanabilir bazisina atanamaz
    Bir variable a deger atamasi yapma initialize olarak adlandirilir
    i variable i initialize edildi digerleri edilmedi...
    initialize edilmeyen instance variableler iicin java kendisi deger atamasi yapar
    Javanin kendisinin verdigi degerlere default degerler denir
    byte,short,int,long icin default value 0  dır.
    float double icin default 0.0 dir
    char icin default value falsedir
    boolean icin default value falsedir
    String icin default value null dur

     */


    /*
    Local Variable
    1-main methodun veya olusturduhumuz baska bir methodun icindekilere local variable denir
    2-Java local variablelara deger atamasi yapmaz
    Local variablelara deger atamasi yapmak zorundayiz. aksi takdirde o varaibleyi kullanamayiz
    Java Local variablelar icin default value atamasi yapmaz.

     */


    public static void main(String[] args) {
        int a=13;
        a++;

    }
}
