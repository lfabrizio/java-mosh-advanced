package com.fabrizio;

import java.util.List;
import java.util.function.*;

//Lamdas standalone function without belonging to a class
public class LambdasDemo {
    public static void show() {
        UnaryOperator<Integer> square = n -> n * n;
        UnaryOperator<Integer> increment = n -> n + 1;

        var result = increment.andThen(square).apply(1);
        System.out.println(result);
    }
}
