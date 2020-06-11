package com.study.linearlist;

public interface BagAdtList<T> {
    public boolean add(T newEntry);
    public boolean add(int newPosition,T newEntry);
    public Object remove(int givePosition);
    public void clean();
    public boolean replace(int givenPosition,T newEntry);
    public Object getEntry(int givenPosition);
    public boolean contains(T anEntry);
    public int getSize();
    public boolean isEmpty();
    public boolean isFull();
    public void display();
    public BagAdtList unionSet(BagAdtList<T> newList);
    public BagAdtList intersect(BagAdtList<T> newList);
    public BagAdtList except(BagAdtList<T> newList);
}
