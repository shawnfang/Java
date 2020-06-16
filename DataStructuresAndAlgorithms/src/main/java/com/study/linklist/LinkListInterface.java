package com.study.linklist;

public interface LinkListInterface<T> {
    public void addFirst(Object newEntry);
    public void addLast(Object newEntry);
    public Object removeFirst();
    public Object removeLast();
    public Object getFirst();
    public Object getLast();
    public void moveToEnd();

}
