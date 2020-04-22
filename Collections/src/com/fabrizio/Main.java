package com.fabrizio;
import com.fabrizio.GenericList;
public class Main {

    public static void main(String[] args) {
	var list = new GenericList<String>();
	var iterator = list.iterator();
	// [a, b, c]
	while (iterator.hasNext()) {
	    var current = iterator.next();
        System.out.println(current);
    }
    }
}
