package A12;

import java.util.Arrays;

public class Arrays07 {
    public static void main(String[] args) {

        //Ornek 1: Bir int array olusturun ve 5 ten kucuk olan elemanlari yazdirin.
//      [12, 3, -3, 5, 23] ==> 3, -3

        int[] numbers = {12, 3, -3, 5, 23};//[12, 3, -3, 5, 23]
        System.out.println(Arrays.toString(numbers));

        for (int w : numbers) {
            if (w < 5) {
                System.out.print(w + " ");//3 -3
            }
        }
        //Ornek 2: Specific bir elemanin array’de olup olmadigini anlamak icin gereken kodu yaziniz
        //binarySearch() methodu var olan elemanlar icin size o elemanin indexini verir
        //binarySearch() methodunu sort() kullanmadan kullanmayiniz
        //binarySearch() methodu olmayan elemanlar icin size negatif tamsayi verir
        // “-” ==> isaretinin anlami eleman yok demektir
        String names[] = {"A", "T", "K", "E", "B"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));//[A, B, E, K, T]
        int result = Arrays.binarySearch(names, "K");//1. index'te
        System.out.println(result);

        int[] arr = {2, 1, 7, 6};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[1, 2, 6, 7]

        System.out.println(Arrays.binarySearch(arr,2));//1
        System.out.println(Arrays.binarySearch(arr,7));//3
        System.out.println(Arrays.binarySearch(arr,3));//-3
        System.out.println(Arrays.binarySearch(arr,9));//-5

        String[] str = {"A", "C", "B", "D"};
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));//[A, B, C, D]

        System.out.println(Arrays.binarySearch(str,"A"));//0
        System.out.println(Arrays.binarySearch(str,"C"));//2
        System.out.println(Arrays.binarySearch(str,"E"));//-5
        System.out.println(Arrays.binarySearch(str,"G"));//-5

        //Ornek 3: Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.
        //String s = "Java is easy. Learn Java earn money";

        String s = "Java is easy. Learn Java earn money";
        String[] words = s.split(" ");

        System.out.println(Arrays.toString(words)); //[Java, is, easy., Learn, Java, earn, money]

        System.out.println(words.length); //7

        //Ornek 4: [0, 2, 3, 0, 12, 0] arrayinde tum sifirlari sona yerlestiriniz.(Interwiew sorusu)
        //     [0, 2, 3, 0, 12, 0] ==> [2, 3, 12, 0, 0, 0]
        int[] arr1 = {0, 2, 3, 0, 12, 0};
        int[] yeniArr = new int[arr1.length];
        System.out.println(Arrays.toString(arr1));//[0, 2, 3, 0, 12, 0]
        System.out.println(Arrays.toString(yeniArr));//[0, 0, 0, 0, 0, 0]


        int ilkIndex = 0;
        for (int w : arr1) {
            if (w != 0) {// w 'ya yuklenen sayi 0 a esit degilse
                yeniArr[ilkIndex] = w;
                ilkIndex++; // sifira esit degilse yeni arr'nin ilk index'ine gelen sayiyi yukle
            }
        }
        System.out.println(Arrays.toString(yeniArr));
    }
}
