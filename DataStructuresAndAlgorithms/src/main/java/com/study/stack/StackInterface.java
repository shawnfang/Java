package com.study.stack;

public interface StackInterface<T> {
    public boolean cleanStack();
    public boolean popStack();
    public boolean pushStack(T newEntry);
    public T getTopStack();
    public boolean emptyStack();
    public int getLengthStack();
    public boolean destroyStack();
}
