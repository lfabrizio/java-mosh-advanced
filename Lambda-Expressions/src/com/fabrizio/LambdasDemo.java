package com.fabrizio;

import java.util.List;
import java.util.function.*;

//Lamdas standalone function without belonging to a class
public class LambdasDemo {
    public static void show() {
        // a, b -> a + b -> square
        BinaryOperator<Integer> add = (a, b) -> a + b;
        Function<Integer, Integer> square = a -> a * a;
       var result = add.andThen(square).apply(1, 2);
        System.out.println(result);
    }
}
