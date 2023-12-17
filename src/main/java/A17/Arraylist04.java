package A17;

import java.util.ArrayList;

public class Arraylist04 {
    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(133);
        list.add(14);
        list.add(15);
        list.add(18);
        list.add(20);
        list.add(21);
        System.out.println(list);
        for (Integer w:list){
            if (w%2!=0){
                list.set(list.indexOf(w),11);
            }
        }
        System.out.println(list);


    }
}
