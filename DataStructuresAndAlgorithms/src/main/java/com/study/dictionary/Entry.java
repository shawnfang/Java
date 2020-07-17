package com.study.dictionary;

public class Entry<S,T> {
    private S key;
    private T value;

    public Entry(S searchKey,T dataValue){
        key = searchKey;
        value = dataValue;
    }
    public S getKey() {
        return key;
    }

    public T getValue() {
        return value;
    }

    public void setKey(S key) {
        this.key = key;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
