package A25;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class LinkedList01 {
    public static void main(String[] args) {

        //arraylistler eleman ekleme ve silmede basarisizdirlar
        //arraylistlerde search islemi kolay yapilir cunku indexler adres gibidir
        //linkedlistlerde search islemi zor yapilir cunku linkedlistler index kullanmazlar



       // ArrayList<String> list1=new ArrayList<>();
       // List<String >list2=new ArrayList<>();

        LinkedList <String>list=new LinkedList<>();
        list.add("Mehmet");
        list.add("Ahmet");
        list.add("Onur");
        list.add("Kubra");
        list.add("Tuba");
        list.add("Duygu");
        System.out.println(list);
        list.add(1,"zafer");
        System.out.println(list);
        list.addFirst("Onur");
        System.out.println(list);
        list.addLast("Ibrahim");
        System.out.println(list);
        System.out.println(list.peek());
        System.out.println(list.poll());
        //peek()list boş oldugunda null verir element() ise hata verir
        System.out.println(list.pop());
        //pol ile pop ikiside ilk elemani siler ve size verir.



    }
}
