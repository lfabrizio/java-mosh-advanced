package com.fabrizio;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class StreamsDemo {
    public static void show() {
        IntStream.rangeClosed(1, 5)
                .forEach(System.out::println);


    }
}