package A12;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {
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

        System.out.println("*****************");

        int[] arr = {2, 1, 7, 6};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[1, 2, 6, 7]

        System.out.println(Arrays.binarySearch(arr,2));//1
        System.out.println(Arrays.binarySearch(arr,7));//3
        System.out.println(Arrays.binarySearch(arr,3));//-3
        System.out.println(Arrays.binarySearch(arr,9));//-5

        System.out.println("*****************");

        String[] str = {"A", "C", "B", "D"};
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));//[A, B, C, D]

        System.out.println(Arrays.binarySearch(str,"A"));//0
        System.out.println(Arrays.binarySearch(str,"C"));//2
        System.out.println(Arrays.binarySearch(str,"E"));//-5
        System.out.println(Arrays.binarySearch(str,"G"));//-5
    }
}
