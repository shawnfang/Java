package com.study.dictionary;

import javax.swing.plaf.IconUIResource;
import java.util.Iterator;

public class ArraryDictionary<K,V> implements DictionaryInterface<K,V> {
    private Entry<K,V>[] dictionary;
    private int max_capacity = 10;
    private int count;

    public ArraryDictionary(){
        dictionary = new Entry[max_capacity];
        count = 0;
    }

    @Override
    public V add(K key, V value) {
        V result = null;
        Entry<K, V> entry = new Entry<K, V>(key,value);
        if (key != null && value != null && getSize()!=max_capacity) {
            if (count!=max_capacity) {
                dictionary[count].setKey(entry.getKey());
                dictionary[count].setValue(entry.getValue());
                result = entry.getValue();
                count++;
            }
        }
        return result;
    }

    @Override
    public V remove(K key) {
        return null;
    }

    @Override
    public V getValue(K key) {
        return null;
    }

    @Override
    public boolean contain(K key) {
        return false;
    }

    @Override
    public Iterator<K> getKeyIterator() {
        return null;
    }

    @Override
    public Iterator<V> getValueIterator() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getSize() {
        return count;
    }

    @Override
    public void clear() {

    }

    public static void main(String[] args) {
        ArraryDictionary<Integer,String> arraryDictionary = new ArraryDictionary<Integer, String>();
    }
}
