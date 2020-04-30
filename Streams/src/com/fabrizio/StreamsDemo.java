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
                .dropWhile(m -> m.getLikes())
                .forEach(m -> System.out.println(m.getTitle()));
}