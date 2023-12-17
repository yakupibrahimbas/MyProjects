package A17;

public class Pbv {
    public static void main(String[] args) {

        int x=3;
        int y=5;
        add(x,y);
    }
    public static int add (int a,int b){
        return a+b;
    }

}
//pas by value kopyayla calisir
//Java pass by value kullanir yani orjinal degeri degistirmesine musade etmmez
//java methodlara deger yollarken orjinal degerin kopyasini olusturur
//java method kopya uzerinde degisiklik yapar, boylece orjinal deger korunmuş olur
//pass by reference de method a reference yollanir
//reference adres demektir.adres yollaninca method adresi kullanarak orjinal degere ulasir