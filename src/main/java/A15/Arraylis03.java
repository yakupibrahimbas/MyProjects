package A15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Arraylis03 {
    public static void main(String[] args) {

        List<Integer>p=new ArrayList<>();
        p.add(20);
        p.add(15);
        p.add(14);
        p.add(11);
        p.add(19);
        System.out.println(p);
        Collections.sort(p);
        System.out.println(p);

        int minimum=p.get(1)-p.get(0);
        for (int i=1;i<p.size();i++){
           minimum= Math.min(minimum, p.get(i)-p.get(i-1));
        }
        System.out.println(minimum);

    }
}
