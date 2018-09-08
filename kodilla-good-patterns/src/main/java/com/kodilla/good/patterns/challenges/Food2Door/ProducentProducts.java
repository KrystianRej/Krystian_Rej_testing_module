package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;
import java.util.Map;

public interface ProducentProducts {
    Map<String, Integer> productsList();

    default  Map<String, String> certification(Map<String, Integer> products){
        Map<String, String> certificateMap = new HashMap<>();
        for(Map.Entry<String, Integer> entry: products.entrySet()){
            certificateMap.put(entry.getKey(), "Alabama4561");
        }
        return certificateMap;
    }
}
