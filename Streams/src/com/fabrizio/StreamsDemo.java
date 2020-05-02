package com.fabrizio;

import org.w3c.dom.ls.LSOutput;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;


public class StreamsDemo {
    public static void show() {
        var movies = List.of(
                new Movie("a", 10),
                new Movie("a", 20),
                new Movie("b", 30)
        );
        // reducers
        Integer sum = movies.stream()
                .map(m -> m.getLikes())
                .reduce(0, Integer::sum);

        System.out.println(sum);

    }
}