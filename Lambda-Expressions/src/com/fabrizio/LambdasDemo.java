package com.fabrizio;
//Lamdas standalone function without belonging to a class
public class LambdasDemo {
    public static String prefix = "-";

    public static void show(){
        greet(message -> System.out.println( prefix+ message));
        };

    public static void greet(Printer printer) {
        printer.print("Hello World");
    }
}
