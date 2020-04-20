package com.fabrizio;

import javax.xml.crypto.dsig.keyinfo.KeyValue;

public class KeyValuePair<K, V> {
    private K key;
    private V value;

    public KeyValuePair(K key, V Value) {
        this.key = key;
        this.value = value;
    }
}
