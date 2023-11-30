package K28;

import java.util.*;

public class Queue01 {
    public static void main(String[] args) {

        //Queue da ilk giren ilk cikar
        //first in first out
        Queue<String>depo=new LinkedList<>();
        depo.add("sut");
        depo.add("et");
        depo.add("yumurta");
        depo.add("peyir");
        //remove() kuyrugun basindaki elemani siler.

        System.out.println(depo);
        String s=depo.remove();
        System.out.println(depo);

        System.out.println(depo.peek());
        depo.clear();
        System.out.println(depo);
        //clear() metodu tum ogeleri kaldirir.
        System.out.println(depo.poll());
        //poll() kuyrugun basindaki ogeyi kuyruktan kaldirir. boylece kuyruk bos bir duruma gelir

        //element() kuyrugun basidnaki ogeyi dondurur ancak kuyruk bossaa bir istisna firlatir.

       // System.out.println(depo.element());

        //priorityQueue hastanelerdeki acil servis ornek olarka verilebilir.


        PriorityQueue<String >acilSirasi=new PriorityQueue<>();
        //r-priorityQueue ya eleman nasil eklenir?
        //add belirtilen ogeyi kuyruga ekler.

        acilSirasi.add("M");
        acilSirasi.add("A");
        acilSirasi.add("B");
        acilSirasi.add("C");
        acilSirasi.add("D");
        System.out.println(acilSirasi);
        
        //Deque,FIFO first in first out veya last in first out olarak siralannabili
        //Deque hem basindan hemde sonundan eleman eklemeye izin veren bir yapidir.

        Deque<String>elma=new LinkedList<>();
        
        elma.add("M");
        elma.add("A");
        elma.add("B");
        elma.add("C");
        elma.add("D");

        System.out.println(elma);

        //constructor Linkedlist oldugu icin insert sirasina gore verir.

        //addFirst() Deque nin basina bir oge ekler.
        elma.addFirst("Ali");
        System.out.println(elma);
        for (String w:elma){
            System.out.println(w);
        }
        System.out.println("---------");
        // addLast(): deque nin sonuna bir oge ekler.donus turu yine voiddir.

        //ArrayDeque nasil olusturulur?
        //ArrayDeque basta ve sonra hizli ekleme/cikarma islemleri icin idealdir.
        //ArrayDeque LinkedList
        ArrayDeque<String >ad=new ArrayDeque<>();
        ad.addFirst("Alexander Vucunic");
        System.out.println(ad);
        ad.addLast("son");
        System.out.println(ad);


        //eleman cikarma
       String ilk= ad.removeLast();
        System.out.println(ad);

    }
}
