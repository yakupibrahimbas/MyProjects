package A13;

import java.util.Arrays;

public class MultidimensionalArrays01 {
    public static void main(String[] args) {

        //Javada cok boyutlu dizi multidimensional arrays
        //en yaygin ornegi iki boyutlu dizilerdir
        //ikiş boyutlu bir dizi satir ve sutunlardan olusur, tipki bir excell tablosu gibi

        //nasil olusturulur?

        int [][] a=new int[3][2];
        a[0][0]=5;
        a[0][1]=12;
        a[1][0]=444;
        a[1][1]=2222;
        a[2][0]=78;
        a[2][1]=55;

        System.out.println(Arrays.toString(a)); //toString kullanilmaz -- deepTo String kullanilir

        System.out.println(Arrays.deepToString(a));

        //Multidimesnsional arrayde spesifik bir eleman nasil yazdirilir?
        System.out.println(a[1][1]);
        System.out.println(Arrays.toString(a[2]));
        //Kisa yoldan mda nasil olusturulur?
        String [][]students={{"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Burhan"}};
        System.out.println(Arrays.deepToString(students[2]));

        int toplam=0;
        for (String []w:students){
            toplam=toplam+ w.length;

        }
        System.out.println(toplam);

        System.out.println("--------");


        for (String []w:students ) {
            for (String k:w) {
                if (k.contains("m")){
                    System.out.println(k);
                }
            }
        }

    }
}
