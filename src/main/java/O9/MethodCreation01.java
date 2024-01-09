package O9;

public class MethodCreation01 {
    public static void main(String[] args) {
        System.out.println(add(3, 5));
        System.out.println(concatenate("Merhaba ", "Dunya"));
    }
    public static int add(int a,int b){
        return a+b;
        //Method olustururken void disinda bir return type kullanirsaniz method bodysi icinde en son satirda return keyword kullanmalisiniz
        //Aksi tajdirde compile time error aliriz
        //Void disinda kullanilabilecek return typelar tum primitive ve tum non primitive lerdir.
        //iki tane stringi concatenate eden ve string return eden bir method olusturunuz
        //bu method u main method icinden cagirip stringi ekrana yazdiriniz

    }
    public static String concatenate(String s,String t){
        return s.concat(t);
    }
}
