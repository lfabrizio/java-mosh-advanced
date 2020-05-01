package com.fabrizio;

import org.w3c.dom.ls.LSOutput;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;


public class StreamsDemo  {
    public static void show() {
        var movies = List.of (
        new Movie("a", 10),
                new Movie("a", 10),
                 new Movie("b", 20)
        );
        movies.stream()
                .map(Movie::getLikes) // stream off integers
            .distinct() // stream integer
        .forEach (System.out::println);

        }

}