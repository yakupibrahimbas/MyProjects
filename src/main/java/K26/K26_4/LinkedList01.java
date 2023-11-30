package K26.K26_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
    public static void main(String[] args) {


        LinkedList<String> list=new LinkedList<>();
        list.add("Memocan");
        list.add("Ahmo");
        list.add("Onuy");
        list.add("Tubi");
        list.add("Alo");
        list.add("Rıdo");
        list.add("Rıdo");
        list.add("Rıdo");
        System.out.println(list);

        list.add(1,"Zafer");
        System.out.println(list);
        list.addFirst("Emraj");
        System.out.println(list);
        list.addLast("ibro");
        System.out.println(list);
        list.remove("Emraj");
       // System.out.println(list);
       // list.remove()
        list.remove("Rıdo");
        System.out.println(list);
        list.removeLastOccurrence("ibro");
        System.out.println(list);
        System.out.println(list.peek());

     /*   Retrieves, but does not remove, the head (first element) of this list.
                Returns:
        the head of this list, or null if this list is empty
        Since:
        1.5  */
        System.out.println(list.poll());
        System.out.println(list);

     /*   Retrieves and removes the head (first element) of this list.
                Returns:
        the head of this list, or null if this list is empty
        Since:
        1.5

*/

        System.out.println(list.element());
        System.out.println(list);

        System.out.println(list.pop());
        System.out.println(list);
    }
}
