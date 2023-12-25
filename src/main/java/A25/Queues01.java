package A25;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues01 {
    public static void main(String[] args) {

        Queue<String>depo=new LinkedList<>();
        depo.add("Sut");
        depo.add("Et");
        depo.add("Yumurta");
        depo.add("Kaymak");
        depo.add("Peynir");
        System.out.println(depo);
        depo.remove();
        System.out.println(depo);
        System.out.println(depo.peek());
        depo.clear();
        System.out.println(depo);
        System.out.println(depo.poll());

        Queue<String>wareHouse=new PriorityQueue<>();
        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Egg");
        wareHouse.add("Orange");
        wareHouse.add("Tomatoes");
        System.out.println(wareHouse);
        Deque<String >d=new LinkedList<>();


    }
}
