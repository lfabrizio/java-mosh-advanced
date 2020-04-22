package com.fabrizio;
import com.fabrizio.GenericList;
public class Main {

    public static void main(String[] args) {
	var list = new GenericList<String>();
	list.items[0] = "a";
        System.out.println(list.items.length);
    }
}
