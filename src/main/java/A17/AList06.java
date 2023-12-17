package A17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AList06 {
    public static void main(String[] args) {

        //From a given list find all pairs whose sum is a given number
        //
        List<Integer> m=new ArrayList<>();
        m.add(4);
        m.add(6);
        m.add(5);
        m.add(-10);
        m.add(8);
        m.add(5);
        m.add(20);
        System.out.println(m);

        for (int i=0;i<m.size();i++){
            for (int k=i+1;k<m.size();k++){
                if (m.get(i)+m.get(k)==10){
                    System.out.println(m.get(i)+"-"+ m.get(k));
                }
            }
        }

        //short syntax to create a list and add element into
        List<Integer>n= Arrays.asList(4,6,5,-10,8,5,20);
        System.out.println(n);
        //n.remove(6);
        //n.add(11);
        //n.clear();

    }
}