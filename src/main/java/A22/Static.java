package A22;

public class Static {
    //static ,bir degisken veya bir methodun classa ait oldugunu ve classin bir ornegi olusturulmadan kullanilşabilecegini belirtmek icin kullanilan  birt anahtar kelimedir
    //staticler tum objectler icin ortak elemandir

    public static String stdName="Ali Can";
    public int age=18; //non-static
    public static void staticMethod(){
        System.out.println("Ben static bir methodum");
    }
    public void nonStaticMethod(){
        System.out.println("Ben non-static methodum");
    }



}
