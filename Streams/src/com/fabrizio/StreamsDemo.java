package com.fabrizio;

import org.w3c.dom.ls.LSOutput;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;


public class StreamsDemo {
    public static void show() {
        var movies = List.of(
                new Movie("a", 10),
                new Movie("a", 20),
                new Movie("b", 30)
        );
        // peeking elements
        movies.stream()
                .filter(m -> m.getLikes() > 10)
                .peek(m -> System.out.println("filetered: " + m.getTitle()))
                .map(Movie:: getTitle)
                    .forEach(System.out::println);
    }
}