package com.fabrizio;

import java.util.List;

public class StreamsDemo {
    public static void show(){
        var movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 25)
        );

        movies.stream()
                .map(movie -> movie.)
    }
}
