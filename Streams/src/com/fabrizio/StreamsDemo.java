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
            Predicate<Movie> isPopular = m -> m.getLikes() > 10;
                movies.stream()
                .filter(isPopular)
                .forEach(m -> System.out.println(m.getTitle()));

    }
}