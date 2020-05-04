package com.fabrizio;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class StreamsDemo {
    public static void show() {
        var movies = List.of(
                new Movie("a", 10, Genre.ACTION),
                new Movie("a", 20, Genre.THRILLER),
                new Movie("b", 30, Genre.COMEDY)
        );
         var result = movies.stream()
                .collect(Collectors.groupingBy(
                        Movie::getGenre,
                        Collectors.mapping(Movie::getTitle, Collectors.joining(","))));
        System.out.println(result);

    }
}