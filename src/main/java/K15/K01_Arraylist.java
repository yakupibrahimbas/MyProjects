package K15;

import java.util.ArrayList;

public class K01_Arraylist {
    public static void main(String[] args) {

        ArrayList <String> list=new ArrayList<String>();

        list.add("Bahadir");
        list.add("Gulsen");
        list.add("Omer");
        list.add("Buse");

        list.add(1,"Ebru");
        list.remove(2);


        list.get(0);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("----------------");
        System.out.println(list);
    }
}
