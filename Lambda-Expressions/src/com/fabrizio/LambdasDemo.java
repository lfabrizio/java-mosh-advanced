package com.fabrizio;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

//Lamdas standalone function without belonging to a class
public class LambdasDemo {
    public static void show() {
        // "key: value"
        // first: "key = value"
        // second: "{key=value}"
        Function<String, String> replaceColon = str -> str.replace(":", "=");
        Function<String, String> addBraces = str -> "{" + str + "}";
    // declarative programming
        var result = replaceColon
                .andThen(addBraces)
                .apply("key:value");

        result = addBraces.compose(replaceColon).apply("key:value");
        System.out.println(result);
    }
}
