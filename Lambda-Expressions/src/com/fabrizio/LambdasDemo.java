package com.fabrizio;

import java.util.List;

//Lamdas standalone function without belonging to a class
public class LambdasDemo {
    public static void show() {
        List<Integer> list = List.of(1, 2, 3);
        // Imperative Programming(for, if/else, switch/case)
        for (var item : list)
            System.out.println(item);

            // Declarative Programming
        list.forEach(item -> System.out.println(item));
    }
}
