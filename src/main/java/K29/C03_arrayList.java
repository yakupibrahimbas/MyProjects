package K29;

import java.util.ArrayList;

public class C03_arrayList {
    public static void main(String[] args) {


        ArrayList<Integer>myList=new ArrayList<>();
        myList.add(5);
        myList.add(10);
        myList.add(15);
        myList.add(25);
        myList.add(35);
        int sum=0;
        for (Integer a:myList) {
            if (a%2==0){
                sum+=a;
            }

        }

        }

    }

