package A17;

public class MethodOverloading01 {
    public static void main(String[] args) {

        //method overloading javada aynı isimde farklı işler yapan methodlar olusturmak demek
        add(3,5);

    }
    public static void add(int a,int b){
        System.out.println(a+b);
    }
    public static void add(double a,double b){
        System.out.println(a+b);
    }
    public static void add(double a,int b){
        System.out.println(a+b);
    }
    public static void add(int a,double b){
        System.out.println(a+b);
    }
    public static void add(int a,int b,int c){
        System.out.println(a+b+c);
        //isim+parametre=method signature
        //Method overloading yapilirken method ismi degistririlmez
        //Method overloading yaparkebn parametreler degistririlir
        //java icin ismi ve parametre method signature olarak adlandirilir
        //method overloading olusturulurken return type degistirmenin hicbir etkisi yoktur
        //static herkes tarafından yapılan degisiklikler gorulebilen
        //static methodlar overload edilebilir
        //overloading yapmak icin method ismini degistirmeden method signaturei degistiriririz, dolayisiyle method signature
        // degistirildiginde yeni bi methıd olusturulmus...
    }
}
