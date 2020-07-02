package com.study.stack;

public class StackByLinkList<T> implements StackInterface<T> {
    private class Node<T>{
        private T data;
        private Node next;

        private Node(T dataPortion){
            data = dataPortion;
            next = null;
        }
        private Node(T dataPortion, StackByLinkList.Node nextNode){
            data = dataPortion;
            next = nextNode;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getNext() {
            return next;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }

    private Node top = null;

    public boolean cleanStack() {
        return false;
    }

    public boolean popStack() {
        return false;
    }

    public boolean pushStack(T newEntry) {
        top.data = newEntry;

        return false;
    }

    public T getTopStack() {
        return null;
    }

    public boolean emptyStack() {
        return false;
    }

    public int getLengthStack() {
        return 0;
    }

    public boolean destroyStack() {
        return false;
    }
}
