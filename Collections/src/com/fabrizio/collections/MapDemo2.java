package com.fabrizio.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.HashMap;

public class MapDemo2 {
    public static void show(){
        var c1 = new Customer("a", "e1");
        var c2 = new Customer("b", "e2");
        Map<String, Customer> map = new HashMap<>();
        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);

//        var exists = map.containsKey("e1");
//        System.out.println(exists);

        for (var customer : map.values())
            System.out.println(customer);
    }
}
