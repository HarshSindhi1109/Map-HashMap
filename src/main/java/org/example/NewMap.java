package org.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class NewMap {
    public void getNewMap() {
        Map<Code, String> map = new HashMap<>();
        map.put(new Code("S11", "L01"), "Madara Uchiha");
        map.put(new Code("S11", "L01"), "Sosuke Aizen");
        map.put(new Code("S11", "L01"), "Donquixote Doflamingo");
        map.put(new Code("S11", "L01"), "Ryomen Sukuna");

//        System.out.println(map);

        for(Code key : map.keySet()) {
            System.out.println("Key: "+ key.toString() + " Value: "+ map.get(key));
        }
//
//        for (Map.Entry<String, String> entry : map.entrySet()) {
//            System.out.println("Key: "+ entry.getKey() +" Value: " + entry.getValue());
//        }

//        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
//
//        while (iterator.hasNext()) {
//            Map.Entry<String, String> temp = iterator.next();
//            System.out.println("Key: "+ temp.getKey() +" Value: " + temp.getValue());
//        }
    }
}
