package A14;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist01 {
    public static void main(String[] args) {
        //Arraylist dinamik bir dizi yapisidir.
        //Arraylistler memoryde arraylerden daha cok yer kaplar
        //arrayler olusturulurken bastan eleamn sayisini belirtmek zorundayşz ama arraylsilerde boyle bir zorunluluk yoktuyr
        //Arraylist nasil olusturulur?
        ArrayList<Integer> ages=new ArrayList<>();

        ages.add(9);
        ages.add(12);
        ages.add(5);
        System.out.println(ages);
        //listte araya eleman ekelemk icin index numarasi yazilir
        ages.add(1,28);
        System.out.println(ages);//ekleme yapılınca üstüne yazmıyor oteleme yapıyor

        ages.add(3,7);
        System.out.println(ages);
        ages.add(11);
        System.out.println(ages);

        ArrayList<Integer>newAges=new ArrayList<>();
        newAges.add(1);
        newAges.add(2);
        newAges.add(3);
        ages.addAll(newAges);
        System.out.println(ages);
        ages.addAll(0,newAges);
        System.out.println(ages);
        //size() metodu listenin boyutunu dondurur
        //size methodu int dondurur
        int elemanSayisi=ages.size();
        System.out.println(elemanSayisi);
        //get() methodu listenin belirli bi konumundaki elemana erismek icin kullanilir
        //set methodu degistirir
        ages.set(1,25);
        System.out.println(ages);

    }
}
