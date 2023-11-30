package K15;

import java.util.Scanner;

public class K04InterviewQuestion {
    public static void main(String[] args) {
        //String num="23*3" tarzında verilen matematiksel işlemi dinamik hale getirerek doğru sonucu veren bir metod yazınız. "23*3" yerine "4/2" yazarsak da doğru şekilde sonuç vermesiniz beklemekteyiz

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen yapmak istediginiz islemin sembolunu sisteme giriniz");
        char islem=input.next().charAt(0);
        if (islem=='*'||islem=='/'||islem=='+'||islem=='-'){
            System.out.println("Lutfen ilk sayiyi sisteme giriniz");
            int sayi1=input.nextInt();
            System.out.println("Lutfen ikinci sayiyi giriniz");
            int sayi2=input.nextInt();
            switch (islem){
                case '*':
                    System.out.println(sayi1+"*"+sayi2+"="+(sayi1*sayi2));break;
                case'/':
                    System.out.println(sayi1+"/"+sayi2+"="+(sayi1/sayi2));break;
                case '+':
                    System.out.println(sayi1+"+"+sayi2+"="+(sayi1+sayi2));break;
                case '-':
                    System.out.println(sayi1+"-"+sayi2+"="+(sayi1-sayi2));break;
            }

        }else
            System.out.println("Hatali giris");
    }
}
