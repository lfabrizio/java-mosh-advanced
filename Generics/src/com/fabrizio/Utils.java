package com.fabrizio;

public class Utils {
    public static <T extends Comparable> T max(T first, T second){
        return (first.compareTo(second) < 0) ? second : first;
    }
    public static <K, y> void print(K key, y value) {
        System.out.println(key + "=" + value);
    }
}
