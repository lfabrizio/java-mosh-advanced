package com.fabrizio;

import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void show() {
        Stream.of(List.of(1, 2, 3), List.of(4, 5, 6));
////        .flatMap(list -> list.stream())
//        .forEach(n -> System.out.println(n);
    }
}