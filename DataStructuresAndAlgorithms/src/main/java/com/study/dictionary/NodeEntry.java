package com.study.dictionary;

public class NodeEntry<S,T> {
    private S key;
    private T value;
    private NodeEntry next;

    public NodeEntry(S searchKey,T dataValue){
        key = searchKey;
        value = dataValue;
        next = null;
    }

    public NodeEntry(S searchKey,T dataValue,NodeEntry nodeNext){
        key = searchKey;
        value = dataValue;
        next = nodeNext;
    }
    public void setValue(T value) {
        this.value = value;
    }

    public void setKey(S key) {
        this.key = key;
    }

    public void setNext(NodeEntry next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public S getKey() {
        return key;
    }

    public NodeEntry getNext() {
        return next;
    }
}
