package com.fabrizio.collections;

import java.util.*;

public class SetDemo {
    public static void show() {
        Set<String> set1 =
                new HashSet<>(Arrays.asList("a", "b", "c"));
        Set<String> set2 =
                new HashSet<>(Arrays.asList("b", "c", "d"));

//        // union operation combo of two sets
//        set1.addAll(set2);
//        System.out.println(set1);
//        // intersection, will retain/keep all of set 2 remove set1
//        set1.retainAll(set2);
//        System.out.println(set1);
        // difference= what is different remove duplicates return the rest
        set1.removeAll(set2);
        System.out.println(set1);
    }
}
