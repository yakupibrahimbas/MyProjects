package K28;

import java.util.HashMap;

public class Maps03 {
    public static void main(String[] args) {

        HashMap<String ,String >h=new HashMap<>();
        h.put("Fransa","Paris");
        h.put("Italy","Rome");
        h.put("England","London");
        h.put("England","London");
        for (String str:h.keySet()){
            System.out.println(str);
        }
        h.remove("Italy");
        System.out.println(h);
    }
}
