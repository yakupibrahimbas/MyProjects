package K27;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist01 {
    public static void main(String[] args) {

        //Collectionlar objectleri depolamak ve islemek icin kullanilan bir calasslar ve interfaceler kumesidir

        ArrayList<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();


        LinkedList<String> myList = new LinkedList<>();
        myList.add("Ayse");
        myList.add("Ali");
        myList.add("Veli");
        myList.add("Fatma");
        System.out.println(myList);
        System.out.println(myList);
        myList.add(1, "Zeynep");
        System.out.println(myList);

        System.out.println(myList);
        myList.addFirst("Trabzon");
        myList.addLast("Huseyin");
        myList.remove("Ali");
        System.out.println(myList);
        myList.remove("zeynep");
        System.out.println(myList);
        myList.add("Yusuf");
        myList.add(3, "Yusuf");
        System.out.println(myList);
        myList.removeFirstOccurrence("Yusuf");
        System.out.println(myList);
        myList.removeLastOccurrence("Yusuf");
        System.out.println(myList);
        String s = myList.peek();
        System.out.println(s);
        System.out.println(myList);
        myList.element();
        System.out.println(myList);
        String a = "A C";
        System.out.println(a.hashCode());


    }
}
