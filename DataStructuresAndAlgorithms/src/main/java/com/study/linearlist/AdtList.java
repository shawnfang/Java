package com.study.linearlist;

public interface AdtList {
    public boolean add(Object newEntry);
    public boolean add(int newPosition,Object newEntry);
    public Object remove(int givePosition);
    public void clean();
    public boolean replace(int givenPosition,Object newEntry);
    public Object getEntry(int givenPosition);
    public boolean contains(Object anEntry);
    public int getLength();
    public boolean isEmpty();
    public boolean isFull();
    public void display();
}
