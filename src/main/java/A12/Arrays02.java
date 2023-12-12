package A12;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        String [] kitplar=new String[3];
        System.out.println(Arrays.toString(kitplar));

        int [] sayilar=new int[5];
        System.out.println(Arrays.toString(sayilar));

        String []isimler=new String[5];
        isimler[0]="Adnan";
        isimler[1]="Veli";
        isimler[2]="Mehmet";
        isimler[3]="Huseyin";
        isimler[4]="Melih";
        System.out.println(Arrays.toString(isimler));

        // Ornek1: String bir array olusturun, icine 5 tane elaman ekleyin, tum elemanlarin
        //icerdigi karakter sayilari toplamini ekrana yazdirin

        String[] cities=new String[5];
        cities[0]="trabzon";
        cities[1]="sivas";
        cities[2]="rize";
        cities[3]="adana";
        cities[4]="kahramanmaraş";

        int toplam=0;
        for (int i=0;i<cities.length;i++){
            toplam=toplam+cities[i].length();
        }
        System.out.println(toplam);
//2. yol: for each loop(enhanced - gelistirilmis loop)

        /*
        for (DataType variable: Array ya da collections){
        //calisacak kodlar
         }*/

        int sum = 0;

        for (String w : cities) {
            sum = sum + w.length();
        }
        System.out.println(sum);

        //Ornek 1: int turunde ages isminde bir Array olusturunuz, icine 6 tane eleman yerlestiriniz,
//      bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz

        int []ages=new int[6];
        ages[0]=20;
        ages[1]=30;
        ages[2]=40;
        ages[3]=50;
        ages[4]=60;
        ages[5]=70;

        //sort() methodu
        //sort() methodu sayilari kucukten buyuge siralar (ascending order)
        //String data tiplerini alfabetik siralar (alphabetical order)
        //ascending order + alphabetical order = natural order
        //sort() methodu Array elemanlarini natural order’a gore siralar

        //Arrays.sort(ages);
        //System.out.println(Arrays.toString(ages));//[15, 19, 20, 23, 32, 44]

        //System.out.println(ages[0]+ ages[ages.length-1]);//59
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));
        System.out.println(ages[0]+ages[ages.length-1]);

        //2.yol: Math.min ve Math.max kullanacagiz

        int minimum = ages[0];
        int maximum = ages[0];


        for (int w : ages) {
            minimum = Math.min(minimum, w);
            maximum = Math.max(maximum, w);
        }
        System.out.println(minimum);//  15
        System.out.println(maximum);// 44
        System.out.println(minimum+maximum);//59

        System.out.println("*******************");
        int minimum2=ages[0];
        int maximum2=ages[0];
        for (int w2:ages) {
            minimum2=Math.min(minimum2,w2);
            maximum2=Math.max(maximum2,w2);
            System.out.println(minimum2);
            System.out.println(maximum2);
            System.out.println(minimum2+maximum2);
        }
        System.out.println("************");

    }
}
