package A15;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist01 {
    public static void main(String[] args) {

        //it is impossible to create an array without declaring the number of elements in it
        //This is not good because it is impossible to decide number of elements you will put into an array at the beginning
        // Arrays are fixed in length this creates issues in implementation, that is why java created another structure which is
        //flexible. Its names are Arraylist
        //Why did not java remove Arrays after creating Arraylists?
        //Because i)Arrays are so fast ii) Arrays use memory so less
        //Arrays use primitive nad references in data types but Arraylist use..
        //How to create an Arraylist
        //Arraylist do not accept primitive data types in elements, you have to use non primitive data types
        ArrayList<Integer>m=new ArrayList<>();
        //How to print Arraylists
        System.out.println(m);
        //How to elements int a Arraylist(List)
        m.add(12);
        System.out.println(m);
        m.add(12);
        m.add(5);
        m.add(9);
        m.add(1,3);
        System.out.println(m);
        ArrayList<Integer>n=new ArrayList<>();
        n.add(99);
        n.add(88);
        n.add(77);
        System.out.println(n);
        m.addAll(2,n);
        System.out.println(m);

        //Create an Integer Arraylist and change the odd ones to 11
        ArrayList<Integer>p=new ArrayList<>();
        p.add(23);
        p.add(24);
        p.add(12);
        p.add(9);
        p.add(3);

        for (Integer w:p){
            if (w%2!=0){
                p.set(p.indexOf(w),11);
            }
        }
        System.out.println(p);

        //Example: create a string arraylist and remove the elements contain a

        ArrayList<String >r=new ArrayList<>();
        r.add("Miami");
        r.add("New York");
        r.add("Tampa");
        r.add("Virginia");
        System.out.println(r);

        for (int i=0;i<r.size();i++){
            if (r.get(i).contains("a")){
                r.remove(r.get(i));
                i--;
            }
        }
        System.out.println(r);



    }
}
