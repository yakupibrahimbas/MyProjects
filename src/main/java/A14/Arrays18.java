package A14;

public class Arrays18 {
    public static void main(String[] args) {
      /*  String []cities=new String[5];
        cities[0]="Bayburt";
        cities[1]="Rize";
        cities[2]="Artvin";
        cities[3]="Giresun";
        cities[4]="Samsun"; */

        String []cities={"Miami","Alabama","Tampa","Orlando","Seveho"};
        int sum=0;
        for (String w:cities){
            sum=sum+w.length();
        }
        System.out.println(sum);
    }
}
