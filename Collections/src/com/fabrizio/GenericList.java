package com.fabrizio;

import java.util.ArrayList;

// will replace T's with the constraints which is Number
    public class GenericList <T> {
    public ArrayList<T> items = new ArrayList<>();
        private int count;

        public void add(T item){
            items[count++] = item;
        }
        public T get(int index) {
            return items[index];
        }
    }


