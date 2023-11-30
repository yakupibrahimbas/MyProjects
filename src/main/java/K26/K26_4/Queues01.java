package K26.K26_4;

import java.util.*;

public class Queues01 {
    public static void main(String[] args) {
        Queue<String > depo=new LinkedList<>();
        depo.add("sut");
        depo.add("et");
        depo.add("yumurta");
        depo.add("peynir");
        System.out.println(depo);
        depo.remove();
        System.out.println(depo);
        System.out.println(depo.peek());
        depo.clear();
        System.out.println(depo);
        System.out.println(depo.poll());
       // System.out.println(depo.element());

        Queue<String>wareHouse=new PriorityQueue<>();
        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Egg");
        wareHouse.add("Orange");
        wareHouse.add("Tomatoes");
        wareHouse.add("Banana");
        System.out.println(wareHouse);

        Deque<String>d=new LinkedList<>();
        d.add("Milk");
        d.add("Meat");
        d.add("Egg");
        d.add("Orange");
        d.add("Tomatoes");
        d.add("Banana");
        System.out.println(d);

    }
}
