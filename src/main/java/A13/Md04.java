package A13;

import java.util.Arrays;

public class Md04 {
    public static void main(String[] args) {

        int [][] a=new int[3][2];
        a[0][0]=5;
        a[0][1]=12;
        a[1][0]=444;
        a[1][1]=2222;
        a[2][0]=78;
        a[2][1]=55;

        System.out.println(Arrays.deepToString(a));
        System.out.println(a[1][1]);
        String[][] students = {{"Ali,", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Burhan"}};
        System.out.println(students.length);
        int toplam=0;
        for (String[] w : students) {
            toplam = toplam + w.length;
        }
        System.out.println(toplam);

        //Ornek 2: Yukaridaki students Array’inde icinde “m” olan isimleri console’a yazdiriniz
        for (String[] w:students){
            for (String k:w){
                if (k.contains("m")){
                    System.out.println(k);
                }
            }

        }

    }
}
