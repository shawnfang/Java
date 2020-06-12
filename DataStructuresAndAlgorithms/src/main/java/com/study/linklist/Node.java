package com.study.linklist;

class Node<T> {
    private T data;
    private Node next;

    private Node(T dataPortion){
        data = dataPortion;
        next = null;
    }
    private Node(T dataPortion,Node nextNode){
        data = dataPortion;
        next = nextNode;
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

    public void setNext(Node next) {
        this.next = next;
    }
}
