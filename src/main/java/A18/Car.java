package A18;

public class Car {
    //Variable lar olusturalim

    /*/
    Constructor classtan object üretmemize yarayan code blocklaridir
    constructor gozle gorulmez otomatik java tarafindan verilir
    //default constructor olarak adlandirilir. Car(){}
    //siz kendi constructorunuzu olusturdugunuzda java default constructoru siler
    //bir calssda farkli parametreler kullanarak istedigimiz kadar constructor olusturabiliriz
    //constructor nasil olusturulur
    //access modifier+class ismi+()+{}
    //interview sorusu .. methodlar ile constructorlar arasindaki fark nedir
    //methodlarda retrurn type olur construclarda olmaz
    //methodlar yaptiklari ise gore isimlendirilirler. constructorlar ise her zaman class ismi ile isimlkendirilirler
    //methodlar bir aksiyon yapmak icin olusturulurlar, constructorlar ise object olusturmak icindir
    //mmethod isimleri kucuk hartfle baslar consturctor isimleri buyuk harfle baslar
    //


     */
    String make="Honda";
    String model="Accord";
    int year=2023;
    boolean hybrid=true;
    Car (String make,String model,int year,boolean hybrid){
        this.make=make;
        this.model=model;
        this.year=year;
        this.hybrid=hybrid;
    }

    public Car(String  make,String  model){
        this.make=make;
        this.model=model;
    }


    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public void hareket(){
        System.out.println("Honda hizli hareket eder");
    }
    public void dur(){
        System.out.println("Honda guvenli bir sekilde durur");
    }


    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}
