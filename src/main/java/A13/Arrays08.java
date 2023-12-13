package A13;

public class Arrays08 {
    public static void main(String[] args) {

        String []cities =new String[3];
        cities[0]="bayburt";
        cities[1]="sivas";
        cities[2]="trabzon";

        int totalChar=0;

        for (int i = 0; i < cities.length; i++) {//Arraylerde length method degildir

            totalChar=totalChar+cities[i].length();//burdaki length methoddur.
        }
        System.out.println(totalChar);

        //for each loop
        //for loop taki artırma eksiltme olaylarini dusunmeyz

        //2 2. yol(enhanced- gelistirilmis loop)

        int sum=0;
        for (String w:cities){
            sum=sum+w.length();
        }
        System.out.println(sum);






    }
}
