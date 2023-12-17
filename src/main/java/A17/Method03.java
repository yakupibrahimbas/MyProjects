package A17;

public class Method03 {
    public static void main(String[] args) {

       int carpmaSonucu= multiply(3,5,10);
        System.out.println(carpmaSonucu);

        int carpTopla=carpTopla(2,3,5);
        System.out.println(carpTopla);

        print("Ali Can");

    }//main method kapanis parantezi

    //Ornek: 2 sayiyi carpma islemi yapan bir method olusturunuz

    protected static int multiply(int a, int b,int c){
        return a*b*c;
    }

    //Ornek2:verilen 3 sayidan ilk ikisini carpan ve sonucu 3. sayi ile toplayan methodu olusturunz ve kullaniniz

    private static int carpTopla(int a,int b,int c){
        return a*b+c;
    }

//Ornek3: girilen bir kelimeyi ekrana yazdiran bir mnethod olusturup kullaniniz

    public static void print(String str){
        System.out.println(str);
    }
    //note : metyhod olusturmada kullanilan variablelar parametreler  olarak adlandırılır
    //method call da kullanilan degerlere de argumanlar denir



}
