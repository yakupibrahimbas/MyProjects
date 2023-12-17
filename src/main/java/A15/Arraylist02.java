package A15;

import java.util.ArrayList;
import java.util.List;

public class Arraylist02 {
    public static void main(String[] args) {

        //Create an integer list which has repeated elements than remove the duplicates
        //[javac]==> [javc]
        List<Character> a=new ArrayList<>();
        a.add('J');
        a.add('a');
        a.add('v');
        a.add('a');
        a.add('c');

        List<Character>b=new ArrayList<>();
        for (Character w:a){
            if (!b.contains(w)){
                b.add(w);
            }
        }
        System.out.println(b);


    }
}
