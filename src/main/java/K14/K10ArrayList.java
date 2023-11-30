package K14;

import java.util.ArrayList;

public class K10ArrayList {
    public static void main(String[] args) {
        ArrayList<String> groups=new ArrayList<>();
        groups.add("Metallica");
        groups.add("Iron Man");
        groups.add("Guns' n Roses");
        groups.add("Black Sabbath");
        System.out.println("0.indeks:"+groups.get(0));
        System.out.println("1.indeks:"+groups.get(1));
        System.out.println("2.indeks:"+groups.get(2));

        groups.remove("Iron Man");
        for (int i=0;i<groups.size();i++){
            System.out.println("Eleman:"+groups.get(i));
        }
    }
}
