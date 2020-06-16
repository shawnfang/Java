package com.study.linklist;

public class ImproveNode<T> {
    private T data;
    private ImproveNode next;

    public ImproveNode(T dataPortion){
        data = dataPortion;
        next = null;
    }
    public ImproveNode(T dataPortion, ImproveNode nextNode){
        data = dataPortion;
        next = nextNode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ImproveNode getNextNode() {
        return next;
    }

    public void setNextNode(ImproveNode next) {
        this.next = next;
    }
}