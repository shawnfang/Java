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

    private int localIndex(K key){
        int keyIndex = -1;
        if (count != 0) {
            for (int i = 0; i < dictionary.length; i++) {
                if (key.equals(dictionary[i].getKey())) {
                    return i;
                }
            }
        }
        return keyIndex;
    }

    @Override
    public V add(K key, V value) {
        V result = null;
        int repeatIndex = localIndex(key);
        if (repeatIndex != -1) {
            dictionary[repeatIndex].setValue(value);
            result = value;
        }else if (key != null && value != null && getSize()!=max_capacity) {
                dictionary[count] = new Entry<K, V>(key,value);
                result = value;
                count++;
        }
        System.out.println(dictionary[0].getKey());
        System.out.println(dictionary[0].getValue());
        System.out.println(count);
        return result;
    }

    @Override
    public V remove(K key) {
        V result = null;
        int keyIndex = localIndex(key);
        if (keyIndex != -1) {
            result = dictionary[keyIndex].getValue();
            dictionary[keyIndex] = dictionary[getSize()-1];
            dictionary[getSize()-1] = null;
            count--;

        }
        return result;
    }

    @Override
    public V getValue(K key) {
        V result = null;
        int keyIndex = localIndex(key);
        if (keyIndex != -1) {
            result = dictionary[keyIndex].getValue();
        }
        return result;
    }

    @Override
    public boolean contain(K key) {
        boolean containResult = false;
        int keyIndex = localIndex(key);
        if (keyIndex != -1 && dictionary[keyIndex] != null) {
            containResult = true;
        }
        return containResult;
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
        boolean isEmptyResult = false;
        if (count == 0) {
            isEmptyResult = true;
        }
        return isEmptyResult;
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
        arraryDictionary.add(1,"a");
        arraryDictionary.add(1,"b");
    }
}
