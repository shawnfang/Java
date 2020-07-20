package com.study.dictionary;

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
            for (int i = 0; i < count; i++) {
                if (dictionary[i].getKey() == key) {
                    keyIndex = i;
                    break;
                }else {
                    keyIndex = count;
                }
            }
        }
        return keyIndex;
    }

    @Override
    public V add(K key, V value) {
        V result = null;
        int keyIndex = localIndex(key);
        if (count == 0) {
            dictionary[count] = new Entry<K, V>(key,value);
            result = value;
        }else if (key != null && value != null && getSize()!=max_capacity) {
                dictionary[keyIndex] = new Entry<K, V>(key,value);
                result = value;
        }
        System.out.println(dictionary[count].getKey()+" "+dictionary[count].getValue());
        count++;
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
        arraryDictionary.add(2,"b");
        arraryDictionary.add(3,"c");
        arraryDictionary.add(4,"d");
        System.out.println(arraryDictionary.remove(1));
        arraryDictionary.add(1,"x");
        System.out.println(arraryDictionary.getValue(3));
        System.out.println(arraryDictionary.contain(5));
    }
}
