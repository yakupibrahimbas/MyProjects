package A14;

import java.util.ArrayList;
import java.util.List;

public class Arraylist03 {
    public static void main(String[] args) {

        //[Javav]==> jav

        List<Character>a=new ArrayList<>();
        a.add('j');
        a.add('a');
        a.add('v');
        a.add('a');
        a.add('v');
        System.out.println(a);
        List<Character>b=new ArrayList<>();
        for (Character w:a){
            if (!b.contains(w)){}
            b.add(w);
        }
        System.out.println(b);

    }
}
