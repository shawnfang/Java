package com.study.linklist;

import com.study.linearlist.AdtList;

public class NewLinkList<T> implements AdtList<T>,LinkListInterface<T> {
    public boolean add(T newEntry) {
        return false;
    }

    public boolean add(int newPosition, T newEntry) {
        return false;
    }

    public Object remove(int givePosition) {
        return null;
    }

    public void clean() {

    }

    public boolean replace(int givenPosition, T newEntry) {
        return false;
    }

    public Object getEntry(int givenPosition) {
        return null;
    }

    public boolean contains(T anEntry) {
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

    public void addFirst(Object newEntry) {

    }

    public void addLast(Object newEntry) {

    }

    public Object removeFirst() {
        return null;
    }

    public Object removeLast() {
        return null;
    }

    public Object getFirst() {
        return null;
    }

    public Object getLast() {
        return null;
    }

    public void moveToEnd() {

    }
}
