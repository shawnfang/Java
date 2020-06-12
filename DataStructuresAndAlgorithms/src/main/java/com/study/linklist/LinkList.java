package com.study.linklist;

import com.study.linearlist.AdtList;

public class LinkList<T> implements AdtList<T> {
    private Node firstNode;
    private int length;

    public LinkList(){
        clear();
    }
    public final void clear(){
        firstNode = null;
        length = 0;
    }

    public boolean add(Object newEntry) {
        return false;
    }

    public boolean add(int newPosition, Object newEntry) {
        return false;
    }

    public Object remove(int givePosition) {
        return null;
    }

    public void clean() {

    }


    public boolean replace(int givenPosition, Object newEntry) {
        return false;
    }

    public Object getEntry(int givenPosition) {
        return null;
    }

    public boolean contains(Object anEntry) {
        return false;
    }

    public int getSize() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean isFull() {
        return false;
    }

    public void display() {

    }
}
