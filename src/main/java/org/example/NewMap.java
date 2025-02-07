package org.example;

import java.util.HashMap;
import java.util.Map;

public class NewMap {
    public void getNewMap() {
        Map<String, String> map = new HashMap<>();
        map.put("a1", "Madara Uchiha");
        map.put("a2", "Sosuke Aizen");
        map.put("a3", "Donquixote Doflamingo");
        map.put("a4", "Ryomen Sukuna");

        System.out.println(map);
    }
}
