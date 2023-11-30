package K28;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Maps01 {
    public static void main(String[] args) {

        HashMap b=new HashMap<>();
        b.put("Turkey","Ankara");
        b.put("Italy","Rome");
        b.put("France","Paris");
        Set s=b.entrySet();
        Iterator i=s.iterator();
        while (i.hasNext()){
            Map.Entry item=(Map.Entry)i.next();
            System.out.println(item.getKey()+" =>"+item.getValue());
        }
    }
}
