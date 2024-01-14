package O14;

public class AsalSayi {
    public static void main(String[] args) {

    int number=59;
        int remainder=number %2;
        System.out.println(remainder);
        if (number%2==0||number%3==0||number%4==0||number%5==0||number%6==0||number%7==0||number%8==0||number%9==0||number%10==0||number%11==0||number%12==0||number%13==0||number%14==0){
            System.out.println(number+" asal sayi degildir");
        }else {
            System.out.println("asal sayidir");
        }

        int number2=70;
        int remainder2=number2 %2;
        System.out.println(remainder2);
        boolean isPrime=true;
        if (number2<2){
            System.out.println("Gecersiz sayi");
        }

        for (int i=2;i<number2;i++){
            if (number2%i==0){
                isPrime=false;
            }
        }
        if (isPrime){
            System.out.println("sayi asaldir");
        }else {
            System.out.println("sayi asal degildir");
        }
//uygulamadak sistemsel hatalara bug denir
    }
}
