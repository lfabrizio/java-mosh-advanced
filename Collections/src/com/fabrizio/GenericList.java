package com.fabrizio;

import java.util.ArrayList;
import java.util.Iterator;

// will replace T's with the constraints which is Number
    public class GenericList <T> implements Iterable<>{
    private T[] items = (T[]) new Object[10];
        private int count;

        public void add(T item){
            items[count++] = item;
        }
        public T get(int index) {
            return items[index];
        }

    @Override
    public Iterator iterator() {
        return null;
    }
}


