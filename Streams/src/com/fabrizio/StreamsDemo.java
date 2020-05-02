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
        // reducers

       var result = movies.stream()
                .max(Comparator.comparing(Movie::getLikes))
               .get();

        System.out.println(result.getTitle());

    }
}