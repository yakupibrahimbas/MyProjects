package A17;

import java.util.ArrayList;

public class Arraylist01 {
    public static void main(String[] args) {
        ArrayList<String > r=new ArrayList<>();
        r.add("Manisa");
        r.add("Nigde");
        r.add("Tokat");
        r.add("Van");
        r.add("Hakkari");
        r.add("Sirnak");
        r.add("Adiyaman");
        System.out.println(r);
        for (int i=0;i<r.size();i++){
           if (r.get(i).contains("d")){
               r.remove(i);
               i--;
           }
        }
        System.out.println(r);


    }
}
