package com.fabrizio;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

//Lamdas standalone function without belonging to a class
public class LambdasDemo {
    public static void show() {
        Function<String, Integer> map = str -> str.length();
       var length = map.apply("Sky");
        System.out.println(length);
    }
}
