package com.study.linearlist;

public class AdtArraryList<T> implements  AdtList {

    private T[] entry;
    private int length;
    private static final int Max_Size = 50;

    public AdtArraryList(){
        this(Max_Size);
    }

    public AdtArraryList(int max_size) {
        length = 0;
        T[] list = (T[]) new Object[Max_Size];
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

    public int getLength() {
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
