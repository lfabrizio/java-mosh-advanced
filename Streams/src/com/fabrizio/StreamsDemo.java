package com.fabrizio;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void show() {
        var movies = List.of (
        new Movie("a", 10),
        new Movie("b", 20)
        );
        movies.stream()
                .skip(20)
                .limit(5)
                .forEach(m -> System.out.println(m.getTitle()));
}