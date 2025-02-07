package org.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class NewMap {
    public void getNewMap() {
        Map<String, String> map = new HashMap<>();
        map.put("a1", "Madara Uchiha");
        map.put("a2", "Sosuke Aizen");
        map.put("a3", "Donquixote Doflamingo");
        map.put("a4", "Ryomen Sukuna");

        System.out.println(map);

//        for(String key : map.keySet()) {
//            System.out.println("Key: "+ key + " Value: "+ map.get(key));
//        }
//
//        for (Map.Entry<String, String> entry : map.entrySet()) {
//            System.out.println("Key: "+ entry.getKey() +" Value: " + entry.getValue());
//        }

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> temp = iterator.next();
            System.out.println("Key: "+ temp.getKey() +" Value: " + temp.getValue());
        }
    }
}
